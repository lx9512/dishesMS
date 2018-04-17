<%--
  Created by IntelliJ IDEA.
  User: yzp
  Date: 2018/3/22
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<html>
<head>
    <title>Welcome to DishesMS</title>
</head>
<h1 align="center">客户登录页面</h1><br><br><br>
<form role="form"  action="#" method="post">
    <div class="center-block" style="width:350px;height:90px;">

        <div class="form-group">
            <input name="staName" type="text" class="form-control"  placeholder="Please Input Name:"><br>
        </div>
        <div class="form-group">
            <input name="staPassword" type="password" class="form-control" placeholder="Password"><br>
        </div>
        <div class="html-editor-align-center form-group">
            <input type="submit" class="btn btn-default" value="login" />&nbsp;&nbsp;&nbsp;
            <input type="button" value="register" class="btn btn-default" onclick="window.location.href='#'">
        </div>
    </div>
</form>
</html>
