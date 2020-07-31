package web;

import lovezap.basketball.service.movservice;
import lovezap.basketball.service.Movserviceimpl;
import lovezap.basketball.tab.movies;

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
@WebServlet("/lovezap/movies")
public class Moviesservlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        movservice mov = new Movserviceimpl();

            List<movies> list = mov.list();
            req.setAttribute("list",list);
            req.getRequestDispatcher("/WEB-INF/pages/mov.jsp").forward(req,resp);

    }
}
