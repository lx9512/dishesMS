<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; %>
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
<meta name="author" content="www.cssmoban.com" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="default.css">

</head>
<body>
<jsp:include page="top.jsp"></jsp:include>

<main class="main-first-bgcolor">
    <div>
        <div class="main-head">
            <p>
                <span>我们提供</span>
            </p>
        </div>
        <div class="main-we-provide">
            <ul>
                <li><span><img src="images/lunch.png" alt=""></span>
                    <h2>中餐</h2>
                    <p>公司目前经营的范围包括：电子商务平台开发技术支持、技术转让、运维技术服务大数据、云计算等。</p></li>
                <li><span><img src="images/dinner.png" alt=""></span>
                    <h2>晚餐</h2>
                    <p>公司目前经营的范围包括：电子商务平台开发技术支持、技术转让、运维技术服务大数据、云计算等。</p></li>
                <li><span><img src="images/coffee.png" alt=""></span>
                    <h2>甜品/咖啡</h2>
                    <p>公司目前经营的范围包括：电子商务平台开发技术支持、技术转让、运维技术服务大数据、云计算等。</p></li>
            </ul>
        </div>
    </div>

    <div>
        <div class="main-head">
            <p>
                <span>菜式欣赏</span>
            </p>
        </div>
    </div>
</main>
<div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >网页模板</a></div>
<main>
    <img class="mdbanner" src="images/mdbanner.jpg">
</main>
<main>
    <div class="main-body">
        <p><span>每一种食物来源都经过我们的精挑细选，关于食材我们只选最天然、健康、优质的，只为一份对极致美味的追求，用心做好每一份菜，是我们不变的宗旨。</span></p>
        <ul class="main-body-img">
            <li><img src="images/mdlist1.jpg"></li>
            <li><img src="images/mdlist2.jpg"></li>
            <li><img src="images/mdlist3.jpg"></li>
            <li><img src="images/mdlist4.jpg"></li>
            <li><img src="images/mdlist5.jpg"></li>
            <li><img src="images/mdlist6.jpg"></li>
            <li><img src="images/mdlist7.jpg"></li>
            <li><img src="images/mdlist8.jpg"></li>
            <li><img src="images/mdlist9.jpg"></li>
        </ul>
    </div>
</main>
<main>
    <ul class="main-submenu">
        <li><a href="#">午餐</a></li>
        <li><a href="#">晚餐</a></li>
        <li><a href="#">甜品</a></li>
        <li><a href="#">饮料</a></li>
    </ul>
    <ul class="main-submenu-info main-submenu-first">
        <li><a href="#">
            <div class="food-name">
                <p>玫瑰香酥西兰花</p>
                <p>Rose fried broccoli</p>
            </div>
            <div class="food-price">
                <p>￥<span>25</span></p>
            </div>
            <div class="img-bg"></div>
            <img src="images/foodlist1.jpg"></a></li>
        <li><a href="#">
            <div class="food-name">
                <p>玫瑰香酥西兰花</p>
                <p>Rose fried broccoli</p>
            </div>
            <div class="food-price">
                <p>￥<span>25</span></p>
            </div>
            <div class="img-bg"></div>
            <img src="images/foodlist2.jpg"></a></li>
        <li><a href="#"><img src="images/foodlist3.jpg"></a></li>
        <li><a href="#"><img src="images/foodlist4.jpg"></a></li>
        <li><a href="#"><img src="images/foodlist5.jpg"></a></li>
        <li><a href="#"><img src="images/foodlist6.jpg"></a></li>
    </ul>
    <a class="more" href="#">MORE</a>
</main>
<main>
    <div>
        <div class="main-head">
            <p><span>美食资讯</span></p>
        </div>
    </div>
    <ul class="main-submenu main-submenu-second">
        <li><a href="#">最新新闻</a></li>
        <li><a href="#">餐厅新闻</a></li>
        <li><a href="#">美食热闻</a></li>
        <li><a href="#">甜品站</a></li>
    </ul>
    <ul class="main-submenu-info ">
        <li><a href="#">
            <div class="activity-duration">
                <img  src="images/activity-duration.png">
                <p>6-1日</p>
            </div>
            <img src="images/foodnewlist1.jpg">
            <h1 class="food-head">周末轻松制作美味甜品</h1>
            <p class="food-info">每个周末都抽出一个小时的时间来为自己做一份甜品，让周末的休闲充满制作甜蜜和品尝甜蜜的快乐。</p>
        </a></li>
        <li><a href="#">
            <div class="activity-duration">
                <img src="images/activity-duration.png">
                <p>6-1日</p>
            </div>
            <img  src="images/foodnewlist1.jpg">
            <h1 class="food-head">周末轻松制作美味甜品</h1>
            <p class="food-info">每个周末都抽出一个小时的时间来为自己做一份甜品，让周末的休闲充满制作甜蜜和品尝甜蜜的快乐。</p>
        </a></li>
        <li><a href="#">
            <div class="activity-duration">
                <img src="images/activity-duration.png">
                <p>6-1日</p>
            </div>
            <img src="images/foodnewlist1.jpg">
            <h1 class="food-head">周末轻松制作美味甜品</h1>
            <p class="food-info">每个周末都抽出一个小时的时间来为自己做一份甜品，让周末的休闲充满制作甜蜜和品尝甜蜜的快乐。</p>
        </a></li>

    </ul>
    <a class="more" href="#">MORE</a>
</main>
<main>

        <div class="main-head">
            <p><span>在线预定</span></p>
        </div>
        <div class="main-reserve">
            <form action="#" method="post" id="food-reserve">
                <ul>
                    <li>
                        <label for="username">姓名</label>
                        <input type="text" name="username" id="username">
                    </li>
                    <li>
                        <label for="phonenumber">电话号码</label>
                        <input type="text" name="phonenumber" id="phonenumber">
                    </li>
                    <li>
                        <label for="email">电子邮件</label>
                        <input type="text" name="email" id="email">
                    </li>
                    <li>
                        <label for="time">时间</label>
                        <input type="text" name="time" id="time">
                    </li>
                    <li>
                        <label for="numberofpeople">人数</label>
                        <input type="text" name="numberofpeople" id="numberofpeople">
                    </li>
                    <li>
                        <label for="date">日期</label>
                        <input type="text" name="date" id="date">
                    </li>
                    <li>
                        <label for="guestbook">留言</label>
                        <input type="text" name="guestbook" id="guestbook">
                    </li>
                </ul>
                <a class="reserve">预定</a>

            </form>
        </div>
</main>

<jsp:include page="end.jsp"></jsp:include>

</body>

<script src="lib/jquery/jquery.js"></script>
<script src="lib/bootstrap/bootstrap.js"></script>
<script src="js/main.js"></script>
</html>