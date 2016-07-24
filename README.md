HyperMatrix2.0——[Hypermatrix2.0点击这里](http://182.254.246.212)
=================================================================
1,spring MVC + Spring + Mybatis框架。<br/>
2,页面除计算页面使用jsp外其余全部使用html,采用div+ajax布局,页面跳转全部使用ajax提交请求,渲染页面。(由于核心功能所限制，计算页面只能使用matlab提供的jsp标签库)。<br/>
3,应用核心功能——caculate模块：<br/>
	<ul><li>①matlab的javabuilder根据写好的.m文件编译生成jar包，一个jar包对应此项目的一个功能，存放在服务器固定路径下，该路径全部存放计算功能的jar包；</li>
	<li>②CaculateService类根据controller传来的参数，动态加载功能路径下的指定功能的jar包，调用其中方法，传入参数，返回结果到jsp页面；</li>
	<li>③由于计算时间可能会较长，需要有loading框提示；</li>
	<li>③jsp页面使用webfigure标签展示计算结果。</li></ul>
4,扩展功能：为方便计算功能的扩展(后台管理部分),核心功能尽量与具体的功能解耦合,尽量简化管理人员网站维护时增加计算功能的操作(需考虑m文件的参数名,参数输入框的编写,matlab编译jar包的类名、方法名等等细节)。<br/>
![image](https://github.com/anian1011/HyperMatrix/blob/master/md_pic/1.png)![image](https://github.com/anian1011/HyperMatrix/blob/master/md_pic/2.png)
![image](https://github.com/anian1011/HyperMatrix/blob/master/md_pic/3.png)![image](https://github.com/anian1011/HyperMatrix/blob/master/md_pic/4.png)

=================================================================