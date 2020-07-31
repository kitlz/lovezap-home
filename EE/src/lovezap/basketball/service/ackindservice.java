package lovezap.basketball.service;

import lovezap.basketball.tab.ackind;

import java.util.List;

/**
 * Created by lenovo on 2020/7/23.
 */
public interface ackindservice {
    List<ackind> list();
    ackind getid(String id);
    int increment(String times);
    int decrement(String times);
}
