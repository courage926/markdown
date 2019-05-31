## 小结
<img alt="jsp-d70196ed.png" src="assets/jsp-d70196ed.png" width="" height="" >

## 为什么web组件需要做跳转和信息的共享
跳转:一个需求需要在两个或者多个组件协同完成  
共享:多个组件需要跳转,如果需要传递数据就需要共享  

## 如何使用跳转
### forward
````
请求转发:
   从 AServlet,请求转发到 BServlet.
   AServlet完成一部分的功能,再跳转到BServlet,继续完成剩下的功能.
语法:
   request.getRequestDispatcher(String path).forward(request,response);
   参数:path,表示跳转的目标的路径(资源的名称).
   注意:别忘了forward.

请求转发的特点:
   1:浏览器地址栏不发生改变,依然是/forward/a,不是目标地址(/forward/b).
   2:请求转发只发送一个请求.
   3:共享同一个请求中的数据.
   4: 最终响应给浏览器的由BServlet来决定.
   5:请求转发不能跨域访问,只能跳转到当前应用中的资源.
   6:请求转发可以访问 WEB-INF目录中的资源.
````

### redirect
````
URL重定向
语法:
response.sendRedirect(String path);
参数: path 指的是这个资源路径

特点:
   1:浏览器地址栏发生改变,从/redirect/a,跳转到(/redirect/b).
   2: 发送了两个请求(相当把资源路径拷贝了在浏览器再次去发送请求)
   3: 没有共享请求数据(因为是两个请求,所有不可能共享数据).
   4:最终响应给浏览器的由BServlet来决定.
   5:URL 重定向支持跨域访问,可以跳转到其他网站
   6:URL 重定向不可以访问WEB-INF目录中的资源.
````

### 选择
````
forward和 redirect选择:
必选项:
1 必须使用的请求转化的情况
    需要共享同一个请求中的数据
    需求访问 WEB-INF目录中的资源
2 必须使用重定向的情况
   需要跳转到其他网站

其他,任选
````
##  Servlet的三大作用域
### request 请求  浏览器每次发送请求
### session 会话  同一个浏览器打开到关闭
### application 应用 Tomcat开启到关闭

### 使用方式
<img alt="跳转_共享_作用域_EL_JSTL-5bbd497f.png" src="assets/跳转_共享_作用域_EL_JSTL-5bbd497f.png" width="" height="" >


## EL
````
EL 表达式: 从page,request,session,application中从小到大去检索数据,找到则显示,找不到继续到下一个,全部没有显示空字符串
语法: ${属性名} , 注意:  ${} 中间不能带双引号
````

## JSTL
<img alt="跳转_共享_作用域_EL_JSTL-2c7e63aa.png" src="assets/跳转_共享_作用域_EL_JSTL-2c7e63aa.png" width="" height="" >

<img alt="跳转_共享_作用域_EL_JSTL-4f9aa870.png" src="assets/跳转_共享_作用域_EL_JSTL-4f9aa870.png" width="" height="" >

<img alt="跳转_共享_作用域_EL_JSTL-a7c3566f.png" src="assets/跳转_共享_作用域_EL_JSTL-a7c3566f.png" width="" height="" >
