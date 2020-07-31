package web;

import lovezap.basketball.service.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lenovo on 2020/7/22.
 */
@WebServlet("/lovezap/myactivities/del")
public class MyActdeleteserv extends HttpServlet{
    myactivitiesservice myact = new myactivitiesserviceimpl() ;
    ackindservice ack=new ackindservimpl();
    @Override

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("ma",myact);
        req.setCharacterEncoding("UTF-8");
        String item = req.getParameter("id");
        try{
        ;

        int a = Integer.valueOf(item);
        if(100<=a&&a<=1231)
        {
            ack.decrement("basketball");
        }
        else if(10000<=a&&a<=15000)
        {
            ack.decrement("movies");
        }
        else {
            ack.decrement("others");}
        myact.del(item);} catch (Exception e){
            ack.decrement("others");
            myact.del(item);
        }
        MyActservlet b =new MyActservlet();
        b.service(req,resp);
        resp.sendRedirect("/lovezap/myactivities");
    }
}
