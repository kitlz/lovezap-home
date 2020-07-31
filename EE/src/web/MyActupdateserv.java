package web;

import lovezap.basketball.service.ackindservice;
import lovezap.basketball.service.ackindservimpl;
import lovezap.basketball.service.myactivitiesservice;
import lovezap.basketball.service.myactivitiesserviceimpl;
import lovezap.basketball.tab.myactivities;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lenovo on 2020/7/22.
 */
@WebServlet("/lovezap/myactivities/update")
public class MyActupdateserv  extends HttpServlet {
    myactivitiesservice mas=new myactivitiesserviceimpl();
    ackindservice ack=new ackindservimpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        req.getRequestDispatcher("/WEB-INF/pages/myacup.jsp").forward(req,resp);
        String id = req.getParameter("id");
        String item = req.getParameter("item");
        String state = req.getParameter("state");
        String towrite = req.getParameter("towrite");
        myactivities ma = new myactivities();
        ma.setId(id);
        ma.setItems(item);
        myactivities old = mas.getbyid(id);

        try{
            ;
            int a = Integer.valueOf(item);
            try{int b = Integer.valueOf(old.getItems());
                System.out.print(a+b);
            if(100<=a&&a<=1231&&10000<=b&&b<=15000)
            {
                ack.increment("basketball");
                ack.decrement("movies");}
              else{
                    ack.decrement("basketball");
                    ack.increment("movies");
                }

           }catch (Exception f){
                 if(10000<=a&&a<=15000)
                    {ack.increment("movies");
                        ack.decrement("others");}
                    else {ack.increment("basketball");
                        ack.decrement("others");}

            }
            } catch (Exception e){
        try{
            int b = Integer.valueOf(old.getItems());
            if(10000<=b&&b<=15000)
            {ack.increment("others");
                ack.decrement("movies");}
            else {ack.increment("others");
                ack.decrement("basketball");}
        }catch(Exception d){}
        }

        ma.setState(state);
        ma.setTowrite(towrite);
        mas.update(ma);
        MyActservlet b =new MyActservlet();
        b.service(req,resp);

    }
}
