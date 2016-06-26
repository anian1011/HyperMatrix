<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hypermatrix</title>
</head>
<style type="text/css">
    * {margin: 0;}
    body {font-family: "微软雅黑", Arial, Helvetica, sans-serif}
    .center {margin: 0 auto;}
    #main {text-align:center;background-color: floralwhite;width: 998px;}
    #main h1 {text-align: center;}
    .footer {clear: both;text-align: center;width: 998px;height: 50px;background-color:rgba(178, 207, 135, 1);FILTER: progid:DXImageTransform.Microsoft.Gradient(gradientType=0,startColorStr=floralwhite, endColorStr=rgba(178, 207, 135, 1));background: -moz-linear-gradient(top, floralwhite, rgba(178, 207, 135, 1));background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(floralwhite),to(rgba(178, 207, 135, 1)));background-image: -webkit-gradient(linear, left bottom, left top, color-start(floralwhite),color-stop(1, rgba(178, 207, 135, 1)));filter: progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr='floralwhite', endColorstr='rgba(178, 207, 135, 1)');-ms-filter:"progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr='floralwhite', endColorstr='rgba(178, 207, 135, 1)')";}
</style>
<body>
<div id="main" class="center" style="height: 530px;">
    <h1>${msg.message}</h1><br/>
    <a href="${msg.backUrl}">返回</a>
</div>
<div class="center footer">
    <p style="padding-top: 10px;">Copyright © Hyper-Matrix Team. All
        Rights Reserved</p>
</div>
</body>

</html>



