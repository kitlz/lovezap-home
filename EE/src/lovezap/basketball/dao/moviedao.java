package lovezap.basketball.dao;

import lovezap.basketball.tab.movies;

import java.util.List;

/**
 * Created by lenovo on 2020/7/22.
 */
public interface moviedao {
    List<movies> list();
    int add (movies one);
    movies getid(String id);
    int update(movies m);
    int del(String id);
}
