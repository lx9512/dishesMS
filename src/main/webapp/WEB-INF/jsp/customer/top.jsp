<%--
  Created by IntelliJ IDEA.
  User: yzp
  Date: 2018/3/28
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="//apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="//apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>


<html>
<head>
    <title>Title</title>
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand active" href="/customerJump/homepage" <%--javascript:void(0)" onclick="eloadUrl('homepag')--%>>餐厅管理系统</a>
        </div>
        <div>
            <ul class="nav navbar-nav">
                <li><a href="/customerJump/viewDishes"<%--javascript:void(0)" onclick="loadUrl('viewDishes')--%>>查看菜单</a></li>
                <li><a href="/customerJump/viewOrder"<%--javascript:void(0)" onclick="loadUrl('viewOrder')--%>>查看已点菜品</a></li>
                <li class="dropdown">
                    <a  class="dropdown-toggle" data-toggle="dropdown">
                        个人中心
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="/customerJump/selfMsg"<%--javascript:void(0)" onclick="loadUrl('selfMsg')--%>>查看个人信息</a></li>
                        <li><a href="/customerJump/checkMsg"<%--javascript:void(0)" onclick="loadUrl('checkMsg')--%>>修改个人信息</a></li>
                        <li><a href="/customerJump/checkPwd"<%--javascript:void(0)" onclick="loadUrl('checkPwd')--%>>修改密码</a></li>

                        <li class="divider"></li>
                        <li><a href="/customerJump/viewSpend"<%--javascript:void(0)" onclick="loadUrl('viewSpend')--%>>查看消费记录</a></li>
                        <li class="divider"></li>
                        <li><a href="/customerJump/viewLike"<%--javascript:void(0)" onclick="loadUrl('viewLike')--%>>查看喜好推荐</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
</body>
</html>
