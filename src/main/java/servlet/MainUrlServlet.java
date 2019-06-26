package servlet;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class MainUrlServlet extends HttpServlet {
    Logger log = LogManager.getLogger(MainUrlServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {

        log.debug("GET enter in MainServlet");
        resp.setCharacterEncoding("UTF-8");
        //Тип переменных
        if (req.getParameter("arg") != null) {
            String agr = req.getParameter("arg");
            double param1 = Double.parseDouble(req.getParameter("param1"));
            double param2 = Double.parseDouble(req.getParameter("param2"));
            String param1Units = req.getParameter("param1Units");
            String param2Units = req.getParameter("param2Units");
//            Calc calc = new Calc();
//            calc.enthalpy(param1, param2);
//            System.out.println(calc.enthalpy(13e+5, 273.15+280));


        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("MainPage.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (Exception e) {
            log.error("Fail forward to MainPage", e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("arg") != null) {
            String agr = (String) req.getParameter("arg");
            System.out.println(agr);
            double param1 = Double.parseDouble(req.getParameter("param1"));
            System.out.println(param1);
            double param2 = Double.parseDouble(req.getParameter("param2"));
            System.out.println(param2);
            String param1Units = (String) req.getParameter("param1Units");
            System.out.println(param1Units);
            String param2Units = (String) req.getParameter("param2Units");
            System.out.println(param2Units);
        }
    }
}
