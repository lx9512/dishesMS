<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/jquery.cookie/1.4.1/jquery.cookie.min.js"></script>

<html>
<head>
<title>add role</title>
</head>

<body>
    <form action="add">
        <label>职位名称:</label>
        <input type="text" id="title" name="title">
        <br>
        <label>描述:</label>
        <input type="text" name="discribe">
        <br>
        <input type="submit" value="提交">
    </form>
    <a href="/staff/jumpAdd">新增员工</a>
</body>
</html>