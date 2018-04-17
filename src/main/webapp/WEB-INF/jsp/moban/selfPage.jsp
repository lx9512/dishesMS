<%--
  Created by IntelliJ IDEA.
  User: yzp
  Date: 2018/4/17
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<html>
<head>
    <title>个人中心</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7"/>
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <link rel="stylesheet" href="default.css">

</head>
<body>
<jsp:include page="top.jsp"></jsp:include>
<div class="main-head">
    <p><span>个人信息</span></p>
</div>
<div class="from-self">
    <form action="#" method="post" >
        <ul>
            <li>
                <label for="username">姓名</label>
                <input type="text" name="name" id="username">
            </li>
            <li>
                <label for="phonenumber">电话号码</label>
                <input type="text" name="tel" id="phonenumber">
            </li>
            <li>
                <label for="email">电子邮件</label>
                <input type="text" name="email" id="email">
            </li>
            <li>
                <label for="time">出生日期</label>
                <input type="text" name="time" id="time">
            </li>

            <li>
                <label for="date">日期</label>
                <input type="text" name="date" id="date">
            </li>
            <li>
                <label for="guestbook">留言</label>
                <input type="text" name="guestbook" id="guestbook">
            </li>
        </ul>
        <a class="reserve" href="">修改，提交</a>
    </form>
</div>
</body>
</html>
