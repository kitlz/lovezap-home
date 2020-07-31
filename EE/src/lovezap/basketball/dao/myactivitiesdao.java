package lovezap.basketball.dao;

import lovezap.basketball.tab.myactivities;

import java.util.List;

/**
 * Created by lenovo on 2020/7/22.
 */
public interface myactivitiesdao {
    List <myactivities> list();
    int add(myactivities basadd);
    myactivities getbyid(String id);
    int update(myactivities bas) ;
    int del(String id);
}
