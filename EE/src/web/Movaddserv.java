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
@WebServlet("/lovezap/movies/add")
public class Movaddserv extends HttpServlet {
    movservice mov = new Movserviceimpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/pages/movadd.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        req.setAttribute("bas",mov);

        String id = req.getParameter("id");
        String movie = req.getParameter("movie");
        String time = req.getParameter("time");
        movies x = new movies();
        x.setId(Integer.valueOf(id));
        x.setMovie(movie);
        x.setTime(time);
        mov.add(x);
        List<movies> list = mov.list();
        req.setAttribute("list",list);
        req.getRequestDispatcher("/WEB-INF/pages/mov.jsp").forward(req,resp);
    }



}

