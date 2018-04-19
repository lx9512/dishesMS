<%--
  Created by IntelliJ IDEA.
  User: yzp
  Date: 2018/4/19
  Time: 3:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="#" method="post" >
    <ul>
        <li>
            <label for="username">姓名</label>
            <input type="text" name="name" id="username" placeholder="${Customer.getName()}" />
        </li>
        <li>
            <label for="phonenumber">电话号码</label>
            <input type="text" name="tel" id="phonenumber" placeholder="${Customer.getTel()}"  />
        </li>
        <li>
            <label for="email">电子邮件</label>
            <input type="text" name="email" id="email" placeholder="${Customer.getEmail()}"  />
        </li>
        <li>
            <label for="time">出生日期</label>
            <input type="text" name="time" id="time" placeholder="${Customer.getBirthDate()}" />
        </li>
        <li>
            <label for="account">账户名</label>
            <input type="text" name="account" id="account" placeholder="${Customer.account}" />
        </li>
        <li>
            <label for="gender">个人喜好</label>
            <input type="text" name="gender" id="gender" placeholder="${Customer.getGender()}"  />
        </li>
    </ul>
    <a class="reserve"  href="">保存</a>
</form>
</body>
</html>
