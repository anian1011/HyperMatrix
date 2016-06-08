<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.mathworks.toolbox.javabuilder.webfigures.components.MathWorksLogo" %>
<%@ page import="com.mathworks.toolbox.javabuilder.MWJavaObjectRef" %>
<%@ page import="com.mathworks.toolbox.javabuilder.webfigures.WebFigure" %>
<%@ taglib prefix="wf" uri="/WEB-INF/webfigures.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hypermatrix</title>
</head>
<style type="text/css">
*{margin:0;}
body{font-family:"微软雅黑", Arial, Helvetica, sans-serif}
.center{margin:0 auto;}
#main{background-color:floralwhite;width:998px;}
#main h1{text-align:center;}
.footer{ 
clear:both;
text-align:center;
width:998px; 
height:50px; 
FILTER: progid:DXImageTransform.Microsoft.Gradient(gradientType=0,startColorStr=floralwhite,endColorStr=rgba(178, 207, 135, 1)); /*IE*/ 
background:-moz-linear-gradient(top,floralwhite,rgba(178, 207, 135, 1));/*火狐*/ 
background:-webkit-gradient(linear, 0% 0%, 0% 100%,from(floralwhite), to(rgba(178, 207, 135, 1)));/*谷歌*/ 
background-image: -webkit-gradient(linear,left bottom,left top,color-start(floralwhite),color-stop(1, rgba(178, 207, 135, 1)));/* Safari & Chrome*/ 
filter: progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr='floralwhite', endColorstr='rgba(178, 207, 135, 1)'); /*IE6 & IE7*/ 
-ms-filter: "progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr='floralwhite', endColorstr='rgba(178, 207, 135, 1)')"; /* IE8 */ 
} 
.shadow{
border:#909090 1px solid;background:#fff;color:#333;
filter:progid:DXImageTransform.Microsoft.Shadow(color=#909090,direction=120,strength=3);/*ie*/
-moz-box-shadow: 2px 2px 10px #909090;/*firefox*/
-webkit-box-shadow: 2px 2px 10px #909090;/*safari或chrome*/
box-shadow:2px 2px 10px #909090;/*opera或ie9*/
border-radius: 20px;
}
.shadow h4{margin:10px;}
</style>
<body>
<div id="main" class="center" style="height:480px;">
	<h1>房贷计算</h1>
	<div class="shadow" id="param" style="width:300px;height:400px;background-color:gainsboro;position:relative;top:10px;left:10px;">
		<h4>设定参数:</h4>
		<form action="<c:url value="/caculate.do"/>" method="post" >
		<input type="hidden" name="pakageName" value="${function.pakageName }">
		<input type="hidden" name="className" value="${function.className }">
		<input type="hidden" name="methodName" value="${function.methodName }">
		<c:forEach items="${function.paramArray }" var="item" varStatus="status">
			${item}:<input type="text" name="params[${status.index }]"><br/>
		</c:forEach>
		<button onclick="submit(this.parent)">提交</button>
		</form>
	</div>
	<div class="shadow" style="height:400px;width:640px;position:relative;top:-390px;left:348px;background-color:gainsboro">
		<h4>计算结果:</h4>
		<div style="height:100px;width:200px;">
		<%if(request.getSession().getAttribute("wf")!=null){ %>
		<wf:web-figure name="wf" scope="session" root="WebFigures" width="100%" height="100%"/>
		<%}else{ %>123<%} %>
		</div>
	</div>
</div>
<div class="center footer">

	<p style="padding-top:10px;">Copyright ©  Hyper-Matrix Team. All Rights Reserved</p>
</div>
</body>
</html>