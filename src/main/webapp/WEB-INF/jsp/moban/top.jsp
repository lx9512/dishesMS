<%--
  Created by IntelliJ IDEA.
  User: yzp
  Date: 2018/4/4
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; %>
<base href="<%=basePath%>">

<html>
<head>
    <title>美食城网站</title>


    <%--<link rel="stylesheet" href="../../../pro2/default.css">--%>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7"/>
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <link rel="stylesheet" href="default.css">

</head>
<body>

<header>
    <div class="header-nav">
        <div role="navigation">
            <a href="#" rel="home" class="hd-logo" title="DishesManagerSystem"><img src="images/logo.png"></a>
            <ul class="hd-nav">
                <li class="search-box-li">
                    <div><input type="text" name="search-keyword" placeholder="输入关键词" form="search-keyword"><i
                            class="iconfont search-submit">&#xe617;</i></div>
                    <i class="search-exit"></i></li>
                <li><a href="/customerJump/homepage" name="index">网站首页<span><i class="iconfont ">&#xe6aa;</i></span></a></li>
                <li><a href="/customerJump/viewDishes" name="productlist">菜式欣赏<span><i class="iconfont ">&#xe6aa;</i></span></a></li>
                <li><a href="/customerJump/viewOrder" name="article">订单确认<span><i class="iconfont ">&#xe6aa;</i></span></a></li>
                <li><a href="/customerJump/contact" name="contact">在线预订<span><i class="iconfont ">&#xe6aa;</i></span></a></li>
                <li><a href="/customerJump/selfPage" name="about">个人中心<span><i class="iconfont ">&#xe6aa;</i></span></a></li>
            </ul>

            <div class="motai"></div>
            <ul>
                <li><a><i class="iconfont search-botton">&#xe617;</i></a></li>
                <li><a href="/customerJump/login">登录</a></li>
                <li><a href="#">注销</a></li>
                <li><a><i class="iconfont nav-bottom">&#xe61f;</i></a></li>
            </ul>

        </div>
        <div class="search-box">
            <form method="post" action="/customer/searchDishes" id="search-keyword">
                <input type="text" name="searchKey" placeholder="请输入您的内容">
                <span>
                </span>
            </form>

        </div>

    </div>

    <div class="header-carousel container">

        <div id="myCarousel" class="carousel slide">
            <!-- 轮播（Carousel）指标 -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
            </ol>
            <!-- 轮播（Carousel）项目 -->
            <div class="carousel-inner">
                <div class="item active">
                    <img src="images/banner.jpg" style="width:100%;" alt="First slide">
                </div>
                <div class="item">
                    <img src="images/banner2.jpg" style="width:100%;" alt="Second slide">
                </div>
                <div class="item">
                    <img src="images/banner3.jpg" style="width:100%;" alt="Third slide">
                </div>
            </div>
            <!-- 轮播（Carousel）导航 -->
            <a class="carousel-control left" href="#myCarousel"
               data-slide="prev"></a>
            <a class="carousel-control right" href="#myCarousel"
               data-slide="next"></a>
        </div>

    </div>
</header>
</body>
</html>