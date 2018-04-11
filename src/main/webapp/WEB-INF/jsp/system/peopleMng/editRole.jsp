<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/3/2
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/jquery.cookie/1.4.1/jquery.cookie.min.js"></script>

<script type="text/javascript">
    function submitByJS() {
        var d = "id=${role.id}&title="+$("input[name='title']").val()+
            "&describe=" +$("input[name='describe']").val();
        alert(d);
        $.ajax({type:"post",
            url:"/role/edit",
            data:d,
            async:false,
            success:function () {
                alert("submit successful")
                window.open("/staff/login","_self");
            }
        });
    }
</script>

<html>
<head>
    <title>职位信息编辑</title>
</head>
<body onload="onload()">
<script type="text/javascript">
    function onload() {
        alert("${role.id}");
    }
</script>
<form>
    <label>职位名称:</label>
    <input type="text" id="title" name="title" value="${role.title}">
    <br>
    <label>描述:</label>
    <input type="text" id="describe" name="describe" value="${role.describe}">
    <br>
    <input type="button" value="提交" onclick="submitByJS()">
</form>
</body>
</html>
