package web;

import lovezap.basketball.service.*;
import lovezap.basketball.tab.ackind;
import lovezap.basketball.tab.activity;
import lovezap.basketball.tab.myactivities;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by lenovo on 2020/7/22.
 */
@WebServlet("/lovezap/myactivities")
public class MyActservlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ackindservice act = new ackindservimpl() ;
        List <ackind> ac = act.list();
        req.setAttribute("ac",ac);
        myactivitiesservice mya = new myactivitiesserviceimpl() ;
        List<myactivities> list = mya.list();
        req.setAttribute("list",list);
        req.getRequestDispatcher("/WEB-INF/pages/myac.jsp").forward(req,resp);
    }
}
