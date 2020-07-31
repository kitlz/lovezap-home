package lovezap.basketball.service;

import lovezap.basketball.dao.actdao;
import lovezap.basketball.dao.actdaoimpl;
import lovezap.basketball.tab.activity;
import util.JdbcUtil;

import java.util.List;

/**
 * Created by lenovo on 2020/7/22.
 */
public class activitieserviceimpl implements activitieservice {
    actdao a = new actdaoimpl();
    @Override
    public List<activity> list() {
        return a.list();
    }

    @Override
    public activity getid(String id) {
        return a.getid(id);
    }
}
