
<%--
  Created by IntelliJ IDEA.
  User: 沈建磊
  Date: 2020/10/2
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/static/js/jquery-1.12.4.js"></script>
</head>
<body>
        <table border="1px">
            <tr>
                <td>预定编号</td>
                <td>会议室</td>
                <td>预订人</td>
                <td>日期</td>
            </tr>
            <c:forEach items="${list}" var="list">
                <tr>
                    <td>${list.id}</td>
                    <td>${list.meetingName}</td>
                    <td>${list.devanceName}</td>
                    <td><fmt:formatDate value="${list.meetingOr3der}" pattern="yyy-MM-dd"></fmt:formatDate></td>

                </tr>
            </c:forEach>

        </table>

        <a href="/addAll">添加会议室</a>


        <script type="text/javascript">
            $("tr:odd").css("background-color","#DE9FDA");
            $("tr:first").css("background-color","#808080");

        </script>
</body>
</html>
