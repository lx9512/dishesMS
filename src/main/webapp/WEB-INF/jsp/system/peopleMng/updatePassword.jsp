<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/4/9
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript">
    var checkPassword = function () {
        var p1 = document.getElementById("password").value;
        var p2 = document.getElementById("rePassword").value;
        if(p1 == p1)
        {
            $.ajax(
                {
                    type:"post",
                    data:p1,
                    url:"/staff/updatePassword",
                    async:"false",
                    success:function (string) {
                        if("success" == string)
                            alert("修改成功!");
                        else
                            alert("修改失败!");
                    },error:function () {
                        alert("error");
                    }
                }
            );
        }else
        {
            var message = document.getElementById("message");
            message.innerHTML = "密码不一致";
            message.style.color = "red";
        }
    }
</script>
<html>
<head>
    <title>修改密码</title>
</head>
<body>
<form>
    输入新密码：
    <input id="password" name="password" type="password">
    再次输入：
    <input id="rePassword" type="password"><label id="message"></label>
    <button class="button" onclick="checkPassword()" value="提交"></button>
    <button onclick="window.history.back()" value="返回"></button>
</form>
</body>
</html>
