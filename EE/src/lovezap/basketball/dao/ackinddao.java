package lovezap.basketball.dao;

import lovezap.basketball.tab.ackind;

import java.util.List;

/**
 * Created by lenovo on 2020/7/23.
 */
public interface ackinddao {
    List<ackind> list();
    ackind getid(String id);
    int increment(String activity);
    int decrement(String activity);
}
