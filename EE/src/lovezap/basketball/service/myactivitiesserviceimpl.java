package lovezap.basketball.service;

import lovezap.basketball.dao.myactivitiesdao;
import lovezap.basketball.dao.myactivitiesdaoimpl;
import lovezap.basketball.tab.myactivities;

import java.util.List;

/**
 * Created by lenovo on 2020/7/22.
 */
public class myactivitiesserviceimpl implements myactivitiesservice {
    myactivitiesdao m = new myactivitiesdaoimpl() ;
    @Override
    public List<myactivities> list() {
        return m.list();
    }

    @Override
    public int add(myactivities one) {
        return m.add(one);
    }

    @Override
    public myactivities getbyid(String id) {
        return m.getbyid(id);
    }

    @Override
    public int update(myactivities f) {
        return m.update(f);
    }

    @Override
    public int del(String id) {
        return m.del(id);
    }
}
