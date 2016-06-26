<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>News</title>
<script src="../resource/js/jquery-1.5.1.js"></script>
<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css">
<link rel="stylesheet" href="../resource/css/layouts/side-menu.css">
</head>
<body style="text-align: center">
<form id="newsForm" action="addNews.do" method="post" class="pure-form pure-form-aligned">
    <fieldset>
        <div class="pure-control-group">
            <label for="title">标题</label>
            <input name="title" type="text" placeholder="title" required="required">
        </div>

        <div class="pure-control-group">
            <label for="author">作者</label>
            <input name="author" type="text" placeholder="author" required="required">
        </div>
        <div class="pure-controls">
            <button type="submit" class="pure-button pure-button-primary">提交</button>
        </div>
    </fieldset>
</form>

</body>
</html>