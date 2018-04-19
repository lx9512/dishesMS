<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/"; %>
<base href="<%=basePath%>">

<html>
<body>
<jsp:include page="top.jsp"></jsp:include>
<%--<main >--%>

<%--<div>--%>
<%--<div class="main-head">--%>
<%--<p>--%>
<%--<span>菜式欣赏</span>--%>
<%--</p>--%>
<%--</div>--%>
<%--</div>--%>
<%--</main>--%>
<%--<main>--%>
<%--<img class="mdbanner" src="images/mdbanner.jpg">--%>
<%--</main>--%>
<%--<main>--%>
<%--<div class="main-body">--%>
<%--<p><span>每一种食物来源都经过我们的精挑细选，关于食材我们只选最天然、健康、优质的，只为一份对极致美味的追求，用心做好每一份菜，是我们不变的宗旨。</span></p>--%>
<%--<ul class="main-body-img">--%>
<%--<li><img src="images/mdlist1.jpg"></li>--%>
<%--<li><img src="images/mdlist2.jpg"></li>--%>
<%--<li><img src="images/mdlist3.jpg"></li>--%>
<%--<li><img src="images/mdlist4.jpg"></li>--%>
<%--<li><img src="images/mdlist5.jpg"></li>--%>
<%--<li><img src="images/mdlist6.jpg"></li>--%>
<%--<li><img src="images/mdlist7.jpg"></li>--%>
<%--<li><img src="images/mdlist8.jpg"></li>--%>
<%--<li><img src="images/mdlist9.jpg"></li>--%>
<%--</ul>--%>
<%--</div>--%>
<%--</main>--%>
<c:choose>
    <c:when test="${haveTable==null}">
        <div class="main-head">
            <span><p>选择桌台号(请登录后选择)</p></span>
        </div>
        <div class="text-left">
            <c:forEach var="table" items="${Tables}">
                <c:if test="${table.getStatus() == 0}">
                    <a href="/table/lockTable/${table.getId()}">
                            ${table.getAreaName()}${table.getNumber()}:&nbsp;&nbsp;${table.getPeopleNum()}人,位置：${table.getDescribe()}
                    </a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                </c:if>
            </c:forEach>
        </div>
    </c:when>
    <c:otherwise>
        <div class="main-head">
            <span><p>您的桌台号为：${haveTable}</p></span>
        </div>
    </c:otherwise>
</c:choose>
<input type="text" style="border:0px;background:none;" readonly autofocus/>
<main>
    <div class="main-head">
        <span><p>菜单列表</p></span>
    </div>
    <ul class="main-submenu">
        <li><a href="/Order/getDishesByDescribe/主菜">主菜</a></li>
        <li><a href="/Order/getDishesByDescribe/蔬菜">蔬菜</a></li>
        <li><a href="/Order/getDishesByDescribe/甜品">甜品</a></li>
        <li><a href="/Order/getDishesByDescribe/饮品">饮品</a></li>
    </ul>

    <ul class="main-submenu-info main-submenu-first">
        <c:forEach var="dishes" items="${DishesList}">
            <li><a href="/Order/addOrder/${dishes.getId()}">
                <div class="food-name">
                    <p>${dishes.getName()}</p>
                    <p>${dishes.getAcridity()>0?"辣":"不辣"}</p>
                </div>
                <div class="food-price">
                    <p>￥<span>${dishes.getPrice()}</span></p>
                </div>
                <div class="img-bg"></div>
                <img src="images/foodlist${dishes.getId()}.jpg" style="width: 330px; height: 220px;"></a></li>
        </c:forEach>

        <%--<li><a href="#">--%>
        <%--<div class="food-name">--%>
        <%--<p>玫瑰香酥西兰花</p>--%>
        <%--<p>Rose fried broccoli</p>--%>
        <%--</div>--%>
        <%--<div class="food-price">--%>
        <%--<p>￥<span>25</span></p>--%>
        <%--</div>--%>
        <%--<div class="img-bg"></div>--%>
        <%--<img src="images/foodlist2.jpg"></a></li>--%>
        <%--<li><a href="#"><img src="images/foodlist3.jpg"></a></li>--%>
        <%--<li><a href="#"><img src="images/foodlist4.jpg"></a></li>--%>
        <%--<li><a href="#"><img src="images/foodlist5.jpg"></a></li>--%>
        <%--<li><a href="#"><img src="images/foodlist6.jpg"></a></li>--%>
    </ul>
    <%--<nav aria-label="Page navigation">--%>
    <%--<ul class="pagination">--%>
    <%--<li><a href="#">1</a></li>--%>
    <%--<li><a href="#">2</a></li>--%>
    <%--<li><a href="#">3</a></li>--%>
    <%--<li><a href="#">4</a></li>--%>
    <%--<li><a href="#">5</a></li>--%>
    <%--<li>--%>
    <%--<a href="#" aria-label="Next">--%>
    <%--<span aria-hidden="true">下一页</span>--%>
    <%--</a>--%>
    <%--</li>--%>
    <%--</ul>--%>
    <%--</nav>--%>
</main>
<%--<main>--%>

<%--<div class="main-head">--%>
<%--<p><span>在线预定</span></p>--%>
<%--</div>--%>
<%--<div class="main-reserve">--%>
<%--<form action="#" method="post" id="food-reserve">--%>
<%--<ul>--%>
<%--<li>--%>
<%--<label for="username">姓名</label>--%>
<%--<input type="text" name="username" id="username">--%>
<%--</li>--%>
<%--<li>--%>
<%--<label for="phonenumber">电话号码</label>--%>
<%--<input type="text" name="phonenumber" id="phonenumber">--%>
<%--</li>--%>
<%--<li>--%>
<%--<label for="email">电子邮件</label>--%>
<%--<input type="text" name="email" id="email">--%>
<%--</li>--%>
<%--<li>--%>
<%--<label for="time">时间</label>--%>
<%--<input type="text" name="time" id="time">--%>
<%--</li>--%>
<%--<li>--%>
<%--<label for="numberofpeople">人数</label>--%>
<%--<input type="text" name="numberofpeople" id="numberofpeople">--%>
<%--</li>--%>
<%--<li>--%>
<%--<label for="date">日期</label>--%>
<%--<input type="text" name="date" id="date">--%>
<%--</li>--%>
<%--<li>--%>
<%--<label for="guestbook">留言</label>--%>
<%--<input type="text" name="guestbook" id="guestbook">--%>
<%--</li>--%>
<%--</ul>--%>
<%--<a class="reserve">预定</a>--%>

<%--</form>--%>
<%--</div>--%>


<%--</main>--%>

<jsp:include page="end.jsp"></jsp:include>


</body>

<script src="lib/jquery/jquery.js"></script>
<script src="lib/bootstrap/bootstrap.js"></script>
<script src="js/main.js"></script>
</html>