<%--
  Created by IntelliJ IDEA.
  User: Mr.W
  Date: 2017/9/23
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/static/jquery-3.2.1.min.js"></script>
    <%--<script type="text/javascript">--%>
        <%--$(function () {--%>
            <%--$("#testButton").click(function () {--%>
                <%--alert("1");--%>
                <%--$.post("${pageContext.request.contextPath}/login/testPremission.controller",--%>
                    <%--{}--%>
                <%--,function (result) {--%>
                        <%--alert(result);--%>
                    <%--},"json")--%>
            <%--})--%>
        <%--})--%>
    <%--</script>--%>

</head>
<body>
        首页
        <form action="${pageContext.request.contextPath}/login/testPremission.controller" method="post">
            <button type="submit" id="testButton">测试权限</button>

        </form>
</body>
</html>
