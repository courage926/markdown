# 需求分析

普通用户
后台管理人员
游客

移动应用端
后台管理

原型设计工具

# 前后端分离
- 前端项目:静态页面:app
- 后端项目:REST API接口:api
- 后台系统项目 ftl/controller:admin

## 如果把admin放到其他项目可能出现的问题
  1. 安全问题
  2. 代码维护麻烦
  3. 性能问题
  访问app的人比admin的人多

  tomcat集群 nginx负载均衡 每个项目根据访问量来选择tomcat的个数
  轮询 IPhash

  <img alt="项目二day1-990428cc.png" src="assets/项目二day1-990428cc.png" width="" height="">                                                                      

## core
```
domain/mapper/service/
query/util
db等等
```

## parent
```
依赖版本抽取
```
<img alt="项目二day1-1a07d3d0.png" src="assets/项目二day1-1a07d3d0.png" width="" height="" >

# 创建项目
cn.wolfcode.trip
parent

project name:trip
location:.../trip

Module
core
trip/core

admin
api

忽略不用的文件
<img alt="项目二day1-7b71e387.png" src="assets/项目二day1-7b71e387.png" width="" height="" >
删除父项目的source

<img alt="项目二day1-c2b485d7.png" src="assets/项目二day1-c2b485d7.png" width="" height="" >

<img alt="项目二day1-c8ac2b25.png" src="assets/项目二day1-c8ac2b25.png" width="" height="" >
admin同上

<img alt="项目二day1-03e9ccb8.png" src="assets/项目二day1-03e9ccb8.png" width="" height="" >
关联依赖core,admin同上

<img alt="项目二day1-fc58c59e.png" src="assets/项目二day1-fc58c59e.png" width="" height="" >

<img alt="项目二day1-e8f87ed7.png" src="assets/项目二day1-e8f87ed7.png" width="" height="" >

core 数据库
admin freemarker

## 其他配置文件
```
application
db.
generator
log4j
MyBatis
```
<img alt="项目二day1-a35a4bd6.png" src="assets/项目二day1-a35a4bd6.png" width="" height="" >

<img alt="项目二day1-d52e93bf.png" src="assets/项目二day1-d52e93bf.png" width="" height="" >
<img alt="项目二day1-a7e670ef.png" src="assets/项目二day1-a7e670ef.png" width="" height="" >
<img alt="项目二day1-0a584f0a.png" src="assets/项目二day1-0a584f0a.png" width="" height="" >
<img alt="项目二day1-74df3f52.png" src="assets/项目二day1-74df3f52.png" width="" height="" >
<img alt="项目二day1-1d85a454.png" src="assets/项目二day1-1d85a454.png" width="" height="" >
web.xml用restful的
mvc.xml 引入appliactionContext

文件上传

<img alt="项目二day1-580ca103.png" src="assets/项目二day1-580ca103.png" width="" height="" >
@RestController
IndexController


直接对parent打包,所有子项目都打包
web.xml

错误的原因是找不到
core
parent
admin没有web.xml

<img alt="项目二day1-f5a04072.png" src="assets/项目二day1-f5a04072.png" width="" height="" >

<img alt="项目二day1-5ff7972b.png" src="assets/项目二day1-5ff7972b.png" width="" height="" >

启动api和app

pom

<img alt="项目二day1-03bacc27.png" src="assets/项目二day1-03bacc27.png" width="" height="" >

<img alt="项目二day1-7af26e47.png" src="assets/项目二day1-7af26e47.png" width="" height="" >


User
<img alt="项目二day1-c720a64b.png" src="assets/项目二day1-c720a64b.png" width="" height="" >
<img alt="项目二day1-32f4b57b.png" src="assets/项目二day1-32f4b57b.png" width="" height="" >

app
<img alt="项目二day1-d2c60e84.png" src="assets/项目二day1-d2c60e84.png" width="" height="" >

<img alt="项目二day1-f299c399.png" src="assets/项目二day1-f299c399.png" width="" height="" >

api
<img alt="项目二day1-2aac4a30.png" src="assets/项目二day1-2aac4a30.png" width="" height="" >

<img alt="项目二day1-cd97520d.png" src="assets/项目二day1-cd97520d.png" width="" height="" >

<img alt="项目二day1-2beaab4d.png" src="assets/项目二day1-2beaab4d.png" width="" height="" >

