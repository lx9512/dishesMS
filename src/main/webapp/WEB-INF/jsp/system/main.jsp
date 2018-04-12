<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/2/24
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=UTF-8">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="">
    <!--
       <link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">

       <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
       <script src="http://apps.bdimg.com/libs/jquery.cookie/1.4.1/jquery.cookie.min.js"></script>
       -->

    <script src="/resource/js/jQuery3.3.1.js"></script>
    <script src="/resource/js/jquery.cookie.js"></script>
    <script src="/resource/js/bootstrap.js"></script>
    <script src="/resource/js/qrcode.js"></script>
    <script src="/resource/js/main.js"></script>
    <link rel="stylesheet" href="/resource/css/bootstrap.min.css">

    <script type="text/javascript">
        function loadPage(url,id) {
            $.ajax(
                {
                    type:"post",
                    //data:formData,
                    url:url,
                    async:true,
                    processData: false,
                    contentType: false,
                    success:function (data) {
                        //alert(data);
                        document.getElementById(id).innerHTML=data;
                        executeScript(data);
                    },error:function (data) {
                    alert("页面加载失败！"+data);
                }
                }
            )
        }

        $("#myModal").on("hidden.bs.modal", function() {
            $(this).removeData("bs.modal");
            /*modal页面加载$()错误,由于移除缓存时加载到<span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>未移除的数据，手动移除加载的内容*/
            $(this).find(".modal-content").children().remove();
        });


    </script>
    <title>主页</title>

    <style>
        /*
  * Base structure
  */

        /* Move down content because we have a fixed navbar that is 50px tall */
        body {
            padding-top: 50px;
        }


        /*
         * Global add-ons
         */

        .sub-header {
            padding-bottom: 10px;
            border-bottom: 1px solid #eee;
        }

        /*
         * Top navigation
         * Hide default border to remove 1px line.
         */
        .navbar-fixed-top {
            border: 0;
        }

        /*
         * Sidebar
         */

        /* Hide for mobile, show later */
        .sidebar {
            display: none;
        }
        @media (min-width: 768px) {
            .sidebar {
                position: fixed;
                top: 51px;
                bottom: 0;
                left: 0;
                z-index: 1000;
                display: block;
                padding: 20px;
                overflow-x: hidden;
                overflow-y: auto; /* Scrollable contents if viewport is shorter than content. */
                background-color: #f5f5f5;
                border-right: 1px solid #eee;
            }
        }

        /* Sidebar navigation */
        .nav-sidebar {
            margin-right: -21px; /* 20px padding + 1px border */
            margin-bottom: 20px;
            margin-left: -20px;
        }
        .nav-sidebar > li > a {
            padding-right: 20px;
            padding-left: 20px;
        }
        .nav-sidebar > .active > a,
        .nav-sidebar > .active > a:hover,
        .nav-sidebar > .active > a:focus {
            color: #fff;
            background-color: #428bca;
        }


        /*
         * Main content
         */

        .main {
            padding: 70px;
        }
        @media (min-width: 768px) {
            .main {
                padding-right: 40px;
                padding-left: 40px;
            }
        }
        .main .page-header {
            margin-top: 0;
        }


        /*
         * Placeholder dashboard ideas
         */

        .placeholders {
            margin-bottom: 30px;
            text-align: center;
        }
        .placeholders h4 {
            margin-bottom: 0;
        }
        .placeholder {
            margin-bottom: 20px;
        }
        .placeholder img {
            display: inline-block;
            border-radius: 50%;
        }
    </style>
</head>

<%--完成页面跳转--%>
<script >
    function loadUrl( url ){
        //alert( url);
        $("#mainDiv").load( url);
        return false;
    }
</script>


<body>
    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Project name</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">登录</a> </li>
                    <li><a href="#">注册</a> </li>
                    <li><a href="#"></a> </li>
                    <li><a href="#"></a> </li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-3 col-md-2 sidebar">
                <div>个人中心</div>
                <ul>
                    <li><a href="javascript:void(0)" onclick="loadUrl('/customer/jumpToCustomer')">个人信息</a> </li>
                    <li><a href="javascript:void(0)" onclick="loadUrl('/customer/jumpToTest')">消费记录</a> </li>
                    <%--获取消费记录以消费ID为为准 消费ID为日期加消费者ID加餐位加时间段代码（早餐 0 中餐 1 晚餐 2 夜宵 3）--%>
                </ul>
                <div>点餐</div>
                <ul>
                    <li><a href="javascript:void(0)" onclick="loadUrl('/customer/jumpToTest')">查看美食</a> </li>
                    <li><a href="javascript:void(0)" onclick="loadUrl('/customer/jumpToTest')">消灭美食</a> </li>
                    <%--生成消费ID 锁定餐位 获得结账操作--%>
                </ul>
                <div>菜品管理</div>
                <ul>
                    <li><a href="/dishes/jumpDishes">菜品信息</a> </li>
                    <li><a href="/dishesVariety/jumpDishesVariety">类别管理</a> </li>
                </ul>
                <div>订单管理</div>
                <ul>
                    <li><a href="#">订单信息</a> </li>
                    <li><a href="#">菜品加工</a> </li>
                </ul>
                <div>桌台管理</div>
                <ul>
                    <li><a href="#"></a> </li>
                </ul>
                <div>服务面板</div>
                <div class="nav nav-sidebar">人员管理</div>
                <ul>
                    <li class="active"><a href="#">会员信息</a> </li>
                    <li class=""><a href="/staff/jumpStaffPage">员工信息</a> </li>
                    <li class=""><a href="/role/jumpRolePage">职位管理</a> </li>
                </ul>
                <div>数据统计</div>

            </div>
            <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                <h1 class="page-header">内容</h1>
            </div>

        </div>
    </div>

    <!--  model  -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">Modal title</h4>
                </div>
                <div class="modal-body" id="modelBody">
                    ...
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Save changes</button>
                </div>
            </div>
        </div>
    </div>

</body>
</html>
