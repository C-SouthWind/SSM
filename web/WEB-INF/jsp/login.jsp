<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/static/js/jquery-3.6.0.js"></script>
</head>
<body>
<h1>登录页面</h1>
<%--<a href="/login/aa">aaa</a>${msg}--%>
<form>
    账号：<input type="text" id="userAccount">
    密码：<input type="text" id="userPwd">
    <button id="btn">确定</button>
</form>
</body>
</html>
<script>
    $("#btn").click(function () {
        var userAccount = $("#userAccount").val();
        var userPwd = $("#userPwd").val();
        $.post("/login/login",{userAccount:userAccount,userPwd:userPwd},function (data) {
            window.location.href = "/user/toUser";
        })
    });
</script>
