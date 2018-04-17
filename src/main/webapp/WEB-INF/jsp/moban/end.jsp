<%--
  Created by IntelliJ IDEA.
  User: yzp
  Date: 2018/4/4
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; %>
<base href="<%=basePath%>">

<html>
<head>
    <title>Title</title>
</head>
<body>
<footer>
    <div>
        <ul class="footer-top">
            <li><a href="/customerJump/homepage">网站首页</a></li>
            <li><a href="about.jsp">个人中心</a></li>
            <li><a href="/customerJump/viewDishes">菜式欣赏</a></li>
            <li><a href="/customerJump/viewOrder">美食资讯</a></li>
            <li><a href="contact.jsp">在线预订</a></li>
        </ul>
    </div>
    <div>
        <ul class="footer-body">
            <li>
                <span>电话:</span><span>9999999999</span>
            </li>
            <li>
                <span>邮箱:</span><span>yuanzhiroc@163.com</span>
            </li>
            <li>
                <span>地址:</span><span>湖南省XX市XXX大道XXX办公室</span>
            </li>
        </ul>
        <P><span><a href="" target="_blank" title="DM">DM</a>More help for <a href="" target="_blank" title="DM">YZP </a>
          and <a href="" title="design" target="_blank">LX</a></span></P>
        <ul class="footer-footer">
            <li><i class="iconfont ">&#xe613;</i></li>
            <li><i class="iconfont ">&#xe634;</i></li>
            <li><i class="iconfont ">&#xe602;</i></li>
        </ul>
    </div>
</footer>

</body>
</html>
