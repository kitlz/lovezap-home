package lovezap.basketball.dao;

import lovezap.basketball.tab.myactivities;
import util.JdbcUtil;

import java.util.List;

/**
 * Created by lenovo on 2020/7/22.
 */
public class myactivitiesdaoimpl implements myactivitiesdao {

    @Override
    public List<myactivities> list() {
        List<myactivities> list= JdbcUtil.executeQuery("select items,id,state,towrite from myactivities",myactivities.class);
        return list;
    }

    @Override
    public int add(myactivities one) {
        int i =JdbcUtil.executeUpdate("insert into myactivities( items,id,state,towrite) values(?,?,?,?)",one.getItems(),one.getId(),one.getState(),one.getTowrite());
        return i;
    }

    @Override
    public myactivities getbyid(String id) {
        myactivities t= JdbcUtil.getOne("select id,items,state,towrite from myactivities where id=?",myactivities.class,id);
        return t;
    }

    @Override
    public int update(myactivities m) {
        int i =JdbcUtil.executeUpdate("update myactivities set items=?,state=?,towrite=? where id = ?",m.getItems(),m.getState(),m.getTowrite(),m.getId());
        return i;
    }

    @Override
    public int del(String id) {
        int i =JdbcUtil.executeUpdate("delete from myactivities where items = ?",id);
        return i;
    }
}
