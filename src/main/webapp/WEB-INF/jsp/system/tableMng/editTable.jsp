<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/4/2
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑桌台</title>
</head>
<body>
<form action="/table/add">
    区域名称：
    <select name="areaName">
        <option value="" selected = "selected">请选择</option>
        <option value="A">A</option>
        <option value="B">B</option>
        <option value="C">C</option>
        <option value="D">D</option>
    </select><br>
    桌台号：
    <input type="text" name="number" value="">
    <br>
    容客人数：
    <input type="text" name="peopleNum" value="">
    <br>
    描述：
    <input type="text" name="describe" value="">
    <br>
    <input type="submit">
</form>
</body>
</html>
