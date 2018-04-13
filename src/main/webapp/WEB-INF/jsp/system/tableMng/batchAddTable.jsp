<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/3/28
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>批量新增桌台</title>
</head>
<body>
<form action="/table/batchAdd">
    区域名称：
    <select name="areaName">
        <option value="" >请选择</option>
        <option value="A">A</option>
        <option value="B">B</option>
        <option value="C">C</option>
        <option value="D">D</option>
    </select><br>
    桌号范围：
    <input type="text" name="startNum">-<input type="text" name="endNum">
    <br>
    容客人数：
    <input type="text" name="peopleNum">
    <br>
    描述：
    <input type="text" name="describe">
    <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
