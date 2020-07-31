package web;

import lovezap.basketball.service.Movserviceimpl;
import lovezap.basketball.service.movservice;
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
@WebServlet("/lovezap/movies/update")
public class Movupdateservlet extends HttpServlet {
    movservice mi = new Movserviceimpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/pages/movup.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String id = req.getParameter("id");
        String movie = req.getParameter("movie");
        String time = req.getParameter("time");
        movies btab = mi.getid(id);
        req.setAttribute("bas",btab);
        movies ba = new movies();
        ba.setId(Integer.valueOf(id));
        ba.setMovie(movie);
        ba.setTime(time);
        mi.update(ba);
        List<movies> list = mi.list();
        req.setAttribute("list",list);
        req.getRequestDispatcher("/WEB-INF/pages/mov.jsp").forward(req,resp);
    }
}
