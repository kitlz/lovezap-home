package web;

import lovezap.basketball.service.basservice;
import lovezap.basketball.tab.basketball;
import lovezap.basketball.service.Basserviceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by lenovo on 2020/7/20.
 */
@WebServlet("/lovezap/basketball")
public class Basketballservlet extends HttpServlet {
    basservice bas = new Basserviceimpl();
    @Override

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<basketball> list = bas.list();
        req.setAttribute("list",list);
        req.getRequestDispatcher("/WEB-INF/pages/bas.jsp").forward(req,resp);
    }
}
