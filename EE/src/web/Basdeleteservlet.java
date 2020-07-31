package web;

import lovezap.basketball.service.basservice;
import lovezap.basketball.service.Basserviceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lenovo on 2020/7/22.
 */
@WebServlet("/lovezap/basketball/del")
public class Basdeleteservlet extends HttpServlet {
    basservice bas = new Basserviceimpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("bas",bas);
        req.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id");
        bas.del(id);
        resp.sendRedirect("/lovezap/basketball");
    }
}
