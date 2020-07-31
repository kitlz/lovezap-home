package web;

import lovezap.basketball.service.*;
import lovezap.basketball.tab.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static java.lang.String.valueOf;

/**
 * Created by lenovo on 2020/7/22.
 */
@WebServlet("/lovezap/myactivities/add")
public class MyActaddserv extends HttpServlet {
    basservice bbs =new Basserviceimpl();
    movservice mvs=new Movserviceimpl();
    activitieservice act = new activitieserviceimpl() ;
    myactivitiesservice mas=new myactivitiesserviceimpl();
    ackindservice ack=new ackindservimpl();
    List <basketball> bb = bbs.list();
    List <movies> mv = mvs.list();
    List <activity> ac = act.list();
    List <ackind> ak =ack.list();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("bb",bb);
        req.setAttribute("mv",mv);
        req.setAttribute("ac",ac);
        req.setCharacterEncoding("UTF-8");
        req.getRequestDispatcher("/WEB-INF/pages/myacadd.jsp").forward(req,resp);
        String id = req.getParameter("id");
        String item = req.getParameter("item");
        String item1 = req.getParameter("item1");
        String item2 = req.getParameter("item2");
        String state = req.getParameter("state");
        String towrite = req.getParameter("towrite");
        myactivities x = new myactivities();
        x.setId(id);
        int a = Integer.valueOf(item);
        if(a==1)
        {x.setItems(item1);
        ack.increment("basketball");
        }
        else if(a==2)
        {x.setItems(item2);
        ack.increment("movies");
        }
        else {x.setItems("others");
            ack.increment("others");}
        x.setState(state);
        x.setTowrite(towrite);
        mas.add(x);
        MyActservlet b =new MyActservlet();
        b.service(req,resp);

    }
}
