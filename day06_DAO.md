# DAO
## 为什么使用DAO
<img alt="day06_DAO-28383853.png" src="assets/day06_DAO-28383853.png" width="" height="" >  
所有查询列表都需要修改  

DAO规范是用来规范数据库表的增删改查的  
别人不需要写jlyzs
而是直接调用DAO方法即可
## DAO的设计思想和规范
###设计DAO:
#### 1.保存方法
~~void save(String name,int age);//列多的话,参数太过~~  
void save(Student s);//把要保存的对象封装成一个对象,传递给方法  
用来描述数据库表结构的javabean-->domain
#### 2.删除方法
void delete(Long id);//根据主键id来删除数据
#### 3.修改方法
~~void update(long id,Student stu);//stu里面已经有id~~  
void update(Student stu);
#### 4.查询单个
Student get(Long id);//把查询数据封装到domain中
#### 5.查询多个
List<Student>  listAll();

### DAO规范:
只要有操作数据库的地方,都需要该规范  
主要就是针对包,以及类名进行规范  
#### 1.DAO接口
cn.wolfcode.smis.dao:
IStudentDAO
#### 2.DAO接口的实现类
cn.wolfcode.smis.dao.impl:
StudentDAOImpl
#### 3.domain
cn.wolfcode.smis.domain:
Student
#### 4.测试类:
cn.wolfcode.smis.test:
StudentDAOTest
#### 5.工具类:
cn.wolfcode.smis.util:
StringUtil/JDBCUtil

## DAO 的开发流程

1.创建数据库 表   
2.根据数据库 表 创建domain包和类:字段要写注释  
3.根据domian  创建DAO包和接口:要写文档注释  
4.根据接口生成实现类  
5.根据测试先行,根据DAO接口生成测试类,完成测试类  
6.实现实现类的方法,注意,实现一个测试一个  


<img alt="day06_DAO-415e740f.png" src="assets/day06_DAO-415e740f.png" width="" height="" >

<img alt="day06_DAO-e11d79f3.png" src="assets/day06_DAO-e11d79f3.png" width="" height="" >
