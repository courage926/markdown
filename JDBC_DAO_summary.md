# JDBC (Java DataBase Connectivity)
## 为多种关系数据库提供统一访问  
## 定义规范:  
1.连接数据库  
2.发送命令  
3.解析结果集  
4.断开连接  
更换数据库服务器-->更换对应的驱动包

## JDBC操作模板
1.加载驱动 ("com.mysql.jdbc.Driver")  
2.获取连接对象  ("jdbc:mysql://localhost:3306/javaweb","root","admin")  
3.预编译语句  
4.执行SQL命令  
5.释放资源  

## 预编译语句
ps.setObject(index,object)
## DDL 表创建
## DML 增删改
ps.executeUpdate()
## DQL 查
Result rs = ps.executeQuery()   
rs.next()   
rs.getObject()  

# DAO (数据访问接口)
## 规范对数据库表的增删改查
多个表统一调用DAO的方法  

## 设计DAO
### 1.保存方法 void save (Student stu )
### 2.删除方法 void delete (Long id)
### 3.修改方法 void update (Student stu )
### 4.查询当个 Student get(Long id)
### 5.查询多个 List<Student>listAll()

## DAO规范
### cn.wolfcode.smis.domain: Student
根据数据表创建domain,字段要写注释
### cn.wolfcode.smis.dao: IStudentDAO
根据domian 写接口,要写文档注释
### cn.wolfcode.smis.dao.impl:StudentDAOImpl
根据接口生成实现类,不用急着填
### cn.wolfcode.smis.test:StudentDAOTest
再根据接口生成测试类,测试先行,写一个测一个
### cn.wolfcode.smis.util:JDBCUtil
抽取重复的部分,字段,方法...

## 重构设计(抽取JDBCUtil)
1.抽取getConnection()方法  
2.四要素放到db.proproperties  
硬编码  
3.将加载驱动放到JDBCUtil类的静态代码块  
只执行一次  
## SQL注入问题
通过传递参数的方式,将SQL语义更改了,叫做SQL注入  
1.使用静态语句对象,拼接SQL,可能出现SQL注入问题  
2.SQL模板已经固定,没有SQL注入问题
