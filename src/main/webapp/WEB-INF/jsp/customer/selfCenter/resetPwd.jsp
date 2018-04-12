<%--
  Created by IntelliJ IDEA.
  User: yzp
  Date: 2018/3/14
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<html>
<body>
<div style="width: 100%">
    <jsp:include page="/customerJump/getTop"></jsp:include>
</div>
<div class="panel panel-default center-pill center" style="width: 200px">
    <div class="text-input">
        <input type="password" name="oldPwd">
        <input type="password" name="newPwd">
        <input type="password" name="sNewPwd">
    </div>
</div>
</body>
</html>