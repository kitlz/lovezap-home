package lovezap.basketball.dao;

import lovezap.basketball.tab.basketball;
import util.JdbcUtil;

import java.util.List;

/**
 * Created by lenovo on 2020/7/20.
 */
public class Basdaoimpl implements basketballdao {
    @Override
   public List<basketball> list(){
        List<basketball> list = JdbcUtil.executeQuery("select id,name,play,happy from basketball",basketball.class);
        return list;}

    @Override
    public int add(basketball basadd) {
        int i =JdbcUtil.executeUpdate("insert into basketball(id,name,play,happy) values(?,?,?,?)",basadd.getId(),basadd.getName(),basadd.getPlay(),basadd.getHappy());
        return i;
    }

    @Override
    public basketball getid(String id) {
        basketball ball= JdbcUtil.getOne("select id,name,play,happy from basketball where id=?",basketball.class,id);
        return ball;
    }


    @Override
    public int update(basketball basadd) {
        int i =JdbcUtil.executeUpdate("update basketball set name=?,play=?,happy=? where id = ?",basadd.getName(),basadd.getPlay(),basadd.getHappy(),basadd.getId());
        return i;
    }

    @Override
    public int del(String id) {
        int i =JdbcUtil.executeUpdate("delete from basketball where id = ?",id);
        return i;
    }

}

