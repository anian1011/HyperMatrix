<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Message</title>
<style type="text/css">
    h1 {
        color: #292929;
        font-family: "Trebuchet MS",Lucida,Verdana,sans-serif;
        font-weight: normal;
    }
</style>
</head>
<body style="text-align: center">
<h1>${msg.message}</h1><br/>
<a href="${msg.backUrl}">返回</a>
</body>
</html>
