## 前期工作
1.创建新的项目  
2.创建所有需要使用的包和类  
3.使用Mybatis完成后台的crud
4.完成service层的书写
5.书写前段web:crud

## 前台页面的crud
拷贝css image.js到自己的项目
拷贝/WEB-INF/view
拷贝list.jsp/input.jsp
修改menu.jsp
修改list.jsp中的head和表格中的数据的显示
完成Servlet的crud操作

## 分页查询 和条件过滤查询
完成后台的过滤查询和分页查询
修改页面list.jsp

<img alt="web综合案例-5e933649.png" src="assets/web综合案例-5e933649.png" width="" height="" >

## 登陆操作的实现
创建User类包含username和password
UserDAO USER_IN_SESSION  
UserService  
LoginServlet  
login.jsp  

## 防止不登陆直接访问主页数据
session

没有登陆回到登陆页面

## cookie 保存账号
<img alt="web综合案例-059704dd.png" src="assets/web综合案例-059704dd.png" width="" height="" >

<img alt="web综合案例-660d6f47.png" src="assets/web综合案例-660d6f47.png" width="" height="" >

## 注销操作
清除session中的用户信息
session.removeAttribute()
跳转到登陆页面

## 注册(很少用)
