package ru.politexnik.IF97WebApp.servlet;


import com.hummeling.if97.IF97;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.politexnik.IF97WebApp.model.Entry;
import ru.politexnik.IF97WebApp.model.Units;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class SaturationServlet extends HttpServlet {
    Logger log = LogManager.getLogger(SaturationServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {

        ArrayList<Entry> historyList = (ArrayList<Entry>)req.getSession().getAttribute("historyList");
        if (historyList == null) {
            historyList = new ArrayList<>();
            req.getSession().setAttribute("historyList", new ArrayList<String>());
        }

        log.debug("GET enter in Saturation Servlet");
        resp.setCharacterEncoding("UTF-8");
        //Тип переменных
        if (req.getParameter("arg") != null) {
            IF97 if97 = new IF97(IF97.UnitSystem.SI);

            String arg = req.getParameter("arg");
            double param1 = Double.parseDouble(req.getParameter("param1"));
            String param1Units = req.getParameter("param1Units");

            Units unit1 = Units.valueOf(param1Units);

            double param1SI = param1*unit1.getIndexA() + unit1.getIndexB();

            double entalphyV = 0;
            double entalphyL = 0;
            double pressure = 0;
            double temperature = 0;
            double volumeV = 0;
            double volumeL = 0;
            double entropyV = 0;
            double entropyL = 0;
            if (arg.equals("P")) {
                entalphyV = if97.specificEnthalpySaturatedVapourP(param1SI);
                entalphyL = if97.specificEnthalpySaturatedLiquidP(param1SI);
                pressure = param1SI;
                temperature = if97.saturationTemperatureP(param1SI);
                volumeV = if97.specificVolumeSaturatedVapourP(param1SI);
                volumeL = if97.specificVolumeSaturatedLiquidP(param1SI);
                entropyV = if97.specificEntropySaturatedVapourP(param1SI);
                entropyL = if97.specificEntropySaturatedLiquidP(param1SI);
            } else if (arg.equals("T")) {
                entalphyV = if97.specificEnthalpySaturatedVapourT(param1SI);
                entalphyL = if97.specificEnthalpySaturatedLiquidT(param1SI);
                pressure = if97.saturationPressureT(param1SI);
                temperature = param1SI;
                volumeV = if97.specificVolumeSaturatedVapourT(param1SI);
                volumeL = if97.specificVolumeSaturatedLiquidT(param1SI);
                entropyV = if97.specificEntropySaturatedVapourT(param1SI);
                entropyL = if97.specificEntropySaturatedLiquidT(param1SI);
            }

            //Ставим атрибуты вычисленных параметров для последующего применения в JSP
            req.setAttribute("pressure", Math.round(pressure));
            req.setAttribute("temperature", ((double)Math.round(temperature * 10)) / 10);
            req.setAttribute("entalphyV", Math.round(entalphyV));
            req.setAttribute("entalphyL", Math.round(entalphyL));
            req.setAttribute("volumeV", ((double)Math.round(volumeV*1000000))/1000000);
            req.setAttribute("volumeL", ((double)Math.round(volumeL*1000000))/1000000);
            req.setAttribute("entropyV", Math.round(entropyV));
            req.setAttribute("entropyL", Math.round(entropyL));

            Entry historyEntry = new Entry("Saturation " + arg + "; " + param1 + " " + Units.valueOf(param1Units).getUnit(),
                    req.getRequestURL().toString() + "?" + req.getQueryString());
            //Если historyList пуст либо последний добавленный элемент в historyList не такой же как этот, то дополняем
            if ((historyList.size() == 0) || (historyList.size() > 0 &&
                    !historyList.get(historyList.size() -1).getValue().equals(historyEntry.getValue()))) {
                historyList.add(historyEntry);
            }
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("Saturation.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (Exception e) {
            log.error("Fail forward to MainPage", e);
        }

    }


}
