package lovezap.basketball.dao;

import lovezap.basketball.tab.ackind;
import util.JdbcUtil;

import java.util.List;

/**
 * Created by lenovo on 2020/7/23.
 */
public class ackinddaoimpl implements ackinddao {
    @Override
    public List<ackind> list() {
        List<ackind> list= JdbcUtil.executeQuery("select activity,times from ackind",ackind.class);
        return list;
    }

    @Override
    public ackind getid(String activity) {
        ackind t= JdbcUtil.getOne("select activity,times from ackind where ackind=?",ackind.class,activity);
        return t;}

    @Override
    public int increment(String activity) {
        return JdbcUtil.executeUpdate("update ackind set times=times+1 where activity = ?",activity);
    }

    @Override
    public int decrement(String times) {
        return JdbcUtil.executeUpdate("update ackind set times=times-1 where activity = ?",times);
    }
}
