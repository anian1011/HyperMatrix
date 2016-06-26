<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>News</title>
    <script src="../resource/js/jquery-1.5.1.js"></script>
    <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css">
    <link rel="stylesheet" href="../resource/css/layouts/side-menu.css">
</head>
<style type="text/css">
    .center{margin: 0 auto;}
</style>
<body style="text-align: center">
<a style="margin:10px;" class="pure-button pure-button-primary" href="toResourceList.do">查询</a>
<a style="margin:10px;" class="pure-button pure-button-primary" href="toResourceAdd.do">添加</a>
<form id="deleteForm" style="display: none" action="deleteResource.do" method="post">
    <input type="text" name="fileName" value="">
</form>
<table id="resourceTable" class="pure-table center">
    <thead>
    <tr>
        <th>文件名</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${fileList}" var="file">
        <tr>
            <td>${file}</td>
            <td>
                <button class="pure-button" onclick="deleteResource(this)" name="${file}">删除</button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<script>
    function deleteResource(temp){
        $("#deleteForm input:first").attr("value",temp.name);
        $("#deleteForm").submit();
    }
</script>
</body>
</html>
