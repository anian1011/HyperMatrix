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
<form id="newsForm" action="editNews.do" method="post" class="pure-form pure-form-aligned">
    <fieldset>
        <input name="nid" type="hidden" value="${news.nid}">
        <div class="pure-control-group">
            <label for="title">标题</label>
            <input name="title" type="text" placeholder="title" value="${news.title}" required="required">
        </div>

        <div class="pure-control-group">
            <label for="author">作者</label>
            <input name="author" type="text" placeholder="author" value="${news.author}" required="required">
        </div>
        <div class="pure-controls">
            <button type="submit" class="pure-button pure-button-primary">提交</button>
        </div>
    </fieldset>
</form>
</body>
</html>