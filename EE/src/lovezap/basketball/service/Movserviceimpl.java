package lovezap.basketball.service;

import lovezap.basketball.dao.Movdaoimpl;
import lovezap.basketball.dao.moviedao;
import lovezap.basketball.tab.movies;

import java.util.List;

/**
 * Created by lenovo on 2020/7/22.
 */
public class Movserviceimpl implements movservice {
    moviedao m= new Movdaoimpl();
    @Override
    public List<movies> list() {

        return m.list();
    }

    @Override
    public int add(movies one) {
        return m.add(one);
    }

    @Override
    public movies getid(String id) {
        return m.getid(id);
    }

    @Override
    public int update(movies f) {
        return m.update(f);
    }

    @Override
    public int del(String id) {
        return m.del(id);
    }
}
