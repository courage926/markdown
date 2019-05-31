<img alt="HTTP_Servlet总结-844f05d7.png" src="assets/HTTP_Servlet总结-844f05d7.png" width="" height="" >

# http协议
约束浏览器和服务器之间的数据交互的格式

# F12查看请求和响应信息
<img alt="http-81ec3a41.png" src="assets/http-81ec3a41.png" width="" height="" >

<img alt="http-2cb368d1.png" src="assets/http-2cb368d1.png" width="" height="" >

# 区分Get和Post(面试题)
## Get请求方式：
         a、若请求服务器上的某个资源，没有指定请求方式，则默认为GET方式
         b、可以通过GET方式向服务器传递数据。具体方式就是在URL请求路径后加上？多个参数以&分割。
               比如 http://localhost:8080/a.html?username=abc&password=123
               注：GET请求方式，数据不安全且数据不能超过2KB
               请求信息会全部存储到请求行中.

## Post请求方式：
          a、若使用Post请求方式传递数据，可以借助form表单的method="post"
          b、数据安全，且长度没有限制

# Servlet
## 第一个Servlet的开发
步骤  
````
1 导入 jar包,在tomcat 根/lib/ servlet-*.jar  
2 创建一个类去实现javax.servlet.Servlet 接口  
3 导入源码,tomcat 源码  
   目的: 可以让参数的名称更加清晰,可以看源代码.  
4 在 service 方法中去打印一句话
  覆写service方法
5 告诉服务器去哪里找咱们自定义的Servlet 类  
  web.xml中配置
6 测试
````
<img alt="HTTP_Servlet总结-190a5ba4.png" src="assets/HTTP_Servlet总结-190a5ba4.png" width="" height="" >

<img alt="HTTP_Servlet总结-e5834968.png" src="assets/HTTP_Servlet总结-e5834968.png" width="" height="" >

## Servlet 生命周期
````
  Servlet在整个生命周期(Tomcat首次调用->Tomcat关闭)中是单例子的
  创建对象->init方法->[service方法]循环->销毁方法(正常关闭时)
  必须给Servlet提供公共的无参构造器
````

## Servlet的请求流程
````
  1 浏览器发请求
  2 Tomcat去server.xml中查找所有的<Context>匹配上下文路径的配置
    找得到:获得项目的绝对路径
    找不到:404
  3 去项目的绝对路径中去找web.xml
  4 获取<url-pattern>匹配资源名称 得到 <servlet-name>
  5 通过<servlet-name>的类的全限定名
  6 从Tomcat的实例缓冲池中去匹配全限定名的对象
    找得到:
    找不到:到7
  7 使用反射创建对象,并把对象存入Tomcat的实例缓冲池
  8 创建 ServletConfig对象再使用对象调用init方法
  9 创建request,response 对象,再使用对象调用service方法
    obj.service(req,resp)
````

## 掌握如何配置初始化参数和如何通过ServletConfig对象获取到数据
````
使用自带的web.xml,里面就带了配置接口.

````
<img alt="HTTP_Servlet总结-808b2d5c.png" src="assets/HTTP_Servlet总结-808b2d5c.png" width="" height="" >

<img alt="HTTP_Servlet总结-da634b93.png" src="assets/HTTP_Servlet总结-da634b93.png" width="" height="" >

## 掌握Servlet 的模板
<img alt="HTTP_Servlet总结-16131b8f.png" src="assets/HTTP_Servlet总结-16131b8f.png" width="" height="" >

<img alt="HTTP_Servlet总结-6a60a1d8.png" src="assets/HTTP_Servlet总结-6a60a1d8.png" width="" height="" >
