# http
约束浏览器和服务器之间的数据交互的格式

<img alt="http-2cb368d1.png" src="assets/http-2cb368d1.png" width="" height="" >

<img alt="http-81ec3a41.png" src="assets/http-81ec3a41.png" width="" height="" >

<img alt="http-fe4528c0.png" src="assets/http-fe4528c0.png" width="" height="" >



还有一种解决方案就是：
1.若tomcat为8.0的最新版本，直接右击项目名->properties->勾选中is a Tomcat project,在context name处编辑：/+项目名,下面的root一栏中编写WebRoot(大小写区分),最后点击Apply,ok就可以了。
2.若Tomcat低于8.0版本的,则打开Tomcat的安装目录apache-tomcat-7.0.62-windows-x64-->apache-tomcat-7.0.62-->conf-->Catalina-->localhost-->01_struts_hw.xml(注意，此处为具体的项目名)，用Notepad++打开，在docBase="E:\项目空间\例子代码\01_struts_hw"末尾添加\WebContent即可，变为 docBase="E:\项目空间\例子代码\01_struts_hw\WebContent"

1、web.xml 里面存在重复的配置

2、servlet里面出现@webRUL，web.xml又配置了一遍，就会出现这个问题。两者不能共存

3、tomcat server 的web Modules里面存在某项但是这个项没有在工作空间内，就会莫名奇妙出现这个错误。
