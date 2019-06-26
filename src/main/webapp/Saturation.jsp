<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
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
                    <input type="radio" checked name="agr" value="T" >Температура
                    <input type="radio" name="agr" value="P">Давление
                </form>
            </section>
            <section>
                <h3>Параметры</h3>
                <form id="calculator">
                    <input name="param1" placeholder="Температура" class="param-input">
                    <select name="param1Units">
                        <option value="K">K</option>
                        <option value="C">°C</option>
                    </select>
                </form>
            </section>
            <section>
                <h3>Значения</h3>
                <p class="inserted">Давление</p>
                <p class="inserted">Температура</p>
                <p class="inserted">Энтальпия</p>
                <p class="inserted">Удельный объем</p>
            </section>
        </main>

        <footer alig="center">
            <a href="/">Общие функции</a>
            <a href="/img/hs-diagram.jpg">HS-диаграмма</a>
        </footer>
        <script  type="text/javascript">
            <%@include file="js/script.js"%>
        </script>
    </body>

</html>