<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>News</title>
    <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css">
    <link rel="stylesheet" href="../resource/css/layouts/side-menu.css">

</head>
<body style="text-align: center">
<form id="resourceForm" action="addResource.do" method="post" enctype="multipart/form-data" class="pure-form pure-form-aligned">
    <fieldset>
        <div class="pure-control-group">
            <label for="resourceFile">资源文件</label>
            <input name="resourceFile" type="file" required="required"/>
        </div>
        <div class="pure-controls">
            <button type="submit" class="pure-button pure-button-primary">提交</button>
        </div>
    </fieldset>
</form>

</body>
</html>