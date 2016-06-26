<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Function</title>
    <script src="../resource/js/jquery-1.5.1.js"></script>
    <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css">
    <link rel="stylesheet" href="../resource/css/layouts/side-menu.css">
</head>
<style type="text/css">
.center{margin: 0 auto;}
</style>
<body style="text-align: center">
<a style="margin:10px;" class="pure-button pure-button-primary" href="toFunctionList.do">查询</a>
<a style="margin:10px;" class="pure-button pure-button-primary" href="toFunctionAdd.do">添加</a>
(分类：1代表科学计算，2代表大数据分析，3代表工程应用)
<table id="newsTable" class="center pure-table">
    <thead>
    <tr>
        <th>#</th>
        <th>功能名</th>
        <th>分类</th>
        <th>功能参数</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${functionList}" var="fun">
        <tr>
            <td>${fun.fid}</td><td>${fun.fname}</td><td>${fun.cid}</td><td>${fun.params}</td>
            <td><a class="pure-button" href="toFunctionEdit.do?fid=${fun.fid}">修改</a>|
                <a class="pure-button" onclick="return confirm('确定删除 ${fun.fname}？')" href="deleteFunction.do?fid=${fun.fid}">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<script>

</script>
</body>
</html>