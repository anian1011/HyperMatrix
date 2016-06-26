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
<a style="margin:10px;" class="pure-button pure-button-primary" href="toNewsList.do">查询</a>
<a style="margin:10px;" class="pure-button pure-button-primary" href="toNewsAdd.do">添加</a>

<table id="newsTable" class="pure-table center">
    <thead>
    <tr>
        <th>#</th>
        <th>标题</th>
        <th>作者</th>
        <th>时间</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${newsList}" var="news">
        <tr>
            <td>${news.nid}</td><td>${news.title}</td><td>${news.author}</td><td>${news.createTime}</td>
            <td><a class="pure-button" href="toNewsEdit.do?nid=${news.nid}">修改</a>|
                <a class="pure-button" onclick="return confirm('确定删除 ${news.title}？')" href="deleteNews.do?nid=${news.nid}">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<script>

</script>
</body>
</html>
