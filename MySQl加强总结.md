# MySQL加强总结
## 三范式
```
1NF:每一列都是不可分割的基本数据项(关系型数据库的基本要求)
2NF:每个实例(每行)可以被唯一地区分(主键) 反例:中间表
3NF:一个数据库表中不包含已在其他表中已包含的非主键信息
(对于经常查询但是不经常修改的可以打破第三范式(冗余数据))
```
## SQL分类
```
DQL:查询
DML:操作 增删改
DDL:表(TABLE)的CREATE 和 DROP
```

## 单表查询
```
全列查询:select * from table
去重查询:select distinct job from emp
算数运算:/*-+
限定查询:where
比较运算:= != <> between in like % _ is (not) null
空值判断:IFNULL(arg1,arg2):判断arg1是否null,若是用arg2代替arg1
逻辑运算:and or not (注意优先级)
结果排序:order by ...(desc)
```
## 多表查询
```
1.需要查询的数据分散在多个表中,需要联合各个表才能查询出期望的数据
2.等值连接或非等值连接来消除笛卡尔积
```
### 内连接查询
```
隐式内连接
在where子句中写入连接的条件

显式内连接
table1 join table2 on 连接条件
```
### 外连接查询
```
1.使用内连接查不出没有部门的员工或者没有员工的部门
```
### 左连接查询
```
left join  
查询出 JOIN 左边表的全部数据查询出来，JOIN 右边的表不匹配的数使用 NULL 来填充数据。
```
### 右连接查询
```
right JOIN  
查询出 JOIN 右边表的全部数据查询出来，JOIN 左边的表不匹配的数据使用 NULL 来填充数据。
```
### 全外连接查询
```
FULL OUTER JOIN 中会返回所有右边表中的行和所有左边表中的行，即使在左边的表中没有可对应的列值或者右边的表中没有可对应的列。  
MYSQL 中暂时不支持全连接，可以通过 UNION 左右连接来完成：
```  
### 自连接查询
```
查询思路：把一张表看成是多张表，自己和自己做连表查询
```
### union 和union all
```
join->横向连接
union->纵向连接
UNION 内部的 SELECT 语句必须拥有相同数量的列；
列也必须拥有兼容的数据类型；
每条 SELECT 语句中的列的顺序必须相同；
UNION 结果集中的列名总是等于 UNION 中第一个 SELECT 语句中的列名。
UNION 操作符选取不同的值。若允许重复的值，请使用 UNION ALL（性能高）。
```

## 分组函数
```
COUNT AVG SUM MAX MIN
多行函数在计算时省略列中的空值（即 NULL 不参与运算）；
不能在 where 语句中使用分组函数。
```
## 分组查询
### 语法
```
group by  
如果现在要进行分组的话，则SELECT子句之后，只能出现分组的字段和统计函数，其他的字段不能出现.
```
### 分组限定
having
```
不能在 WHERE 子句中对分组限定，限制组须使用 HAVING 子句；
不能在 WHERE 子句中使用统计函数，而在 HAVING 子句可使用统计函数。
```
## 单行函数
```
DAY HOUR MINUTE MONTH YEAR LAST_DAY(date)
DATE_FORMAT(date,format)
```
## 执行顺序
from ->where-> group by-> having-> select-> order by-> limit

## 韦恩图
<img alt="MySQl加强总结-06ab9286.png" src="assets/MySQl加强总结-06ab9286.png" width="" height="" >

<img alt="MySQl加强总结-cb4e96b2.png" src="assets/MySQl加强总结-cb4e96b2.png" width="" height="" >

<img alt="MySQl加强总结-53359c8c.png" src="assets/MySQl加强总结-53359c8c.png" width="" height="" >

## 子查询
```
查询条件中的限制条件不是一个确定的值，而是一个来自于另一个查询的结果。
```
按子查询的结果集来划分
### 单列单行
得到一个值
使用比较运算符
### 单列多行
```
得到多个值
IN 与列表中的任意一个值相等
ANY = ANY 与IN一样
    > ANY 大于子查询中的最小数据
    < ANY 小于子查询中的最大数据
ALL > ALL 大于子查询中的最大数据
    < ALL 小于子查询中的最小数据
```
### 多列多行
```
得到一个临时表,要设置临时表的别名
```
## 数据库事务
### DML
```
插入:一条insert中可以插入多条数据
更新:子查询/表连接
删除:一般先将查询的结果临时保存到另一张表中,再通过delete语句删除
```
### 事务控制

```
begin   :开启事务
commit  :提交事务
rollback:回滚事务
```
```
a:原子性 不可分割
c:一致性 状态转化一致(数据不被破坏)
i:隔离性 事务之间,互不干扰
d:持久性 一旦提交,不可回滚
```
### 事务并发导致的问题
```
第一类丢失更新(回滚丢失):A事务撤销时,把已提交的更新数据覆盖了
第二类丢失更新(覆盖更新):A事务已经提交的数据,造成B事务所做操作的丢失
脏读:读取到尚未提交的数据
幻读:A事务读取了B事务的新增数据
不可重复读:A事务读取了B事务已经提交的更改数据
```
## 隔离级别
<img alt="MySQl加强总结-2631b846.png" src="assets/MySQl加强总结-2631b846.png" width="" height="" >
```
Read Uncommitted (读取未提交内容)---- 脏读
Read Committed (读取提交内容) ------- 不可重复读
Repeatable Read(可重读)-------------- 幻读
Serializable(可串行化)--------------- 效率极低

默认隔离级别 Repeatable Read
MySQL默认情况下不会出现幻读
索引机制-->不会出现第一类丢失更新
```
## 悲观锁
```
使用数据库自身的排它锁机制(写锁)(排斥其他锁).
DML 自动加上排他锁
DQL 需要我们手动去加上排他锁 select * from table for update
```
## 乐观锁
```
在表中额外加一列,用来表示修改的版本,每次修改版本加一(version)
防止了第二类丢失更新(覆盖更新)
步骤:
1.在表中新增一列,用来表示修改的版本号
2.每次修改数据之前,发送select语句去查询当前被修改数据的信息(包括版本号)
3.发送update语句去更新数据,版本号修改递增1,判断挑中中包含的版本号必须是刚刚查询出来的版本
4.判断update语句执行之后的收影响行数(rows),若row>0则提交事务,否则回滚事务

```

## MySQL的数据库权限
```
权限结构:用户+操作权限
全局权限-数据库权限-表权限-列权限
```



<img alt="MySQl加强总结-f68b073a.png" src="assets/MySQl加强总结-f68b073a.png" width="" height="" >



<img alt="MySQl加强总结-8ea8bc6c.png" src="assets/MySQl加强总结-8ea8bc6c.png" width="" height="" >

<img alt="MySQl加强总结-eb945c4f.png" src="assets/MySQl加强总结-eb945c4f.png" width="" height="" >

企业中先查询出id再作为参数传入
update 或者 delete sql语句

注意要写where
