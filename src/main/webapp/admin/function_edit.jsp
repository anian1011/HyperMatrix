<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>News</title>
    <script src="../resource/js/jquery-1.5.1.js"></script>
    <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css">
    <link rel="stylesheet" href="../resource/css/layouts/side-menu.css">

</head>
<body style="text-align: center">
<form id="functionForm" action="editFunction.do" method="post" class="pure-form pure-form-aligned">
    <fieldset>
        <input name="fid" type="hidden" value="${function.fid}">
        <div class="pure-control-group">
            <label>功能名</label>
            <input name="fname" type="text" placeholder="fname" value="${function.fname}" required="required">
        </div>
        <div class="pure-control-group">
            <label>分类</label>
            <select name="cid" class="pure-input-1-1">
                <option value="1" <c:if test='${function.cid==1}'>selected="selected"</c:if>>科学计算</option>
                <option value="2" <c:if test='${function.cid==2}'>selected="selected"</c:if>>大数据分析</option>
                <option value="3" <c:if test='${function.cid==3}'>selected="selected"</c:if>>工程应用</option>
            </select>
        </div>
        <div class="pure-control-group">
            <label>包名</label>
            <input name="packageName" type="text" placeholder="packageName" value="${function.packageName}" required="required">
        </div>
        <div class="pure-control-group">
            <label>类名</label>
            <input name="className" type="text" placeholder="className" value="${function.className}" required="required">
        </div>
        <div class="pure-control-group">
            <label>方法名</label>
            <input name="methodName" type="text" placeholder="methodName" value="${function.methodName}" required="required">
        </div>
        <div class="pure-control-group">
            <label>参数(用逗号隔开)</label>
            <input name="params" type="text" placeholder="params" value="${function.params}" required="required">
        </div>
        <div class="pure-controls">
            <button type="submit" class="pure-button pure-button-primary">提交</button>
        </div>
    </fieldset>
</form>

</body>
</html>