package lovezap.basketball.service;

import lovezap.basketball.dao.ackinddao;
import lovezap.basketball.dao.ackinddaoimpl;
import lovezap.basketball.tab.ackind;


import java.util.List;

/**
 * Created by lenovo on 2020/7/23.
 */
public class ackindservimpl implements ackindservice {
    ackinddao a = new ackinddaoimpl();
    @Override
    public List<ackind> list() {
        return a.list();
    }

    @Override
    public ackind getid(String id) {
        return a.getid(id);
    }

    @Override
    public int increment(String times) {
        return a.increment(times);
    }

    @Override
    public int decrement(String times) {
        return a.decrement(times);
    }
}
