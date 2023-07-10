<%@ page import="com.example.javarushmodule3questgame.javaLogic.Sign" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>

<head>
    <title>Deep Space</title>
    <link href="main.css" rel="stylesheet">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="<c:url value="/jquery-3.6.0.min.js"/>"></script>
</head>
<body>

<c:set var="life" value="<%=Sign.LIFE%>"/>
<c:set var="death" value="<%=Sign.DEATH%>"/>


<div class="page" >
    <header class = 'header'>
        <div class="headerL">
            Test Quest Game:
            <br>
            SpaceShip under Attack!
        </div>
        <c:if test="${status == life}">
            <div class="table">
                <table>
                    <tr >
                        <td class="tableTr"> Life HP: </td>
                        <td class="tableTr">${data.get(0).getSign()}</td>
                        <td class="tableTr">${data.get(1).getSign()}</td>
                        <td class="tableTr">${data.get(2).getSign()}</td>
                    </tr>
                </table>
            </div>
        </c:if>

        <div class="headerR">
    <p>Date: ${date}</p>
    <p>SessionId: ${sessionID}</p>
        </div>
    </header>



    <div class="info">
        <c:if test="${ status == death }">
            <button class="button-40" onclick="restart()" >Restart Game</button>
        </c:if>

    </div>
<%--    <div class="info">--%>
<%--        <c:if test="${status == life}">--%>
<%--            <button class="button" onclick="dmg()" >Got Damage!</button>--%>
<%--        </c:if>--%>

<%--    </div>--%>

    <c:if test="${status == life}">
        <div class="main_text">

            <h3>${text2}</h3>
            <h2>---------------------------</h2>
            <h3>${text}</h3>
        </div>
        <div>
            <c:if test="${buttons == 1}">
                <button class="button-40" onclick="window.location='/logic?click=1'">${button1}</button>
            </c:if>
            <c:if test="${buttons == 2}">
                <button class="button-40" onclick="window.location='/logic?click=1'">${button1}</button>
                <button class="button-40" onclick="window.location='/logic?click=2'">${button2}</button>
            </c:if>

            <c:if test="${buttons == 3}">
            <table class="tableButtons">
                <tr>
                    <td > <button  class="button-40" onclick="window.location='/logic?click=1'">${button1}</button></td>
                    <td > <button class="button-40" onclick="window.location='/logic?click=2'">${button2}</button></td>
                    <td > <button class="button-40" onclick="window.location='/logic?click=3'">${button3}</button></td>
                </tr>
            </table>
            </c:if>



        </div>
    </c:if>


    <c:if test="${status == death}">
        <div class="main_text">
        <p> Внезапно в глазах потемнело. В последнюю секунду Вы осознали ошибку, но это уже неважно, Вас ждет бесконечность...</p>
        <p> You are Dead.</p>

        </div>
    </c:if>

    <script>
        function restart() {
            $.ajax({
                url: '/restart',
                type: 'POST',
                contentType: 'application/json;charset=UTF-8',
                async: false,
                success: function () {
                    location.reload();
                }
            });
        }

        function dmg() {
            $.ajax({
                url: '/dmg',
                type: 'POST',
                contentType: 'application/json;charset=UTF-8',
                async: false,
                success: function () {
                    location.reload();
                }
            });
        }
    </script>

</div>

</body>
</html>