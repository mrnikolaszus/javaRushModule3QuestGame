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
        <c:if test="${status == life}">
            <button class="button" onclick="restart()" >Restart Game</button>
        </c:if>

    </div>
    <div class="info">
        <c:if test="${status == life}">
            <button class="button" onclick="dmg()" >Got Damage!</button>
        </c:if>

    </div>


    <div class="table">

        <table>
            <tr>

                <td >${data.get(0).getSign()}</td>
                <td >${data.get(1).getSign()}</td>
                <td >${data.get(2).getSign()}</td>
            </tr>

        </table>

    </div>

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