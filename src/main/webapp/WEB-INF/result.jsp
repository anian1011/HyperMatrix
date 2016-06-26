<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="wf" uri="/WEB-INF/webfigures.tld"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="./resource/css/loading.css" rel="stylesheet" type="text/css">
<script src="./resource/js/jquery-1.5.1.js"></script>
<title>Hypermatrix</title>
</head>
<style type="text/css">
* {margin: 0;}
body {font-family: "微软雅黑", Arial, Helvetica, sans-serif}
.center {margin: 0 auto;}
#main {background-color: floralwhite;width: 998px;}
#main h1 {text-align: center;}
.footer {clear: both;text-align: center;width: 998px;height: 50px;background-color:rgba(178, 207, 135, 1);FILTER: progid:DXImageTransform.Microsoft.Gradient(gradientType=0,startColorStr=floralwhite, endColorStr=rgba(178, 207, 135, 1));background: -moz-linear-gradient(top, floralwhite, rgba(178, 207, 135, 1));background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(floralwhite),to(rgba(178, 207, 135, 1)));background-image: -webkit-gradient(linear, left bottom, left top, color-start(floralwhite),color-stop(1, rgba(178, 207, 135, 1)));filter: progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr='floralwhite', endColorstr='rgba(178, 207, 135, 1)');-ms-filter:"progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr='floralwhite', endColorstr='rgba(178, 207, 135, 1)')";}
.shadow {border: #909090 1px solid;background: #fff;color: #333;filter: progid:DXImageTransform.Microsoft.Shadow(color=#909090,direction=120, strength=3);-moz-box-shadow: 2px 2px 10px #909090;-webkit-box-shadow: 2px 2px 10px #909090;box-shadow: 2px 2px 10px #909090;border-radius: 20px;}
button {margin:10px;background-color: #7fbf4d;background-image: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #7fbf4d),color-stop(100%, #63a62f));background-image: -webkit-linear-gradient(top, #7fbf4d, #63a62f);background-image: -moz-linear-gradient(top, #7fbf4d, #63a62f);background-image: -ms-linear-gradient(top, #7fbf4d, #63a62f);background-image: -o-linear-gradient(top, #7fbf4d, #63a62f);background-image: linear-gradient(top, #7fbf4d, #63a62f);border: 1px solid #63a62f;border-bottom: 1px solid #5b992b;border-radius: 3px;-webkit-box-shadow: inset 0 1px 0 0 #96ca6d;box-shadow: inset 0 1px 0 0 #96ca6d;color: #fff;font: bold 11px/1 "Lucida Grande", "Lucida Sans Unicode", "Lucida Sans",	Geneva, Verdana, sans-serif;padding: 7px 0 8px 0;text-align: center;text-shadow: 0 -1px 0 #4c9021;width: 150px;}
button:hover {background-color: #76b347;background-image: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #76b347),color-stop(100%, #5e9e2e));background-image: -webkit-linear-gradient(top, #76b347, #5e9e2e);background-image: -moz-linear-gradient(top, #76b347, #5e9e2e);background-image: -ms-linear-gradient(top, #76b347, #5e9e2e);background-image: -o-linear-gradient(top, #76b347, #5e9e2e);background-image: linear-gradient(top, #76b347, #5e9e2e);-webkit-box-shadow: inset 0 1px 0 0 #8dbf67;box-shadow: inset 0 1px 0 0 #8dbf67;cursor: pointer;}
button:active {	border: 1px solid #5b992b;border-bottom: 1px solid #538c27;-webkit-box-shadow: inset 0 0 8px 4px #548c29, 0 1px 0 0 #eeeeee;box-shadow: inset 0 0 8px 4px #548c29, 0 1px 0 0 #eeeeee;}
.loading{ width: 150px; height: 4px; border-radius: 2px; margin: 0 auto; margin-top:100px; position: relative; background: lightgreen; -webkit-animation: changeBgColor 1.04s ease-in infinite alternate; } .loading span{ display: inline-block; width: 16px; height: 16px; border-radius: 50%; background: lightgreen; position: absolute; margin-top: -7px; margin-left:-8px; -webkit-animation: changePosition 1.04s ease-in infinite alternate; } @-webkit-keyframes changeBgColor{ 0%{ background: lightgreen; } 100%{ background: lightblue; } } @-webkit-keyframes changePosition{ 0%{ background: lightgreen; } 100%{ margin-left: 142px; background: lightblue; } }
.shadow h4 {margin: 10px;}
</style>
<script type="text/javascript">
$("iframe").ready(function(){
	loadingFinish();
})
function loading(){
	$(".loader").css("display","block");
}
function loadingFinish(){
	$(".loader").css("display","none");
}
</script>
<body>
	<div id="main" class="center" style="height: 530px;">
		<h1>${function.fname }</h1>
		<div class="shadow" id="param"
			style="width: 300px; height: 450px; background-color: gainsboro; position: relative; top: 10px; left: 10px;">
			<h4>设定参数:</h4>
			
			<form onsubmit="loading()" action="<c:url value="/caculate.do"/>" method="post" style="text-align: right;width:270px;">
				<input type="hidden" name="fid" value="${function.fid }" required="required"/>
				<input type="hidden" name="packageName" value="${function.packageName }" required="required">
				<input type="hidden" name="className" value="${function.className }" required="required">
				<input type="hidden" name="methodName" value="${function.methodName }" required="required">
				<c:forEach items="${function.paramArray }" var="item" varStatus="status">
			${item}:<input type="text" required="required" name="params[${status.index }]" value='<c:if test="${currentParams!=null }">${currentParamas[status.index] }</c:if>'><br/>
				</c:forEach>
				<p class="center">
					<button  type="submit">提交</button>
				</p>
			</form>
		
		</div>
		<div class="shadow"	style="height: 450px; width: 640px; position: relative; top: -440px; left: 348px; background-color: gainsboro">
			<h4>计算结果:</h4>
			<div class="loader"><div class="loader-inner ball-grid-pulse">
         	 <div></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div>
        	</div>正在计算……</div>
			<%if (request.getSession().getAttribute("wf") != null) {%>
			<wf:web-figure name="wf" root="WebFigures" scope="session"	width="100%" height="85%"/>
			<%} %>
			
		</div>
	</div>
	<div class="center footer">

		<p style="padding-top: 10px;">Copyright © Hyper-Matrix Team. All
			Rights Reserved</p>
	</div>

</body>

</html>