<img alt="项目二day1-4a69b9c5.png" src="assets/项目二day1-4a69b9c5.png" width="" height="" >

<img alt="项目二day1-c2b6c9b5.png" src="assets/项目二day1-c2b6c9b5.png" width="" height="" >

<img alt="项目二day1-c414e289.png" src="assets/项目二day1-c414e289.png" width="" height="" >

<img alt="项目二day1-0b857428.png" src="assets/项目二day1-0b857428.png" width="" height="" >

<img alt="项目二day1-21c8e873.png" src="assets/项目二day1-21c8e873.png" width="" height="" >

<img alt="项目二day1-5e71b5ec.png" src="assets/项目二day1-5e71b5ec.png" width="" height="" >

<img alt="项目二day1-aa7f0f84.png" src="assets/项目二day1-aa7f0f84.png" width="" height="" >


<img alt="项目二day1-90b7e997.png" src="assets/项目二day1-90b7e997.png" width="" height="" >


<img alt="项目二day1-a3311cd7.png" src="assets/项目二day1-a3311cd7.png" width="" height="" >

common.js
定义api域名与端口
var baseUrl

<img alt="项目二day1-91caff94.png" src="assets/项目二day1-91caff94.png" width="" height="" >

同源策略

解决跨域问题
mvc.xml配置<mvc:cors>
授权 源 :可以拿数据
...

commons.js
<img alt="项目二day1-ffd933fa.png" src="assets/项目二day1-ffd933fa.png" width="" height="" >
允许跨域以及允许携带cookies
<img alt="项目二day1-f09f2aa0.png" src="assets/项目二day1-f09f2aa0.png" width="" height="" >

<img alt="项目二day1-a5f57f8e.png" src="assets/项目二day1-a5f57f8e.png" width="" height="" >

<img alt="项目二day1-0245e5e0.png" src="assets/项目二day1-0245e5e0.png" width="" height="" >

<img alt="项目二day1-e499dd56.png" src="assets/项目二day1-e499dd56.png" width="" height="" >


<img alt="项目二day1-4baf59d8.png" src="assets/项目二day1-4baf59d8.png" width="" height="" >

<img alt="项目二day1-998afd5c.png" src="assets/项目二day1-998afd5c.png" width="" height="" >

<img alt="项目二day1-6e44bc05.png" src="assets/项目二day1-6e44bc05.png" width="" height="" >

<img alt="项目二day1-c80804d1.png" src="assets/项目二day1-c80804d1.png" width="" height="" >

<img alt="项目二day1-166eb1d5.png" src="assets/项目二day1-166eb1d5.png" width="" height="" >

<img alt="项目二day1-5ee5c16b.png" src="assets/项目二day1-5ee5c16b.png" width="" height="" >

<img alt="项目二day1-51b91d8a.png" src="assets/项目二day1-51b91d8a.png" width="" height="" >

<img alt="项目二day1-150739fd.png" src="assets/项目二day1-150739fd.png" width="" height="" >


<img alt="项目二day1-9f8a9d31.png" src="assets/项目二day1-9f8a9d31.png" width="" height="" >

<img alt="项目二day1-5d3763a1.png" src="assets/项目二day1-5d3763a1.png" width="" height="" >

缓存操作:
session storage

<img alt="项目二day1-0b9cc32c.png" src="assets/项目二day1-0b9cc32c.png" width="" height="" >

单标签页
SPA单页应用程序

<img alt="项目二day1-79d6bd2a.png" src="assets/项目二day1-79d6bd2a.png" width="" height="" >


<img alt="项目二day1-5cb7f4de.png" src="assets/项目二day1-5cb7f4de.png" width="" height="" >

<img alt="项目二day1-1405bd8e.png" src="assets/项目二day1-1405bd8e.png" width="" height="" >

<img alt="项目二day1-8fda721b.png" src="assets/项目二day1-8fda721b.png" width="" height="" >

<img alt="项目二day1-96fec58a.png" src="assets/项目二day1-96fec58a.png" width="" height="" >

<img alt="项目二day1-2f8ce7b0.png" src="assets/项目二day1-2f8ce7b0.png" width="" height="" >
要static定义为常量,才不会有getter

<img alt="项目二day1-c1176590.png" src="assets/项目二day1-c1176590.png" width="" height="" >

<img alt="项目二day1-cc34c1c1.png" src="assets/项目二day1-cc34c1c1.png" width="" height="" >

