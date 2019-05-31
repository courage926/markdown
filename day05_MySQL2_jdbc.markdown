# MySQL_part2
## 分页查询
### 假分页(内存分页/逻辑分页)
速度快,但是容易内存溢出
### 真分页(数据库分页/物理分页)
优点:设计合理的情况下,不会内存溢出   
缺点:翻页慢,复杂
### 语法
<img alt="day05_MySQL2_jdbc-149b6d59.png" src="assets/day05_MySQL2_jdbc-149b6d59.png" width="" height="" >
## 聚合函数
<img alt="day05_MySQL2_jdbc-76ffb5cf.png" src="assets/day05_MySQL2_jdbc-76ffb5cf.png" width="" height="" >

`建议使用 count(*) 可以包括null `  
 java7之前count要用long接收  
 java8可以用int接收  

# 多表查询
## 笛卡尔积
<img alt="day05_MySQL2_jdbc-54be11ce.png" src="assets/day05_MySQL2_jdbc-54be11ce.png" width="" height="" >  
会产生笛卡尔积  
<img alt="day05_MySQL2_jdbc-edf08ac1.png" src="assets/day05_MySQL2_jdbc-edf08ac1.png" width="" height="" >  
连接n张表至少需要n-1个条件  
条件之间用and 连接  

为了区分同名列 要用 表名.列名    
给表取别名,就不能用真名
## 外键约束
先删除从表再删除主表,  
一般先将从表中的外键设置为null  
再删除主表中对应的数据

开发中不用外键约束
### 约定 表名_列名

## 数据备份和恢复
备份:很重要,修改前,先备份

# jdbc
## 概述
### 持久化 persistence
把数据保存到可掉电式存储设备中以供之后使用  
JPA javaEE规范 java persistence api  
java 的持久化API  

没有jdbc规范  
<img alt="day05_MySQL2_jdbc-118aeeb5.png" src="assets/day05_MySQL2_jdbc-118aeeb5.png" width="" height="" >  

有jdbc规范  
<img alt="day05_MySQL2_jdbc-1e97ec64.png" src="assets/day05_MySQL2_jdbc-1e97ec64.png" width="" height="" >  

<img alt="day05_MySQL2_jdbc-0acc95aa.png" src="assets/day05_MySQL2_jdbc-0acc95aa.png" width="" height="" >

<img alt="day05_MySQL2_jdbc-89d0f1f9.png" src="assets/day05_MySQL2_jdbc-89d0f1f9.png" width="" height="" >

## 获取数据库连接对象
Connection类
### 准备工作
导入驱动包!!!   
<img alt="day05_MySQL2_jdbc-732a22b7.png" src="assets/day05_MySQL2_jdbc-732a22b7.png" width="" height="" >  
### 获取数据库连接对象
#### 1.加载注册驱动  
`Driver驱动类`:加载实现Driver接口的类的对象  
如果用registerDriver() 注册驱动就写死了    
实际用`Class.forname(com.mysql.jdbc.Driver)`里面的静态代码块加载注册驱动  
`静态代码块只执行一次`
#### 2.获取数据库连接对象  
`DriverManager类 `   
getConnection(url,user,password);  
url:协议 ip 端口 数据库名    
`jdbc:mysql://localhost:3306/javaweb`  
如果数据库服务器在本机,并且端口是3306,可以省略成:  
`jdbc:mysql:///javaweb`    

## DDl DML操作
<img alt="day05_MySQL2_jdbc-1a16bb5a.png" src="assets/day05_MySQL2_jdbc-1a16bb5a.png" width="" height="" >  
1.Class.forname  
2.getConnection  
3.createStatement  
4.executeUpdate  
5.st.close  
conn.close

## 预编译语句

接口Statement
实现类 PreparedStatement
方法  
ps.setXX(index,XX);索引从1开始  
ps.executeUpdate();  
ps.executeQuery();  
## DQL操作


## 作业
<img alt="day05_MySQL2_jdbc-30c04ebb.png" src="assets/day05_MySQL2_jdbc-30c04ebb.png" width="" height="" >
