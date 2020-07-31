package lovezap.basketball.dao;

import lovezap.basketball.tab.activity;
import util.JdbcUtil;

import java.util.List;

/**
 * Created by lenovo on 2020/7/22.
 */
public class actdaoimpl implements actdao {
    @Override
    public List<activity> list() {
        List<activity> list= JdbcUtil.executeQuery("select items,id from activity",activity.class);
        return list;
    }

    @Override
    public activity getid(String id) {
        activity t= JdbcUtil.getOne("select items,id from activity where id=?",activity.class,id);
        return t;
    }
}
