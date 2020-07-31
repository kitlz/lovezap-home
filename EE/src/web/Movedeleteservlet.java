package web;

import lovezap.basketball.service.Movserviceimpl;
import lovezap.basketball.service.movservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lenovo on 2020/7/22.
 */
@WebServlet("/lovezap/movies/del")
public class Movedeleteservlet extends HttpServlet {
    movservice mov = new Movserviceimpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("mov",mov);
        req.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id");
        mov.del(id);
        resp.sendRedirect("/lovezap/movies");
    }
}
