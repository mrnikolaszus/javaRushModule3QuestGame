<%@ page import="com.example.javarushmodule3questgame.Sign" %>
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
        <h2>Quest</h2>
        <h4>DeepSpace!</h4>
    </header>

    <div class="info">
        <c:if test="${ status == death }">
            <button class="button" onclick="restart()" >Restart Game</button>
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
            <h3>${text}</h3>
            <c:if test="${buttons == 1}">
                <button class="answerButton" onclick="window.location='/logic?click=1'">${button1}</button>
            </c:if>
            <c:if test="${buttons == 2}">
                <button class="answerButton" onclick="window.location='/logic?click=1'">${button1}</button>
                <button class="answerButton" onclick="window.location='/logic?click=2'">${button2}</button>
            </c:if>

            <c:if test="${buttons == 3}">
            <table class="tableButtons">
                <tr>
                    <td > <button class="answerButton" onclick="window.location='/logic?click=1'">${button1}</button></td>
                    <td > <button class="answerButton" onclick="window.location='/logic?click=2'">${button2}</button></td>
                    <td > <button class="answerButton" onclick="window.location='/logic?click=3'">${button3}</button></td>
                </tr>
            </table>
            </c:if>



        </div>
    </c:if>
    <c:if test="${status == life}">
    <div class="table">
        <table>
            <tr>

                <td >${data.get(0).getSign()}</td>
                <td >${data.get(1).getSign()}</td>
                <td >${data.get(2).getSign()}</td>
            </tr>
        </table>
    </div>
    </c:if>

    <c:if test="${status == death}">
        <div class="table">


                    <h3>End game!</h3>

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