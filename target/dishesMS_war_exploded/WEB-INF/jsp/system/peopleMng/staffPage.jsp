<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/3/2
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>人员管理</title>
</head>
<body>
<div>
    <h4>员工管理</h4>
    <a href="/staff/jumpAdd">新建</a>

    <table>
        <thead>
        <tr>
            <td>id</td>
            <td>姓名</td>
            <td>性别</td>
            <td>职位</td>
            <td>身份号</td>
            <td>电话号</td>
            <td>电子邮箱</td>
            <td>员工号</td>
            <td>操作</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="staff" items="${staffs}">
            <tr>
                <td>${staff.id}</td>
                <td>${staff.name}</td>
                <td>${staff.gender}</td>
                <td>${staff.role.title}</td>
                <td>${staff.idCard}</td>
                <td>${staff.tel}</td>
                <td>${staff.email}</td>
                <td>${staff.account}</td>
                <td>
                    <a href="/staff/jumpEdit?id=${staff.id}">编辑</a>
                    <a href="/staff/drop?id=${staff.id}">删除</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>

