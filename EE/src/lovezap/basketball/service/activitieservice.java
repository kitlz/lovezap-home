package lovezap.basketball.service;

import lovezap.basketball.tab.activity;

import java.util.List;

/**
 * Created by lenovo on 2020/7/22.
 */
public interface activitieservice {
    List<activity> list();
    activity getid(String id);
}