jrender基于jquery
<img alt="项目二day1-8cc297b4.png" src="assets/项目二day1-8cc297b4.png" width="" height="" >

<img alt="项目二day1-b263ed57.png" src="assets/项目二day1-b263ed57.png" width="" height="" >

<img alt="项目二day1-ef60ff67.png" src="assets/项目二day1-ef60ff67.png" width="" height="" >

<img alt="项目二day1-3f248a07.png" src="assets/项目二day1-3f248a07.png" width="" height="" >

先把字符串转为对象,再渲染数据

# 注销:
<img alt="项目二day1-9aca3f15.png" src="assets/项目二day1-9aca3f15.png" width="" height="" >

<img alt="项目二day1-acdc8b61.png" src="assets/项目二day1-acdc8b61.png" width="" height="" >

<img alt="项目二day1-4c1f4599.png" src="assets/项目二day1-4c1f4599.png" width="" height="" >

<img alt="项目二day1-9838323f.png" src="assets/项目二day1-9838323f.png" width="" height="" >

<img alt="项目二day1-c6526924.png" src="assets/项目二day1-c6526924.png" width="" height="" >

<img alt="项目二day1-684d81b9.png" src="assets/项目二day1-684d81b9.png" width="" height="" >

<img alt="项目二day1-0ab72d77.png" src="assets/项目二day1-0ab72d77.png" width="" height="" >

<img alt="项目二day1-c8f18e94.png" src="assets/项目二day1-c8f18e94.png" width="" height="" >
清除用户数据

<img alt="项目二day1-292d8649.png" src="assets/项目二day1-292d8649.png" width="" height="" >

<img alt="项目二day1-d890de70.png" src="assets/项目二day1-d890de70.png" width="" height="" >

<img alt="项目二day1-c556ec13.png" src="assets/项目二day1-c556ec13.png" width="" height="" >

//如果session中有用户信息,就是已登录,如果没有就需要跳登录页面
<img alt="项目二day1-42e7ccf8.png" src="assets/项目二day1-42e7ccf8.png" width="" height="" >

user = JSON.aprse(user

通过前端控制跳转叫前端路由/之前的是后端路由


# 小结

设计接口:  
<img alt="项目二day1-007dd838.png" src="assets/项目二day1-007dd838.png" width="" height="" >


1. 注册功能
邮箱不能重复注册/需要检测邮箱,非空判断
设置默认的头像和封面
```
后端:接收参数,判断url,method,params Controller--Service--Mapper--SQL
前端:发送表单,接收返回结果
```
2. 登录功能
检查用名和密码是否正确
登录成功使用UserContext设置用户到session中
同时,返回user给前端
前端使用 *SessionStorage* 来存储用户
(value必须是字符串,所以需要先转json字符串再储存)
json.stringify
json.parse
发送请求要添加baseUrl(写在commons中)
```
查询的user信息:后端->json->sessionStorage.set(login.html)
->usersessionStorage.get(checkLogin.js前端登陆校验)
```
3. 我的个人信息页面
使用jrender进行渲染,render-html,render-src
```
$(".simplePerson").renderValues(user);//渲染数据
```

4. 注销功能
销毁session对象,还有前端的sessionstorage的用户也要清空
跳转页面,使用window.parent跳转   
前端:
```
sessionStorage.removeItem("user");//清除浏览器上的用户数据
```
后端:
```
session.invalidate();
response.setStatus(HttpServletResponse.SC_NO_CONTENT);
```
5. 前端路由控制
抽取checkLogin.js文件
判断sessionstorage是否有登陆用户信息
有就利用json.parse转换为json对象
没有就跳转到登陆页面
checkLogin.js
```
//如果sessionStroage里面有数据,就是已经登录
//否则就跳转到登陆页面
var userStr = sessionStorage.getItem("user");
var user;
if(userStr){
    user = JSON.parse(userStr);
}else{
    window.location.href = "/login.html" ;
}
```
6. 解决跨域问题:
后台:mvc添加配置:授权某个域名可以访问
```
<mvc:cors>
```
前台:设置ajax默认属性 运行跨域,以及带cookie
```
//为所有的ajax请求设置默认的属性
$.ajaxSetup({
    crossDomain: true,//允许跨域
    xhrFields: {withCredentials: true}//允许携带跨域的cookie
});
```
