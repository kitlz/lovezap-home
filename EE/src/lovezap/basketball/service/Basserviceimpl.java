package lovezap.basketball.service;

import lovezap.basketball.dao.basketballdao;
import lovezap.basketball.tab.basketball;
import lovezap.basketball.dao.Basdaoimpl;

import java.util.List;

/**
 * Created by lenovo on 2020/7/20.
 */
public class Basserviceimpl implements basservice {
    basketballdao b = new Basdaoimpl();
    @Override
   public List<basketball> list(){return b.list();}

    @Override
    public int add(basketball basadd) {
        return  b.add(basadd);
    }
    public basketball getid(String id){
       return b.getid(id);
    }

    @Override
    public int update(basketball bas) {
        return b.update(bas);
    }

    @Override
    public int del(String id) {
        return b.del(id);
    }

}
