<%@ page import="ru.politexnik.IF97WebApp.model.Entry" %>
<%@ page import="java.util.ArrayList" %>
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
            <input type="radio" checked name="arg" value="P" >P
            <input type="radio" name="arg" value="T" >T
        </section>
        <section>
            <h3>Параметры</h3>
            <input name="param1" placeholder="Давление" class="param-input">
            <select name="param1Units">
                <option value="PRESSURE_KGS_SM2_gauge">кгс/см2(изб)</option>
                <option value="PRESSURE_KGS_SM2_abs">кгс/см2(абс)</option>
                <option value="PRESSURE_MPA_abs">МПа(изб)</option>
                <option value="PRESSURE_MPA_gauge">МПа(абс)</option>
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
        <p class="inserted">Энтальпия пара
            <%if (request.getAttribute("entalphyV") != null)
                out.print("= " + request.getAttribute("entalphyV"));%>
            Дж/кг
        </p>
        <p class="inserted">Энтальпия воды
            <%if (request.getAttribute("entalphyL") != null)
                out.print("= " + request.getAttribute("entalphyL"));%>
            Дж/кг
        </p>
        <p class="inserted">Удельный объем пара
            <%if (request.getAttribute("volumeV") != null)
                out.print("= " + request.getAttribute("volumeV"));%>
            м3/кг
        </p>
        <p class="inserted">Удельный объем воды
            <%if (request.getAttribute("volumeL") != null)
                out.print("= " + request.getAttribute("volumeL"));%>
            м3/кг
        </p>
        <p class="inserted">Энтропия пара
            <%if (request.getAttribute("entropyV") != null)
                out.print("= " + request.getAttribute("entropyV"));%>
            Дж/кг*К
        </p>
        <p class="inserted">Энтропия воды
            <%if (request.getAttribute("entropyL") != null)
                out.print("= " + request.getAttribute("entropyL"));%>
            Дж/кг*К
        </p>
    </section>
    <section>
        <h3>История вычислений</h3>
        <%
            ArrayList<Entry> historyList = (ArrayList<Entry>)request.getSession().getAttribute("historyList");
            if (historyList != null) {
                for (int i = 0; i < historyList.size(); i++) {
                    out.println("<a href=\"" + historyList.get(i).getValue() + "\">" + historyList.get(i).getKey() + "</a>");
                    out.println("<br/>");
                }
            }
        %>
    </section>
</main>

<footer alig="bottom">
    <h3>Другие функции</h3>
    <a href="/">Основные свойства</a>
</footer>
<script type="text/javascript" pageEncoding="UTF-8">
    <%@include file="js/script.js"%>
</script>
</body>

</html>