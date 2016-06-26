<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css">
    <link rel="stylesheet" href="../resource/css/layouts/side-menu.css">
    <style type="text/css">
        form{margin: 5px;}
    </style>
</head>
<body style="text-align: center">
<h3>首页轮播图片：</h3>大小580x300 格式jpg,jpeg,bmp,gif
<div><img src="../resource/icons/1.jpg">
    <form action="editPic.do?fileName=1.jpg" method="post" enctype="multipart/form-data">
        更换此图片：<input name="imgFile" id="1" type="file" required="required"/>
        <button type="submit" class="pure-button pure-button-primary">提交</button>
    </form></div>
<div><img src="../resource/icons/2.jpg">
    <form action="editPic.do?fileName=2.jpg" method="post" enctype="multipart/form-data">
        更换此图片：<input name="imgFile" id="2" type="file" required="required"/>
        <button type="submit" class="pure-button pure-button-primary">提交</button>
    </form></div>
<div><img src="../resource/icons/3.jpg">
    <form action="editPic.do?fileName=3.jpg" method="post" enctype="multipart/form-data">
        更换此图片：<input name="imgFile" id="3" type="file" required="required"/>
        <button type="submit" class="pure-button pure-button-primary">提交</button>
    </form></div>
<div><img src="../resource/icons/4.jpg">
    <form action="editPic.do?fileName=4.jpg" method="post" enctype="multipart/form-data">
        更换此图片：<input name="imgFile" id="4" type="file" required="required"/>
        <button type="submit" class="pure-button pure-button-primary">提交</button>
    </form></div>
<div><img src="../resource/icons/5.jpg">
    <form action="editPic.do?fileName=5.jpg" method="post" enctype="multipart/form-data">
        更换此图片：<input name="imgFile" id="5" type="file" required="required"/>
        <button type="submit" class="pure-button pure-button-primary">提交</button>
    </form></div>
</body>
</html>
