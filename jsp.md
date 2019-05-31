# 跳转_共享
## 为什么需要跳转
一个需求需要在多个组件协同完成
查询学生信息(Servlet来查询,jsp来显示)

## 为什么要共享
多个组件需要做跳转,如果需要传递数据就需要做共享

# 跳转方式
## 方式1 请求转发(forward)
  <img alt="jsp-02996bde.png" src="assets/jsp-02996bde.png" width="" height="" >  

  <img alt="jsp-ef4831d9.png" src="assets/jsp-ef4831d9.png" width="" height="" >

## 方式2 URL重定向(redirect)
<img alt="jsp-b3c4330a.png" src="assets/jsp-b3c4330a.png" width="" height="" >

## 方式3 include
基本不用

## 如何选择 forward 和 url重定向
<img alt="jsp-3908479e.png" src="assets/jsp-3908479e.png" width="" height="" >

# 数据共享方式

## 作用域:
在一个范围内去共享数据  
学习目的:在组件跳转过程中去共享数据

## Servlet的三大作用域
request:请求作用域:在一个请求中的多个跳转之间去共享数据  
session:在一个会话中的多个请求中去共享数据   
        会话:打开浏览器去访问网站会话对象创建,直接去访问网站上的数据/点击a标签等等操作到关闭浏览器就是一个会话  
application/servletContentext:应用对象:一个应用就只有一个应用对象,在多个会话之间去共享数据 (Tomcat打开到关闭)

作用域的类型:
request:HttpServletRequest

session:HttpSession

application/servletContentext:ServletContext

三大作用域对象的获取  
request:直接再servlet方法中使用  
session:使用request对象来获取 req.getSession();  
application: 方式一:通过ServletConfig对象来获取  
            super.getServletConfig().getServletContext();  
            方式二:直接通过父类调用  
            super.getServletContext();  
            方式三:使用请求对象来获取  
            req.getServletContext();  
            三种方式拿到的是同一个ServletContext对象  

## 三大作用域的数据共享
1.在入数据到作用域中   
作用域对象.setAttribute(String username,Object value)  
参数:name:给要共享的数据设置一个唯一的名称
      value:要存入/共享的数据

2.获取作用域中的数据  
Object 作用域对象.getAttribute(String name);

3.移除作用域中的数据  
作用域对象.removeAttribute(String  name);  


# ServletContext对象
## 获取对象  
方式1:使用父类的方式  
方式2:使用请求对象获取  
方式3:使用session获取  
结论:无论哪种方式获取到的ServletContext都是同一个对象,因为一个项目就只有一个ServletContext  
<img alt="jsp-a1e564f8.png" src="assets/jsp-a1e564f8.png" width="" height="" >

## 常用方法
获取相对于项目的根路径的路径的绝对路径(假的,其实只是路径拼接)


## 全局初始化参数
web.xml配置

## 区别(面试)
req.getParameter(name); 获取用户提交的数据
servletConfig/servletContext.getInitParameter(name) 获取配置的初始化参数

# 三大作用域对象案例
从ScopeServlet中去设置共享数据,然后在ResultServlet中的响应数据
从ScopeServlet中从某个作用域中获取num的值,获取到则加一,获取不到存入1
requset:每次都行一个新的请求,每次都是1
session:浏览器打开到关闭
servletContext:Tomcat打开到关闭都是同一个
## 九大对象


##  四大作用域
pageContext
request
session
application

# EL表达式
作用:从page request session application中从小到大去检索数据,找到则显示,找不到继续到下一个,全部没有显示空字符串
语法:${属性名},中间不能带双引号

## 例子
接收请求参数,封装成对象   
//创建一个javabean对象传递给el.jsp页面去显示
//存入到作用域对象中
//跳转到el.jsp页面去显示数据  

<img alt="jsp-dc7ce32c.png" src="assets/jsp-dc7ce32c.png" width="" height="" >

<img alt="jsp-ebd1522e.png" src="assets/jsp-ebd1522e.png" width="" height="" >  

<img alt="jsp-143a5765.png" src="assets/jsp-143a5765.png" width="" height="" >  

<img alt="jsp-b6225f5d.png" src="assets/jsp-b6225f5d.png" width="" height="" >

<img alt="jsp-df630aac.png" src="assets/jsp-df630aac.png" width="" height="" >

## EL表达式语法
方式1:${对象.属性名}  
方式2:${对象["属性名"]}   
方式3:${对象.getter()}Tomcat7之后才支持的    

注意domain中要有getter方法  
以后使用第一种方式最多  
要求:命名时不要使用特殊符号比如点

# EL细节   
<img alt="jsp-fb194ec1.png" src="assets/jsp-fb194ec1.png" width="" height="" >
答案2.5  

# JSTL(标签库)  
需要在页面上去遍历或者判断数据,但是jsp中只能以java代码的形式存在    
jsp就只写标签 java代码就留给Servlet

## JSTL的使用:
加入jar包
<img alt="jsp-b3baa21d.png" src="assets/jsp-b3baa21d.png" width="" height="" >

c前缀

<c:froEach >
<img alt="jsp-538407d9.png" src="assets/jsp-538407d9.png" width="" height="" >

<img alt="jsp-c4286521.png" src="assets/jsp-c4286521.png" width="" height="" >

## 条件选择标签
<img alt="jsp-9a4d47d8.png" src="assets/jsp-9a4d47d8.png" width="" height="" >

单条件
test:存boolean表达式的值
多条件


<img alt="jsp-9125f4f9.png" src="assets/jsp-9125f4f9.png" width="" height="" >

#  小结
<img alt="jsp-d70196ed.png" src="assets/jsp-d70196ed.png" width="" height="" >
