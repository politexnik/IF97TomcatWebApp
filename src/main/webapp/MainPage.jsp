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
        <section>
            <h3>Аргументы функции</h3>
            <form id="calculator" action="/calc" method="get">
                <input type="radio" checked name="agr" value="PH" >PH
                <input type="radio" name="agr" value="PT">PT
                <input type="radio" name="agr" value="HS">HS
            </form>
        </section>
        <section>
            <h3>Параметры</h3>
            <form id="calculator">
                <input name="param1" placeholder="Давление" class="param-input">
                <select name="param1Units">
                    <option value="kgsSm2I">кгс/см2(изб)</option>
                    <option value="kgsSm2A">кгс/см2(абс)</option>
                    <option value="MPaI">МПа(изб)</option>
                    <option value="MPaA">МПа(абс)</option>
                </select>
                <br/>
                <input name="param2" placeholder="Энтальпия" class="param-input">
                <select name="param2Units">
                    <option value="kcal/kg">ккал/кг</option>
                    <option value="kJ/kg">кДж/кг</option>
                </select>
            </form>
        </section>
        <section>
            <h3>Значения</h3>
            <p class="inserted">Давление</p>
            <p class="inserted" >Температура</p>
            <p class="inserted">Энтальпия</p>
            <p class="inserted">Удельный объем</p>
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