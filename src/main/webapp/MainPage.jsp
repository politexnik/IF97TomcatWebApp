<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="desctiption" content="Свойства воды и пара IF-97">
        <meta name="keywords" content="Пар, вода, IF-97">
        <meta name="author" content="Yakov Alekseev">


        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Свойства воды-пара</title>
        <style><%@include file="/css/styles.css"%></style>
    </head>

    <body>
    <header>
        <h1>Определение свойств воды-пара по международной формуляции IF-97</h1>
    </header>

    <main>
        <form id="calculator" method="get">
            <section>
                <h3>Аргументы функции</h3>
                <input type="radio" name="arg" value="PT"
                <%if (request.getParameter("arg") == null)
                                    out.print("checked");%>
                >PT

                <input type="radio" name="arg" value="PH"
                <%if (request.getParameter("arg") != null && request.getParameter("arg").equals("PH"))
                                    out.print("checked");%>
                >PH

                <input type="radio" name="arg" value="PS"
                <%if (request.getParameter("arg") != null && request.getParameter("arg").equals("PS"))
                                    out.print("checked");%>
                >PS

                <input type="radio" name="arg" value="HS"
                <%if (request.getParameter("arg") != null && request.getParameter("arg").equals("HS"))
                                        out.print("checked");%>
                >HS
            </section>
            <section>
                <h3>Параметры</h3>
                <input name="param1"
                placeholder=
                <%if (request.getParameter("param1") != null)
                            out.print(request.getParameter("param1"));
                    else
                        out.print("Давление");
                %>
                class="param-input">
                <select name="param1Units">
                    <option value="PRESSURE_KGS_SM2_gauge">кгс/см2(изб)</option>
                    <option checked value="PRESSURE_KGS_SM2_abs">кгс/см2(абс)</option>
                    <option value="PRESSURE_MPA_abs">МПа(изб)</option>
                    <option value="PRESSURE_MPA_gauge">МПа(абс)</option>
                </select>

                <br/>
                <input name="param2" placeholder=
                    <%if (request.getParameter("param2") != null)
                                                out.print(request.getParameter("param2"));
                        else
                            out.print("Температура");
                    %>
                class="param-input">
                <select name="param2Units">
                    <option value="ENTHALPY_KKAL_KG">ккал/кг</option>
                    <option value="ENTHALPY_KJ_KG">кДж/кг</option>
                </select>
                <br/>
                <input type="submit" value="Рассчет">
            </section>
        </form>

        <section>
            <h3>Значения</h3>
            <p class="inserted">Давление
                <%if (request.getAttribute("pressure") != null)
                    out.print("= " + request.getAttribute("pressure"));%>
                    Па
            </p>
            <p class="inserted">Температура
                <%if (request.getAttribute("temperature") != null)
                    out.print("= " + request.getAttribute("temperature"));%>
                                К
            </p>
            <p class="inserted">Энтальпия
                <%if (request.getAttribute("entalphy") != null)
                    out.print("= " + request.getAttribute("entalphy"));%>
                                Дж/кг
            </p>
            <p class="inserted">Удельный объем
                <%if (request.getAttribute("volume") != null)
                    out.print("= " + request.getAttribute("volume"));%>
                                м3/кг
            </p>
            <p class="inserted">Энтропия
                            <%if (request.getAttribute("entropy") != null)
                                out.print("= " + request.getAttribute("entropy"));%>
                                Дж/кг*К
            </p>
        </section>
    </main>

    <footer alig="center">
        <a href="/saturation">Насыщенный пар/конденсат</a>
        <a href="../img/hs-diagram.jpg">HS-диаграмма</a>
    </footer>
    <script type="text/javascript" pageEncoding="UTF-8">
        <%@include file="js/script.js"%>
    </script>
    </body>

</html>