<%--
  Created by IntelliJ IDEA.
  User: yzp
  Date: 2018/3/12
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/jquery.cookie/1.4.1/jquery.cookie.min.js"></script>

<html>
<body>
<div style="width: 100%">
    <jsp:include page="/customerJump/getTop"></jsp:include>
</div>
<div class="panel panel-default center-block" style="width: 200px;">

    <div class="form-group">
        <label class="sr-only" for="account">账户名：</label>
        <input type="text" class="form-control" id="account" value=${customer.getAccount()} readonly>
    </div>
    <%--<input type="button" name="resetPassword" value="修改密码"> <!-- 跳转到修改密码页面-->--%>
    <div class="form-group">
        <label for="name">姓名：</label>
        <input type="text" class="form-control" id="name" value=${customer.getName()} readonly>
    </div>
    <div class="form-group">
        <label class="sr-only" for="tel">电话号码：</label>
        <input type="text" class="form-control" id="tel" value=${customer.getTel()} readonly>
    </div>
    <div class="form-group">
        <label class="sr-only" for="gender">性别：</label>
        <input type="text" class="form-control" id="gender" value=${customer.getGender()} readonly>
    </div>
    <div class="form-group">
        <label class="sr-only" for="email">电子邮件：</label>
        <input type="text" class="form-control" id="email" value=${customer.getEmail()} readonly>
    </div>
    <%--<input type="submit" value="保存">--%>
</div>
</body>
</html>