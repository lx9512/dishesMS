<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/"; %>
<base href="<%=basePath%>">
<html>
<head>
    <title>DishesManagerSystem</title>

    <%--<link rel="stylesheet" href="../../../pro2/default.css">--%>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7"/>
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="refresh" content="60">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <meta name="description" content=""/>
    <meta name="keywords" content=""/>
    <link rel="stylesheet" href="default.css">

</head>
<body>

<jsp:include page="top.jsp"></jsp:include>
<main>
    <div>
        <div class="main-head">
            <p><span>已点菜单</span></p>
        </div>
    </div>
    <input type="text" style="border:0px;background:none;" readonly autofocus/>
    <%--
       多个相同的name来完成list
    --%>
    <c:choose>
        <c:when test="${orderList == null}">
            <p>你好！您还没有进行点餐</p>
        </c:when>
        <c:otherwise>
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead class="thead-inverse">
                    <tr>
                        <th>图片</th>
                        <th width="180">
                            订单信息<br>
                            (Tips:看清楚菜的口味和价格哟~~)
                        </th>
                        <th>订单份数<br>
                            （Tips：只可以减少未做完的部分）</th>
                        <th>
                            未完成份数<br>
                            (Tips:菜上的慢可以取消订单哟！！)
                        </th>
                        <th>
                            完成份数<br>
                            (Tip：菜已经在准备好了哟！！随时准备开口大吃吧~~~)
                        </th>
                        <th>可执行操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="order" items="${orderList}">

                        <tr>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <th>

                                <img src="images/foodlist${order.getDishesinfoId()}.jpg" class="img-responsive"
                                     alt="not find"/>

                            </th>
<%--需要更多的信息 dishes 菜品的信息来填充此页面--%>
                            <th width="180">
                                订单号：${order.getId()}<br>
                                 菜名：${order.getDishes().getName()}<br>
                                 口味 ：${order.getDishes().getDishesVariety().getDescribe()}<br>
                                价格： ${order.getDishes().getPrice()}
                            </th>
                            <th>
                                ${order.getNumber()}<br>
                                <a href="/Order/addNumber/${order.getId()}">加一</a>&nbsp;
                                <a href="/Order/subNumber/${order.getId()}">${order.getUntreateStatus()>0?"减一":""}</a><br>

                            </th>
                            <th>${order.getUntreateStatus()} <br>
                                <a href="/Order/deleteOrder/${order.getId()}">${order.getUntreateStatus()>0?"不要了":""}</a>

                            </th>
                            <th>
                                ${order.getCompleteStatus()}<br>
                            </th>

                            <th>
                                <a href="#"> ${order.getUntreateStatus()>0?"催一下":""}</a>
                                <a href="#"> ${order.getCompleteStatus()==order.getNumber()?"点评一下":""}</a>
                            </th>
                            </tr>


                        <%--<td>订单状态：${order.getInfoStatus()==0 ? "未下单":order.getInfoStatus()==1?"未出锅":--%>
                        <%--order.getInfoStatus()==2?"未上桌":order.getInfoStatus()==3?"已完成":"订单已取消" }</td>--%>

                        <%--<td>${order.getAcridity()>0?"辣":"不辣"}</td>--%>
                        <%--<td>--%>
                        <%--<a href="/customer/orderDishes?id=${dishes.getId()}">点餐</a>--%>
                        <%--</td>--%>

                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </c:otherwise>
    </c:choose>
</main>

<%--<ul class="main-submenu main-submenu-second"  >--%>
<%--<li><a href="#">最新新闻</a></li>--%>
<%--<li><a href="#">餐厅新闻</a></li>--%>
<%--<li><a href="#">美食热闻</a></li>--%>
<%--<li><a href="#">甜品站</a></li>--%>
<%--</ul>--%>
<%--<input type="text" style="border:0px;background:none;" readonly autofocus/>--%>
<%--<div class="article-list-banner"><img src="images/foodnews1.jpg"></div>--%>
<%--<ul class="article-list">--%>
<%--<li>--%>
<%--<div class="article-date">--%>
<%--<strong>06</strong>--%>
<%--<p>2017-06-01</p>--%>

<%--</div>--%>
<%--<div class="article-info">--%>
<%--<a href="article_list_content.jsp">--%>
<%--<h3>一大波餐饮大咖正在分享经营经验，你需要的都在这里！</h3>--%>
<%--<p>大多数老餐饮人都有一种感觉，那就是近几年像原来那样按部就班地赚钱好像越来越难了，行业里的“套路”越来越深。行业竞争...</p>--%>
<%--</a>--%>
<%--</div>--%>
<%--</li>--%>

