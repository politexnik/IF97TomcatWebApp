package servlet;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainUrlServlet extends HttpServlet {
    Logger log = LogManager.getLogger(MainUrlServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {

        log.debug("GET enter in MainServlet");
        resp.setCharacterEncoding("UTF-8");
        RequestDispatcher dispatcher = req.getRequestDispatcher("MainPage.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (Exception e) {
            log.error("Fail forward to MainPage", e);
        }
    }


}
