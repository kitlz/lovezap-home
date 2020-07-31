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
 * Created by lenovo on 2020/7/21.
 */
@WebServlet("/lovezap/basketball/add")
public class Basaddservlet extends HttpServlet {
    basservice bas = new Basserviceimpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/pages/basadd.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        req.setAttribute("bas",bas);

        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String play = req.getParameter("play");
        String happy = req.getParameter("happy");

        basketball ba = new basketball();
        ba.setId(Integer.valueOf(id));
        ba.setName(name);
        ba.setPlay(play);
        ba.setHappy(happy);
        bas.add(ba);
        List<basketball> list = bas.list();
        req.setAttribute("list",list);
        req.getRequestDispatcher("/WEB-INF/pages/bas.jsp").forward(req,resp);
    }


}
