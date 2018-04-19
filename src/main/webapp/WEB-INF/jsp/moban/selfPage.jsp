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
<script>
    $(document).ready(function(){
        $("#edit").click(function(){
            htmlobj=$.ajax({url:"/customer/editSelfPage",async:false});
            $("#formCenter").html(htmlobj.responseText);
        });
        $("#selfMsg").click(function(){
           window.location.href="/customerJump/selfPage";
        });
        $("#orderRecord").click(function(){
            htmlobj=$.ajax({url:"/customer/orderRecord",async:false});
            $("#formCenter").html(htmlobj.responseText);
        });
    });
</script>
</head>
<body>
<jsp:include page="top.jsp"></jsp:include>
<br><br>
<div class="main-head">
    <p><span><button class="button" id="selfMsg">个人信息</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <button class="button" id="orderRecord">账单记录</button></span></p>
</div>
<div class="from-self" id="formCenter">
    <form action="#" method="post" >
        <ul>
            <li>
                <label for="username">姓名</label>
                <input type="text" name="name" id="username" value="${Customer.getName()}" readonly />
            </li>
            <li>
                <label for="phonenumber">电话号码</label>
                <input type="text" name="tel" id="phonenumber" value="${Customer.getTel()}" readonly />
            </li>
            <li>
                <label for="email">电子邮件</label>
                <input type="text" name="email" id="email" value="${Customer.getEmail()}" readonly />
            </li>
            <li>
                <label for="time">出生日期</label>
                <input type="text" name="time" id="time" value="${Customer.getBirthDate()}" readonly />
            </li>
            <li>
                <label for="account">账户名</label>
                <input type="text" name="account" id="account" value="${Customer.account}" readonly />
            </li>
            <li>
                <label for="point">积分</label>
                <input type="text" name="point" id="point" value="${Customer.points}" readonly />
            </li>
            <li>
                <label for="gender">个人喜好</label>
                <input type="text" name="gender" id="gender" value="${Customer.getGender()}" readonly />
            </li>
        </ul>
        <button class="reserve" id="edit">修改</button>
    </form>
</div>

<jsp:include page="end.jsp"></jsp:include>

</body>
</html>
