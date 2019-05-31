# MySQL
## 数据库
### 为什么使用数据库
数据库的查找效率比txt或者xml文档高

### 数据库是什么?
数据库 DB (DataBase):存储和管理数据的仓库   
数据库管理系统 DBMS (DataBase Management System)  
信息管理系统 MIS(Management Infromation System)

### 关系数据库技术阶段
使用表这种关系将数据组织起来  
代表DBMS: Oracle.  DB2.  MySQL.  SQL

### MySQL
优点:开源 体积小 速度快

### SQL
定义:关系型数据库的标准语言  
数据查询语言 DQL :SELECT  
数据操作语言 DML :INSERT,UPDATE,DELETE  
数据定义语言 DDL :CREATE,DROP  
大小写不敏感 但是一般关键字大写 其他小写
## ORM思想
表(二维表):固定的列和任意的行,  
是同类实体的各项属性的集合.

表里面的数据,也可以用java来描述  
<img alt="day4_MySQL-13d68f44.png" src="assets/day4_MySQL-13d68f44.png" width="" height="" >

## MySQL 安装和配置
默认端口:3306  
默认字符集:UTF8  
设置密码:admin  
<img alt="day4_MySQL-6bc89e5b.png" src="assets/day4_MySQL-6bc89e5b.png" width="" height="" >

<img alt="day4_MySQL-7c172a44.png" src="assets/day4_MySQL-7c172a44.png" width="" height="" >

## Navicat工具
图形化工具

## 面试题:MyISAM和InnoDB各自的优缺点
MyISAM: 拥有较高的插入,查询速度,但是不支持事务,不支持外键.  
InnoDB:支持事务,支持外键,支持行级锁定,性能较低.  
综述,没有事务是很恐怖的事情,所以一般都用InnDB

## MySQL 列 的数据类型
<img alt="day4_MySQL-f254adc6.png" src="assets/day4_MySQL-f254adc6.png" width="" height="" >

## 表的操作
<img alt="day4_MySQL-aa0bd3fc.png" src="assets/day4_MySQL-aa0bd3fc.png" width="" height="" >  

<img alt="day4_MySQL-30b3b5e3.png" src="assets/day4_MySQL-30b3b5e3.png" width="" height="" >

## 表的约束
<img alt="day4_MySQL-d122219e.png" src="assets/day4_MySQL-d122219e.png" width="" height="" >

## 数据操作
### 保存
<img alt="day4_MySQL-56524671.png" src="assets/day4_MySQL-56524671.png" width="" height="" >
### 更新
<img alt="day4_MySQL-fda46419.png" src="assets/day4_MySQL-fda46419.png" width="" height="" >
### 删除
<img alt="day4_MySQL-cc1d0723.png" src="assets/day4_MySQL-cc1d0723.png" width="" height="" >

## 简单查询
<img alt="day4_MySQL-ad2fa68f.png" src="assets/day4_MySQL-ad2fa68f.png" width="" height="" >  

<img alt="day4_MySQL-05bfbacb.png" src="assets/day4_MySQL-05bfbacb.png" width="" height="" >
## 过滤查询
<img alt="day4_MySQL-a9a4347a.png" src="assets/day4_MySQL-a9a4347a.png" width="" height="" >

<img alt="day4_MySQL-11cceae0.png" src="assets/day4_MySQL-11cceae0.png" width="" height="" >

<img alt="day4_MySQL-2dea1fb5.png" src="assets/day4_MySQL-2dea1fb5.png" width="" height="" >

## 范围查询
<img alt="day4_MySQL-7f6a06eb.png" src="assets/day4_MySQL-7f6a06eb.png" width="" height="" >
## 集合查询
<img alt="day4_MySQL-6affd497.png" src="assets/day4_MySQL-6affd497.png" width="" height="" >
## 空值查询
<img alt="day4_MySQL-85c7e4d9.png" src="assets/day4_MySQL-85c7e4d9.png" width="" height="" >

## 模糊查询
<img alt="day4_MySQL-a54fd9c0.png" src="assets/day4_MySQL-a54fd9c0.png" width="" height="" >

## 执行顺序
<img alt="day4_MySQL-174a26f2.png" src="assets/day4_MySQL-174a26f2.png" width="" height="" >

<img alt="day4_MySQL-72b5cd29.png" src="assets/day4_MySQL-72b5cd29.png" width="" height="" >

## 结果排序
<img alt="day4_MySQL-4d1d3d9e.png" src="assets/day4_MySQL-4d1d3d9e.png" width="" height="" >

# 小结  
<img alt="day4_MySQL-b583bed0.png" src="assets/day4_MySQL-b583bed0.png" width="" height="" >

<img alt="day4_MySQL-70fdc48b.png" src="assets/day4_MySQL-70fdc48b.png" width="" height="" >  

CREATE TABLE `player`(
`id` BIGINT PRIMARY KEY auto_increment,
`nickname` VARCHAR(20),
`PASSWORD`VARCHAR(20),
`age`INT );

insert INTO player
(id,nickname,PASSWORD,age)
VALUES(1,'刘小备','admin',16);

DELETE FROM player
where age<18;

DELETE FROM player
WHERE PASSWORD='admin';

UPDATE player
SET	age=age+1
where id =2;

UPDATE player
SET nickname='佚名',PASSWORD=null
where id=10;

select* from player
WHERE age BETWEEN 18 and 40;

SELECT* FROM player
WHERE id<100;

SELECT * FROM player LIMIT 20,5;

SELECT * FROM player
WHERE age in (8,18,28);

SELECT * FROM player ORDER BY age DESC,id;

SELECT COUNT(*) FROM player

SELECT * FROM player
WHERE nickname='佚名'AND PASSWORD is NULL;

SELECT * FROM player
WHERE nickname LIKE '___';

SELECT * FROM player
WHERE nickname='root'AND PASSWORD='admin';

SELECT * FROM player;
