<%--
  Created by IntelliJ IDEA.
  User: yzp
  Date: 2018/3/13
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="http://apps.bdimg.com/libs/jquery.cookie/1.4.1/jquery.cookie.min.js"></script>
<!doctype html>
<html>
<head>
    <title>餐厅管理系统</title>
</head>
<body>

<%--完成页面跳转--%>
<script >
    function loadUrl( url ){
        var hashArr = ['viewDishes','viewOrder','selfMsg','checkMsg','checkPwd','viewSpend','viewLike'];
        var hashMsg;
        hashMsg = hashArr.indexOf( url ) > -1 ? '/customerJump/'+ url : '/customerJump/homepage';
        $("#view").load( hashMsg);
        return false;
    }
</script>

<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="javascript:void(0)" onclick="loadUrl('homepage')">餐厅管理系统</a>
        </div>
        <div>
            <ul class="nav navbar-nav">
                <li><a href="javascript:void(0)" onclick="loadUrl('viewDishes')">查看菜单</a></li>
                <li><a href="javascript:void(0)" onclick="loadUrl('viewOrder')">查看已点菜品</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        个人中心
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="javascript:void(0)" onclick="loadUrl('selfMsg')">查看个人信息</a></li>
                        <li><a href="javascript:void(0)" onclick="loadUrl('checkMsg')">修改个人信息</a></li>
                        <li><a href="javascript:void(0)" onclick="loadUrl('checkPwd')">修改密码</a></li>

                        <li class="divider"></li>
                        <li><a href="javascript:void(0)" onclick="loadUrl('viewSpend')">查看消费记录</a></li>
                        <li class="divider"></li>
                        <li><a href="javascript:void(0)" onclick="loadUrl('viewLike')">查看喜好推荐</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="container" id="view">
</div>

<%--<script id="homePage" type="text/html">--%>
    <%--<div > 默认主页</div>--%>
<%--</script>--%>
<%--<script id="viewDishes" type="text/html">--%>
    <%--<div>--%>

    <%--</div>--%>
<%--</script>--%>
<%--<script id="viewOrder" type="text/html">--%>
    <%--<div>--%>

    <%--</div>--%>
<%--</script>--%>
<%--<script id="selfMsg" type="text/html">--%>
    <%--<div>--%>
        <%--<jsp:include page="/customer/jumpToCustomer"></jsp:include>--%>
    <%--</div>--%>
<%--</script>--%>

<%--<script id="checkMsg" type="text/html">--%>
    <%--<div>--%>

    <%--</div>--%>
<%--</script>--%>
<%--<script id="checkPwd" type="text/html">--%>
    <%--<div>--%>

    <%--</div>--%>
<%--</script>--%>
<%--<script id="viewSpend" type="text/html">--%>
    <%--<div>--%>

    <%--</div>--%>
<%--</script>--%>
<%--<script id="viewLike" type="text/html">--%>
    <%--<div>--%>

    <%--</div>--%>
<%--</script>--%>
<%--<script type="text/javascript">--%>
    <%--$(function () {--%>
        <%--var hashMsg = location.hash;--%>
        <%--hashPage(hashMsg);--%>
        <%--$(window).on('hashchange',function(e){--%>
            <%--hashMsg = location.hash;--%>
            <%--hashPage(hashMsg);--%>
        <%--})--%>
    <%--});--%>
    <%--function hashPage(hashMsg)--%>
    <%--{--%>
        <%--var hashArr = ['#viewDishes','#viewOrder','#selfMsg','#checkMsg','#checkPwd','#viewSpend','#viewLike'];--%>
        <%--var hashBodyArr = ['#addPeople','#info'];--%>
        <%--var demo = $('#view');--%>
        <%--var bodyDemo = $('#body');--%>
        <%--hashMsg = hashArr.indexOf(hashMsg) > -1 ? hashMsg :(hashBodyArr.indexOf(hashMsg) > -1?hashMsg:'#homePage') ;--%>
        <%--if(hashBodyArr.indexOf(hashMsg) > -1)--%>
        <%--{--%>

            <%--bodyDemo.html($(hashMsg).html());--%>
        <%--}--%>
        <%--else{--%>
            <%--demo.html($(hashMsg).html());--%>

        <%--}--%>
    <%--}--%>
<%--</script>--%>
</body>
</html>
