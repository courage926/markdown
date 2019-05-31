# MySQL加强
## 预习
group by 以该列作为查询的???,去重  
any 不同的表之间 id=ANY(select stu_id ...)  
in 同一个表的同一列 stu_id IN(select stu_id ...)  

#回顾
## 数据库
按数据结构来存储和管理数据的计算机软件系统
数据结构/IO流
## 数据库服务器
## DDL DML DQL

## 三范式
1NF:每一列不可分割,同一列中不能有多个值(关系型数据库必须满足)  
2NF:每行可以被唯一区分(主键)  反例:中间表  
3NF:表不包含其他表中的非主键信息  
对于经常修改的数据会要求符合第三范式  
对于经常查询但是不经常修改的可以打破第三范式(冗余数据)  

## 单表查询
ifnull(comm,0) 如果comm为null,则用0代替comm运算;如果不是null,用其本身  
优先级  
模糊查询 % _  
## 多表查询-隐式连接
等值连接/非等值连接  
表的别名 from->where->select  

## 多表查询-显式连接
VN图(韦恩图)  
## 内连接 ... [innner] join ... on  
<img alt="MySQL加强-45c9e9d3.png" src="assets/MySQL加强-45c9e9d3.png" width="" height="" >  

## 外连接     
左连接 left join(默认用左连接)  
右连接 right join  

## 全外连接
mysql暂时还不支持
左外连接+右外连接+去重
union(列数和顺序要保证一致,否则数据会不对)
<img alt="MySQL加强-c33f9a31.png" src="assets/MySQL加强-c33f9a31.png" width="" height="" >

## union(纵向连接)
1.列数一致
2.顺序一致
3.列的数据类型兼容  
4.列名等于第一个select后面的名字
5.union 去重
union all 允许重复

## 自连接
把一张表当做两张表  
给同一张表取两个别名
然后进行非/等值连接

## 单行函数
## 分组函数/聚合函数
## 分组查询
<img alt="MySQL加强-f706f229.png" src="assets/MySQL加强-f706f229.png" width="" height="" >
不能再where字句后面使用聚合函数

<img alt="MySQL加强-f6054498.png" src="assets/MySQL加强-f6054498.png" width="" height="" >

<img alt="MySQL加强-5fc7dc32.png" src="assets/MySQL加强-5fc7dc32.png" width="" height="" >

## 执行顺序
from ->where-> group by-> having-> select-> order by-> limit
