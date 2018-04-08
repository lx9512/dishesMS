<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/3/6
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/jquery.cookie/1.4.1/jquery.cookie.min.js"></script>
<script type="text/javascript">
    function sub() {
        var parm = "id=${dishesVariety.id}&name="+$("input[name='name']").val()+
                "&describe="+$("input[name='describe']").val();
        $.ajax(
            {
                type:"post",
                url:"/dishesVariety/edit",
                data: parm,
                async:false,
                success:function () {
                    window.open("staff/login","_self");
                }
            }
        );
    }
</script>
<html>
<head>
    <title>编辑菜品种类</title>
</head>
<body>
<form>
    种类名称
    <input type="text" name="name" value="${dishesVariety.name}">
    描述
    <input type="text" name="describe" value="${dishesVariety.describe}">
    <input type="button" value="提交" onclick="sub()">
</form>

</body>
</html>
