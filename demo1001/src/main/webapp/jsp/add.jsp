<%--
  Created by IntelliJ IDEA.
  User: 沈建磊
  Date: 2020/10/2
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/static/js/jquery-1.12.4.js"></script>
</head>
<body>
    <form action="/selectadd" method="post">
        <table border="1px">
            <tr>
                <td colspan="2" style="font-size: 30px;text-align: center">会议室预订</td>
            </tr>
            <tr>
                <td>会议室</td>
                <td><input type="text" name="meetingName"> </td>
            </tr>
            <tr>
                <td>申请人</td>
                <td><input type="text" name="devanceName"> </td>
            </tr>
            <tr>
                <td>预定日期</td>
                <td><input type="text" name="meetingOr3der"> </td>
            </tr>
            <tr>
                <td><input type="submit" value="提交"/></td>
                <td><input type="reset" value="重置"></td>
            </tr>
        </table>
    </form>


    <script type="text/javascript">
        $("form").submit(function() {
            var executor=$("[name=executor]").val();
            var description=$("[name=description]").val();

            if(executor==""){
                alert("执行人不可为空");
                return false;
            }

            if(description==""){
                alert("任务描述不可为空");
                return false;
            }

        })

    </script>
</body>
</html>
