# 演示项目
tomcat
导入数据库
trip_test

admin -startup 8080 后台
app   -startup 8088

登陆
修改个人资料(修改头像/背景)
我的游记
(新增/回看/编辑/删除) 副文本插件
分页
发布/待审核
地区管理

找攻略
按地区分类
点评/标签

# 需求文档
每个页面的说明

core-1.0.0.jar->db.properties
修改数据库的账号密码(两个项目都需要)

# restful
- 一个约束
http1.1协议
- Resource: 资源:网络上的一切资源,每个资源都有对应的地址,即统一资源定位符URI
- Representational :表现层表述性,表现层:资源表现出来的形式 contentType:img
- status transfer 状态转移

- 统一接口:必须通过统一接口来对资源执行各种操作,对于每个资源只能执行一组有限的操作
<img alt="restful-ab9d7ce5.png" src="assets/restful-ab9d7ce5.png" width="" height="" >  
uri不要带动作

# 应用接口
- 公共的
- 私用的

- 京东万象

# 设计接口
设计资源
路径设计
url
每个网址代表一个资源,只能有名词,不能有动词,跟数据库的表名对应  
规范:名词一般用复数,但是可以根据需求来进行控制  
delete post put 同过请求而不是路径  
路径上有花括号,传参数个

设计接口的地址
请求方式
路径设计
get 从服务器去取数据
<img alt="restful-abb059d8.png" src="assets/restful-abb059d8.png" width="" height="" >

<img alt="restful-bc31d2b6.png" src="assets/restful-bc31d2b6.png" width="" height="" >

- 极光文档  
<img alt="restful-8e35d3fe.png" src="assets/restful-8e35d3fe.png" width="" height="" >  

GET/departments/{id}/employees      
<img alt="restful-dacec41e.png" src="assets/restful-dacec41e.png" width="" height="" >

返回结果
状态码  
<img alt="restful-79c8d9f9.png" src="assets/restful-79c8d9f9.png" width="" height="" >  
content-type  
<img alt="restful-842eaf2e.png" src="assets/restful-842eaf2e.png" width="" height="" >

accept:代表浏览器希望接收的数据
content-type:发送端(可以是浏览器也可以是服务器)发送的数据类型

# java中常见的restful开发框架
- jersey
- play
- SpringMVC

Postman
Insomnia

new request
get
Query加参数
<img alt="restful-138bb253.png" src="assets/restful-138bb253.png" width="" height="" >

send 发送
<img alt="restful-0bd87e4d.png" src="assets/restful-0bd87e4d.png" width="" height="" >
+WEB-INF


web.xml
.do->/
mvc.xml

<img alt="restful-5fa66502.png" src="assets/restful-5fa66502.png" width="" height="" >

<img alt="restful-bf0d4389.png" src="assets/restful-bf0d4389.png" width="" height="" >

<img alt="restful-97a4ad11.png" src="assets/restful-97a4ad11.png" width="" height="" >

<img alt="restful-f70cd095.png" src="assets/restful-f70cd095.png" width="" height="" >

获取所有的员工
1. 资源地址 /employees
2. 请求动作 get
3. 请求参数 无
4. 返回结果 员工集合

<img alt="restful-d2e3465a.png" src="assets/restful-d2e3465a.png" width="" height="" >

<img alt="restful-0b45ace0.png" src="assets/restful-0b45ace0.png" width="" height="" >

请求方式不对
<img alt="restful-71cbd5eb.png" src="assets/restful-71cbd5eb.png" width="" height="" >

<img alt="restful-8a41f45c.png" src="assets/restful-8a41f45c.png" width="" height="" >

<img alt="restful-0c7b43f5.png" src="assets/restful-0c7b43f5.png" width="" height="" >

<img alt="restful-faf63d14.png" src="assets/restful-faf63d14.png" width="" height="" >

<img alt="restful-cea8a6fa.png" src="assets/restful-cea8a6fa.png" width="" height="" >

<img alt="restful-e43cc8f3.png" src="assets/restful-e43cc8f3.png" width="" height="" >


<img alt="restful-22c90afa.png" src="assets/restful-22c90afa.png" width="" height="" >

