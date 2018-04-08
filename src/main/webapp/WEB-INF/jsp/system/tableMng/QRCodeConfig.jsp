<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/4/6
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>二维码配置</title>
</head>
<body>
<div class="row placeholders">
<input type="text" id="QRtext" value="http://www.baidu.com" onblur="makeCode()">
<div id="qrCode" style="width: 100px; height: 100px; margin-top: 25px">

</div>
<a id="downloadQRCode">
</a>
<button onclick="downloadQRCode()" style="height: 25px;width: 160px">下载二维码</button>
</div>
</body>
</html>
