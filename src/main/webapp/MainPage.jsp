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
                <input type="radio" checked name="arg" value="PH" >PH
                <input type="radio" name="arg" value="PT">PT
                <input type="radio" name="arg" value="HS">HS
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
                <input name="param2" placeholder="Энтальпия" class="param-input">
                <select name="param2Units">
                    <option value="ENTALPHY_KKAL_KG">ккал/кг</option>
                    <option value="ENTALPHY_KJ_KG">кДж/кг</option>
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
            </p>
            <p class="inserted" >Температура
                <%if (request.getAttribute("temperature") != null)
                    out.print("= " + request.getAttribute("temperature"));%>
            </p>
            <p class="inserted">Энтальпия
                <%if (request.getAttribute("entalphy") != null)
                    out.print("= " + request.getAttribute("entalphy"));%>
            </p>
            <p class="inserted">Удельный объем
                <%if (request.getAttribute("volume") != null)
                    out.print("= " + request.getAttribute("volume"));%>
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