<img alt="restful-d95573e5.png" src="assets/restful-d95573e5.png" width="" height="" >

<img alt="restful-e5a0dc3c.png" src="assets/restful-e5a0dc3c.png" width="" height="" >

<img alt="restful-d204fc9f.png" src="assets/restful-d204fc9f.png" width="" height="" >

<img alt="restful-fb52e44a.png" src="assets/restful-fb52e44a.png" width="" height="" >

消费前台传过来的数据数据
<img alt="restful-483f7993.png" src="assets/restful-483f7993.png" width="" height="" >

<img alt="restful-8b378b98.png" src="assets/restful-8b378b98.png" width="" height="" >


代表该方法生产的数据的格式:
<img alt="restful-6778573f.png" src="assets/restful-6778573f.png" width="" height="" >

<img alt="restful-e86dcb0a.png" src="assets/restful-e86dcb0a.png" width="" height="" >

jaxb


<img alt="restful-431202f4.png" src="assets/restful-431202f4.png" width="" height="" >

<img alt="restful-e0cfce67.png" src="assets/restful-e0cfce67.png" width="" height="" >

<img alt="restful-744de734.png" src="assets/restful-744de734.png" width="" height="" >

<img alt="restful-2135c18f.png" src="assets/restful-2135c18f.png" width="" height="" >
新版本:
<img alt="restful-fdf2d15b.png" src="assets/restful-fdf2d15b.png" width="" height="" >

<img alt="restful-a8860763.png" src="assets/restful-a8860763.png" width="" height="" >

<img alt="restful-135d93c1.png" src="assets/restful-135d93c1.png" width="" height="" >

<img alt="restful-6d6032f5.png" src="assets/restful-6d6032f5.png" width="" height="" >

<img alt="restful-414abc9c.png" src="assets/restful-414abc9c.png" width="" height="" >

<img alt="restful-17f83999.png" src="assets/restful-17f83999.png" width="" height="" >

<img alt="restful-5949151a.png" src="assets/restful-5949151a.png" width="" height="" >

通过html提交表单的两个过滤器

# 前后端分离
传统开发模式
前端写好静态html,提交给后端
后端改成html或者freemarker

缺点:
后端要等前端写完页面才能开始,效率低
前后端耦合严重

## 前后端分离
前端跟后台代码都在一个tomcat当中
传统的项目结构
同一个项目当中

mock测试:假数据测试
postman接口测试

## 前后端分离的开发步骤
1. 前后端约定接口的规范,参数,返回值等等
2. 前后端人员并行开发
3. 进行接口联调测试

## 跨域访问
协议+域名+端口 任一不一样都是不同源,就是跨域

## 图片共享 问题
阿里云 oss图片服务


## 小结
1. 简单了解REST的概念
```
Resource:资源
Representation:表现层:文本可以用HTML格式、XML格式、JSON格式表现
State Transfer
新增：从无到有 状态的变化
更新：从某个状态变成另外一种状态的转化
删除：从有到无 状态的变化
```
2. 会区分什么是私有和公用接口
3. 掌握资源和动作设计,了解返回结果
```
给某个员工添加一条薪资记录
1.资源地址 employees/{id}/salaries/{money}
2.请求动作 post
3.请求参数 无
4.返回结果 返回新生成的薪资对象
```
4. RESTful开发框架jersey,play,SpringMVC
5. 掌握SpringMVC里面的注解
```
@RequestMapping
@PathVariable
@RestController
1.value/path：映射路径；
2.method：限定请求的方式，枚举：
3.params：限定要处理请求的参数，
4.headers：限定要处理请求的请求头信息，只有匹配该请求头内容的请求，才会被该方法处理；
5.consumes消费： 指定处理请求的提交内容类型（Content-Type），例如application/json, text/html;
6.produces生产:    指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回；
```
6. 要熟悉接口测试工具常见的操作
7. 理解前后端分离特性与好处
```
1.前后端责任清晰，后端专注于数据上，前端专注于视觉上。
2.无需等待对方的开发工作结束，提高开发效率。
3.可应对复杂多变的前端需求。
4.增强代码可维护性
```
