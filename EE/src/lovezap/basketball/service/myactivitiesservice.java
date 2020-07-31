package lovezap.basketball.service;

import lovezap.basketball.tab.myactivities;

import java.util.List;

/**
 * Created by lenovo on 2020/7/22.
 */
public interface myactivitiesservice {
    List<myactivities> list();
    int add (myactivities one);
    myactivities getbyid(String id);
    int update(myactivities m);
    int del(String id);
}
