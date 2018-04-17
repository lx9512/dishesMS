<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/3/2
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/jquery.cookie/1.4.1/jquery.cookie.min.js"></script>
<script type="text/javascript">
    function submitByJS()
    {
        var data = "id=${staff.id}&account="+$("input[name='account']").val()+
                "&password="+$("input[name='password']").val()+"&name="+$("input[name='name']").val()+
                "&gender="+$("input[type='radio']:checked").val()+"&idCard="+$("input[name='idCard']").val()+
                "&email="+$("input[name='email']").val()+"&tel="+$("input[name='tel']").val()+
                "&roleId="+$("select[name='roleId']").val();
        $.ajax({type:"post",
            url:"/staff/edit",
            data:data,
            async:false,
            success:function () {
                alert("submit successful");
                window.open("/staff/login","_self");
            }
        });
    }
</script>
<html>
<head>
    <title>员工信息编辑</title>
</head>
<body>
<form>
    <label>员工号</label>
    <input type="text" id="account" name="account" value="${staff.account}" disabled /><br>
    <label>密码</label>
    <input type="password" id="password" name="password" value="${staff.password}" /><br>
    <label>姓名</label>
    <input type="text" id="name" name="name" value="${staff.name}" /><br>
    <label>性别</label><br>
    <input type="radio" name="gender" value="男" ><label>男</label>
    <input type="radio" name="gender" value="女" ><label>女</label><br>
    <label>身份证号</label>
    <input type="text" name="idCard" value="${staff.idCard}"><br>
    <label>电话号码</label>
    <input type="text" name="tel" value="${staff.tel}"><br>
    <label>电子邮箱</label>
    <input type="text" name="email" value="${staff.email}"><br>
    <label>职位</label>
    <select name="roleId">
        <c:forEach var="role" items="${roles}">
            <option value="${role.id}">${role.title}</option>
        </c:forEach>
    </select>
    <input type="button" value="提交" onclick="submitByJS()">
</form>
</body>
</html>
