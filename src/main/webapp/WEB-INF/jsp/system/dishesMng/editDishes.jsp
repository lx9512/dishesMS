<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/3/7
  Time: 23:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/jquery.cookie/1.4.1/jquery.cookie.min.js"></script>
<script type="text/javascript">
    function uploadPhoto() {
        //获取图片上传表单
        var formData = new FormData(document.forms.namedItem("form2"))
        $.ajax(
            {
                type:"post",
                data:formData,
                url:"/dishes/upImage",
                async:false,
                processData: false,
                contentType: false,
                success:function (data) {
                    alert(data);
                    $("#photo").append("<img src='"+data+'?'+Math.random()+"' alt='this is photo'>");
                },error:function (data) {
                alert("图片上传失败！");
            }
            }
        )
    }
</script>
<html>
<head>
    <title>编辑菜品信息</title>
</head>
<body>

<div>
    <form action="/dishes/upImage" name="form2" method="post" enctype="multipart/form-data">
        <input type="file" name="file">
        <input type="button" value="上传图片" onclick="uploadPhoto()">
    </form>
    <p id="photo"></p>
</div>
<div>
    <form action="/dishes/add">
        <label>菜品名称</label>
        <input type="text" name="name" value="${dishes.name}"><br>
        <label>菜品类型</label>
        <select name="varietyId">
            <c:forEach var="dishesVariety" items="${varietyList}">
                <option value="${dishesVariety.id}">${dishesVariety.name}</option>
            </c:forEach>
        </select>
        <label>价格</label>
        <input type="text" name="price"><br>
        <label>辣度</label>
        <select name="acridity">
            <option value="0">不辣</option>
            <option value="1">微辣</option>
            <option value="2">中辣</option>
            <option value="3">重辣</option>
        </select>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>
