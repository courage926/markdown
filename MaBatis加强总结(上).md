# 回顾
1.准备工作
```
数据库建表
新建Maven项目和添加依赖和插件
```
2.配置文件
```
db.properties
mybatis-config.xml
log4j.properties
```
3.domain   
4.UserMapper.xml  
5.编写MyBatisUtil  
6.测试类

# Mapper接口原理
```
原理:底层使用的是动态代理,生成Mapper接口的实现类
通过session.getMapper(Mapper.class)获取实现类
namespace.SQLId------------Mapper接口.方法名
在接口中定义CRUD等操作方法
方法的返回类型对应sql元素中定义的resultMap/resultTpe类型

```
# MyBatis 的参数处理
```
SqlSession中的insert等方法只能传入一个参数,如何传入多个参数
1.封装到Map中
2.使用注解@Param
3.封装到List/array
```

# #{} ${}的区别
```
#:带一个单引号,可以防止SQL注入
$:直接作为参数,用于order by或者group by
```

# 动态SQL
```
if
choose...when...otherwise
where
set
trim
foreach
```
# 关系概述
```
依赖:A依赖于B B作为A的一个成员变量

一对一
一对多
多对一
多对多
```

# 多对一
```
many方作为one方的一个成员变量
many方的表要有外键

保存
先保存one方
设置关系(many方.setOne方)
再保存many方
session.commit();

查询:
resultMap
手动发sql?
association发送额外sql/多表查询

```

# 延迟加载
```
为了避免一些无谓的性能（针对额外 SQL 查询）
```
<img alt="MaBatis加强总结(上)-8d0d2df3.png" src="assets/MaBatis加强总结(上)-8d0d2df3.png" width="" height="" >
<img alt="MaBatis加强总结(上)-07e11641.png" src="assets/MaBatis加强总结(上)-07e11641.png" width="" height="" >
<img alt="MaBatis加强总结(上)-7f0929f1.png" src="assets/MaBatis加强总结(上)-7f0929f1.png" width="" height="" >
<img alt="MaBatis加强总结(上)-74317697.png" src="assets/MaBatis加强总结(上)-74317697.png" width="" height="" >
<img alt="MaBatis加强总结(上)-0c68a28f.png" src="assets/MaBatis加强总结(上)-0c68a28f.png" width="" height="" >

# 下
# mybatis 一级缓存
```
进行查询会先在sqlSession的缓存空间中查询是否有这个key对应的对象,
如果有,直接返回到调用者;
如果没有,则去数据库查询,放入缓存,在返回调用者
一级缓存默认开启,生命周期同session,但是session之间无法进行数据共享,所以作用有限,只提高了一点点的性能.
```
# N+1问题
```
使用额外sql进行查询的时候,
如果N个员工在不同的部门
那么需要进行N+1次查询

解决:使用多表查询,提高性能

但是如果只需要把所有员工的信息查出来,低频率地查询部门对象,
这时使用N+1更合适
```

# 多对一 删除
```
先打破关系,在进行删除
删除一方,需要打破多方的外键约束
OneMapper接口:添加delete方法
ManyMapper:deleteRelation方法
OneMapper.xml:delete table
ManyMapper.xml:update dept_id
```
# 一对多
```
save--updateRelation
get---额外sql/多表查询

```

# 横向对比+

```
首先:确定谁是主体,到底是通过one方查询many方,还是通过many方查询one方
其次:确定其关联的对象是one方还是many方
    ---查询关联的one方对象:使用多表的方式查询,使用association标签
    ---查询关联的many方对象,使用额外sql的方式,使用collection标签
其他:由主体来维护关系
    在对应的Mapper写要封装的对象(额外sql)

多表查询思路:
  1.确定需要查询的表
  2.确定表之间的连接关系
  3.过滤条件是什么
  4.需要查询出来的列是什么
```
# 双向many2one
```
通过many方查询one方对象
通过one方查询many方对象---->双向
```
# many2many
```
中间表维护关系
单向多对多
确定主体student
teacher
建表 student teacher
中间表student_teacher
stu_id
tea_id

Student类 关联的many方对象List<Teacher> Teas
Teacher类

StudentMapper insert(Student stu);
TeacherMapper insert(Teacher tea);
StudentMapper.xml namespace
TeacherMapper.xml namespace

mybatis.xml 配置管理 mapper

StudentMapper insert sql 主键自增长
TeacherMapper insert sql 主键自增长

App类 testInsert
//准备Mapper
session.getMapper

//准备对象
new Student()
setName()
new Teacher()
setName()

//设置关系
s1.setTeas().add()
s2.setTeas().add()

//保存到数据库
StudentMapper.insert()
TeacherMapper.insert()

//保存关系到数据库
s.getTeas
遍历teas
studentMapper.insertRelation(tea.getId(),stu.getId());
--->StudentMapper insertRelation  @Param

StudentMapper.xml:
insert into student_teacher (stu_id,tea_id)values(#{},#{})




StudentMapper接口: 方法selectByPrimaryKey
StudentMapper.xml:
sql:
resultMap:

TeacherMapper.xml:
额外SQL
select t_name,t_id
from tescher t  join student_teacher st
on t_id=st.tea_id
where st.stu_id=#{s.id}

多表
select s.id,s.name,t.name t_name,t.name t_id
from tescher t  
join student_teacher st
on t_id=st.tea_id
join student s
on s.id=st.stu_id
where st.stu_id=#{id}


result

App:testGet

```
<img alt="MaBatis加强总结(上)-8639f8d6.png" src="assets/MaBatis加强总结(上)-8639f8d6.png" width="" height="" >


# 二级缓存
```
一级缓存性能提高不明显

先到一级缓存找
找不到去二级缓存
还是找不到就去数据库

生命周期=sqlsessionfactory生命周期
session之间数据共享
手动开启-->mapper.xml 添加cache
读远远大于写的对象
发生dml操作就是清除二级缓存

```
<img alt="MaBatis加强总结(上)-061afb79.png" src="assets/MaBatis加强总结(上)-061afb79.png" width="" height="" >

## 高效使用二级缓存
```
useCache  默认true 设置成false    全查询直接到数据库查,不再查看缓存(因为查不到)
flushCache  默认true 设置成false 插入操作不刷新二级缓存
```

# EhCache二级缓存
```
1.导包:mybatis-ehcache
2.配置文件:ehcache.xml-->resources
3.映射文件

可以配置指定的Mapper接口(个性化配置)

```
