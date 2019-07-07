package ru.politexnik.IF97WebApp.servlet;


import com.hummeling.if97.IF97;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.politexnik.IF97WebApp.model.Entry;
import ru.politexnik.IF97WebApp.model.Units;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;


public class MainUrlServlet extends HttpServlet {
    Logger log = LogManager.getLogger(MainUrlServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        //список для отображения предыдущих полученных запросов
        ArrayList<Entry> historyList = (ArrayList<Entry>)req.getSession().getAttribute("historyList");
        if (historyList == null) {
            historyList = new ArrayList<>();
            req.getSession().setAttribute("historyList", new ArrayList<String>());
        }

        log.debug("GET enter in MainServlet");
        resp.setCharacterEncoding("UTF-8");
        //Тип переменных
        //Если что-то прилетает в параметрах - обрабатываем.
        if (req.getParameter("arg") != null) {
            IF97 if97 = new IF97(IF97.UnitSystem.SI);

            String arg = req.getParameter("arg");
            double param1 = Double.parseDouble(req.getParameter("param1"));
            double param2 = Double.parseDouble(req.getParameter("param2"));
            String param1Units = req.getParameter("param1Units");
            String param2Units = req.getParameter("param2Units");

            Units unit1 = Units.valueOf(param1Units);
            Units unit2 = Units.valueOf(param2Units);

            double param1SI = param1*unit1.getIndexA() + unit1.getIndexB();
            double param2SI = param2*unit2.getIndexA() + unit2.getIndexB();

            double entalphy = 0;
            double pressure = 0;
            double temperature = 0;
            double volume = 0;
            double entropy = 0;
            if (arg.equals("PT")) {
                entalphy = if97.specificEnthalpyPT(param1SI, param2SI);
                pressure = param1SI;
                temperature = param2SI;
                volume = if97.specificVolumePT(param1SI, param2SI);
                entropy = if97.specificEntropyPT(param1SI, param2SI);
            } else if (arg.equals("PH")) {
                pressure = param1SI;
                temperature = if97.temperaturePH(param1SI, param2SI);
                entalphy = if97.specificEnthalpyPT(param1SI, if97.temperaturePH(param1SI, param2SI));
                volume = if97.specificVolumePT(param1SI, if97.temperaturePH(param1SI, param2SI));
                entropy = if97.specificEntropyPT(param1SI, if97.temperaturePH(param1SI, param2SI));
            } else if (arg.equals("PS")) {
                pressure = param1SI;
                temperature = if97.temperaturePH(param1SI, param2SI);
                entalphy = if97.specificEnthalpyPT(param1SI, if97.temperaturePS(param1SI, param2SI));
                volume = if97.specificVolumePT(param1SI, if97.temperaturePS(param1SI, param2SI));
                entropy = if97.specificEntropyPT(param1SI, if97.temperaturePS(param1SI, param2SI));
            } else if (arg.equals("HS")) {
                pressure = if97.pressureHS(param1SI, param2SI);
                temperature = if97.temperatureHS(param1SI, param2SI);
                entalphy = if97.specificEnthalpyPT(if97.pressureHS(param1SI, param2SI), if97.temperatureHS(param1SI, param2SI));
                volume = if97.specificVolumePT(if97.pressureHS(param1SI, param2SI), if97.temperatureHS(param1SI, param2SI));
                entropy = if97.specificEntropyPT(if97.pressureHS(param1SI, param2SI), if97.temperatureHS(param1SI, param2SI));
            }

            //Ставим атрибуты вычисленных параметров для последующего применения в JSP
            req.setAttribute("pressure", Math.round(pressure));
            req.setAttribute("temperature", ((double)Math.round(temperature * 10)) / 10);
            req.setAttribute("entalphy", Math.round(entalphy));
            req.setAttribute("volume", ((double)Math.round(volume*1000000))/1000000);
            req.setAttribute("entropy", Math.round(entropy));

            Entry historyEntry = new Entry(arg + "; " + param1 + " " + Units.valueOf(param1Units).getUnit() + " / " + param2 + " " + Units.valueOf(param2Units).getUnit(),
                    req.getRequestURL().toString() + "?" + req.getQueryString());
            //Если historyList пуст либо последний добавленный элемент в historyList не такой же как этот, то дополняем
            if ((historyList.size() == 0) || (historyList.size() > 0 &&
                    !historyList.get(historyList.size() -1).getValue().equals(historyEntry.getValue()))) {
                    historyList.add(historyEntry);
            }
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("MainPage.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (Exception e) {
            log.error("Fail forward to MainPage", e);
        }
    }
}
