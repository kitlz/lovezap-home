package util;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/lovezap?useUnicode=true&characterEncoding=utf8";
    private static final String USER = "root";
    private static final String PWD = "ZAP575963";
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL,USER,PWD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    private static void close(ResultSet rs,PreparedStatement pstmt,Connection con) {
        try {
            if(rs != null)
                rs.close();
            close(pstmt, con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static void close(PreparedStatement pstmt,Connection con) {
        try {
            if(pstmt != null)
                pstmt.close();
            if(con != null)
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     *  通用的增删改方法 适用于 任何一个表的增删改
     *  方法的参数
     *      1 String sql  语句
     *      2 语句中的参数 (问号)
     *          问题 有几个问号 不确定 问号的数据类型也不确定
     *          Object[] List<Object> Object...
     *
     */
    public static int executeUpdate(String sql,Object... params){
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        int result = 0;
        try {
            pstmt = con.prepareStatement(sql);
            if(params != null) {
                for (int i = 0; i < params.length; i++) {
                    pstmt.setObject(i + 1, params[i]);
                }
            }
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(pstmt,con);
        }
        return result;
    }

    /**
     * 此方法是利用反射的原理  把类中的属性 当做数据库中的字段
     *
     * 要求属性名 和 数据库中的字段名 必须一致
     *
     *
     *
     * */
    public static <T> List<T> executeQuery(String sql,Class<T> clz,Object... params) {
        List<T> list = new ArrayList<>();
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = con.prepareStatement(sql);
            if(params != null) {
                for(int i = 0; i < params.length; i++) {
                    pstmt.setObject(i + 1, params[i]);
                }
            }
            rs = pstmt.executeQuery();
            while (rs.next()) {
                // 先创建一个对象
                T t = clz.newInstance();
                // 读数据库的值 为 t对象的属性赋值
                // 获取到 t对象的所有属性
                Field[] fields = clz.getDeclaredFields();
                for(Field field : fields) {
                   String fieldname = field.getName();
                   // 把属性名 当做字段名 从 rs中 获取数据
                    try{
                        Object value = rs.getObject(fieldname);
                        field.setAccessible(true);
                        field.set(t,value);
                    }catch (Exception ex) {
                        System.out.println(fieldname + "在数据表中没有这个字段");
                    }
                }
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }finally {
            close(rs,pstmt,con);
        }
        return list;
    }

    public static <T> T getOne(String sql,Class<T> clz,Object... params) {
        List<T> list = executeQuery(sql,clz,params);
        if(list != null && list.size() > 0)
            return list.get(0);
        return null;
    }
}
