<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/4/9
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script>
    var genderCheck = function () {
        var m = document.getElementById("m");
        var f = document.getElementById("f");
        if(m.value == ${selfInfo.gender})
            m.checked();
        else
            f.checked();
        
    }
</script>
<html>
<head>
    <title>修改个人资料</title>
</head>
<body onload="genderCheck()">
<form>
    员工号:<input type="text" name="account" value="${selfInfo.account}" readonly>
    姓名：<input type="text" name="name" value="${selfInfo.name}">
    性别
    <input type="radio" name="gender" value="男" id="m"><label>男</label>
    <input type="radio" name="gender" value="女" id="f"><label>女</label>
    身份证号：<input type="text" name="idCard" value="${selfInfo.idCard}">
    电话：<input type="text" name="tel" value="${selfInfo.tel}">
    电子邮箱:<input type="text" name="email" value="${selfInfo.email}">
    <input type="button" onclick="submit()" value="修改">
    <input type="button" onclick="window.history.back()" value="返回">
</form>
</body>
</html>
