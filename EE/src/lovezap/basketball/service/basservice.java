package lovezap.basketball.service;

import lovezap.basketball.tab.basketball;

import java.util.List;

/**
 * Created by lenovo on 2020/7/20.
 */
public interface basservice {
    List<basketball> list();
    int add (basketball basadd);
     basketball getid(String id);
    int update(basketball bas);
    int del(String id);
}