<%--<li>--%>
<%--<div class="article-date">--%>
<%--<strong>06</strong>--%>
<%--<p>2017-06-01</p>--%>
<%--</div>--%>
<%--<div class="article-info">--%>
<%--<a href="article_list_content.jsp">--%>
<%--<h3>一大波餐饮大咖正在分享经营经验，你需要的都在这里！</h3>--%>
<%--<p>大多数老餐饮人都有一种感觉，那就是近几年像原来那样按部就班地赚钱好像越来越难了，行业里的“套路”越来越深。行业竞争...</p>--%>
<%--</a>--%>
<%--</div>--%>
<%--</li>--%>
<%--<li>--%>
<%--<div class="article-date">--%>
<%--<strong>06</strong>--%>
<%--<p>2017-06-01</p>--%>
<%--</div>--%>
<%--<div class="article-info">--%>
<%--<a href="article_list_content.jsp">--%>
<%--<h3>一大波餐饮大咖正在分享经营经验，你需要的都在这里！</h3>--%>
<%--<p>大多数老餐饮人都有一种感觉，那就是近几年像原来那样按部就班地赚钱好像越来越难了，行业里的“套路”越来越深。行业竞争...</p>--%>
<%--</a>--%>
<%--</div>--%>
<%--</li>--%>
<%--<li>--%>
<%--<div class="article-date">--%>
<%--<strong>06</strong>--%>
<%--<p>2017-06-01</p>--%>
<%--</div>--%>
<%--<div class="article-info">--%>
<%--<a href="article_list_content.jsp">--%>
<%--<h3>一大波餐饮大咖正在分享经营经验，你需要的都在这里！</h3>--%>
<%--<p>大多数老餐饮人都有一种感觉，那就是近几年像原来那样按部就班地赚钱好像越来越难了，行业里的“套路”越来越深。行业竞争...</p>--%>
<%--</a>--%>
<%--</div>--%>
<%--</li>--%>
<%--<li>--%>
<%--<div class="article-date">--%>
<%--<strong>06</strong>--%>
<%--<p>2017-06-01</p>--%>
<%--</div>--%>
<%--<div class="article-info">--%>
<%--<a href="article_list_content.jsp">--%>
<%--<h3>一大波餐饮大咖正在分享经营经验，你需要的都在这里！</h3>--%>
<%--<p>大多数老餐饮人都有一种感觉，那就是近几年像原来那样按部就班地赚钱好像越来越难了，行业里的“套路”越来越深。行业竞争...</p>--%>
<%--</a>--%>
<%--</div>--%>
<%--</li>--%>
<%--<li>--%>
<%--<div class="article-date">--%>
<%--<strong>06</strong>--%>
<%--<p>2017-06-01</p>--%>
<%--</div>--%>
<%--<div class="article-info">--%>
<%--<a href="article_list_content.jsp">--%>
<%--<h3>一大波餐饮大咖正在分享经营经验，你需要的都在这里！</h3>--%>
<%--<p>大多数老餐饮人都有一种感觉，那就是近几年像原来那样按部就班地赚钱好像越来越难了，行业里的“套路”越来越深。行业竞争...</p>--%>
<%--</a>--%>
<%--</div>--%>
<%--</li>--%>
<%--</ul>--%>
<%--<section class="article-btn">--%>
<%--<span class="article-prev-btn"></span>--%>
<%--<span class="article-next-btn"></span>--%>
<%--</section>--%>
<%--<nav aria-label="Page navigation" class="article-page">--%>
<%--<ul class="pagination">--%>
<%--<li><a href="#">1</a></li>--%>
<%--<li><a href="#">2</a></li>--%>
<%--<li><a href="#">3</a></li>--%>
<%--<li><a href="#">4</a></li>--%>
<%--<li>--%>
<%--<a href="#" aria-label="Next">--%>
<%--<span aria-hidden="true">下一页</span>--%>
<%--</a>--%>
<%--</li>--%>
<%--</ul>--%>
<%--</nav>--%>
<%--</main>--%>

<jsp:include page="end.jsp"></jsp:include>


</body>

<script src="lib/jquery/jquery.js"></script>
<script src="lib/bootstrap/bootstrap.js"></script>
<script src="js/main.js"></script>
</html>