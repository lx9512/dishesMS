<%--
  Created by IntelliJ IDEA.
  User: yzp
  Date: 2018/4/16
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<html>
<head>
    <title>Register</title>
</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="login-panel panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Please Fill From</h3>
                </div>
                <div class="panel-body">
                    <form role="form" action="/customer/register" method="post">
                        <fieldset>
                            <div class="form-group">
                                <input class="form-control" placeholder="账号" name="name" type="text" autofocus/>
                            </div>
                            <div class="form-group">
                                <input class="" placeholder="姓名" name="account" type="text"/>
                            </div>
                            <div class="form-group">
                                <label class="radio-inline">
                                    <input type="radio" name="gender" value="male" checked> male
                                </label>
                                <label class="radio-inline">
                                    <input type="radio" name="gender" value="female"> female
                                </label>
                            </div>
                            <div class="form-group">
                                <input class="form-control" placeholder="密码" name="password" type="text"/>
                            </div>
                            <div class="form-group">
                                <input class="form-control" placeholder="确认密码" name="rePassword" type="text"/>
                            </div>

                            <!-- Change this to a button or input when using this as a form -->
                            <input type="submit" name="submit"
                                   class="btn btn-lg btn-register btn-block" value="Register">
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
