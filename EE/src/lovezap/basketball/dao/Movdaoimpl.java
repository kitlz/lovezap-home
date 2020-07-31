package lovezap.basketball.dao;

import lovezap.basketball.tab.movies;
import util.JdbcUtil;

import java.util.List;

/**
 * Created by lenovo on 2020/7/22.
 */
public class Movdaoimpl implements moviedao {
    @Override
    public List<movies> list() {
        List<movies> list= JdbcUtil.executeQuery("select id,movie,time from movies",movies.class);
        return list;
    }

    @Override
    public int add(movies one) {
        int i =JdbcUtil.executeUpdate("insert into movies(id,movie,time) values(?,?,?)",one.getId(),one.getMovie(),one.getTime());
        return i;
    }

    @Override
    public movies getid(String id) {
        movies t= JdbcUtil.getOne("select id,movie,time from movies where id=?",movies.class,id);
        return t;
    }

    @Override
    public int update(movies m) {
        int i =JdbcUtil.executeUpdate("update movies set movie=?,time=? where id = ?",m.getMovie(),m.getTime(),m.getId());
        return i;
    }

    @Override
    public int del(String id) {
        int i =JdbcUtil.executeUpdate("delete from movies where id = ?",id);
        return i;
    }
}
