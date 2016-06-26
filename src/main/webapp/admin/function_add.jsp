<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>News</title>
    <script src="../resource/js/jquery-1.5.1.js"></script>
    <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css">
    <link rel="stylesheet" href="../resource/css/layouts/side-menu.css">

</head>
<body style="text-align: center">
<form id="functionForm" action="addFunction.do" method="post" enctype="multipart/form-data" class="pure-form pure-form-aligned">
    <fieldset>
        <div class="pure-control-group">
            <label for="fname">功能名</label>
            <input name="fname" type="text" placeholder="fname" required="required">
        </div>
        <div class="pure-control-group">
            <label>State</label>
            <select name="cid" class="pure-input-1-1">
                <option value="1">科学计算</option>
                <option value="2">大数据分析</option>
                <option value="3">工程应用</option>
            </select>
        </div>
        <div class="pure-control-group">
            <label for="params">参数</label>
            <input name="params" type="text" placeholder="若有多个参数，用逗号隔开" required="required">
        </div>
        <div class="pure-control-group">
            <label for="packageName">包名</label>
            <input name="packageName" type="text" placeholder="packageName" required="required">
        </div>
        <div class="pure-control-group">
            <label for="className">类名</label>
            <input name="className" type="text" placeholder="className" required="required">
        </div>
        <div class="pure-control-group">
            <label for="methodName">方法名</label>
            <input name="methodName" type="text" placeholder="methodName" required="required">
        </div>
        <div class="pure-control-group">
            <label for="imageFile">功能图片</label>
            <input name="imageFile" type="file" required="required"/>
            (图片尺寸150*150)
        </div>
        <div class="pure-control-group">
            <label for="jarFile">功能jar包</label>
            <input name="jarFile" type="file" required="required"/>
        </div>
        <div class="pure-controls">
            <button type="submit" class="pure-button pure-button-primary">提交</button>
        </div>
    </fieldset>
</form>

</body>
</html>