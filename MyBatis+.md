
# # 和 $ 的区别(面试要能说出来)
```
#{} 先预编译一下,有占位符?,然后在设置值
${} 原样输出值,没有占位符,sql注入风险

使用场景
#{} 取值的时候才使用
${} 分组,排序的时候使用
```

# 使用@Param设置多个参数
```
方法名(@Param String name,@Param String password)
```
# resultMap
```
自定义封装
resultMap
type  要封装成的类型
id    封装的编号,可以通过此id找到对应的封装方式

id        主键
column    table的列
property  domain的属性


result    封装非主键信息
column    table的列
property  domain的属性

额外sql
association 封装关联的one方对象
select      另一个关联查询的namespace.id(要执行的任务)
property    要封装的关联属性
colcumn     作为要执行的关联参数

多表方式
association

javatype    
```
# 对象与对象之间的关联关系
```
依赖关系:A离开B就不能正常编译,则A依赖于B
关联关系:
一对一:单向/双向
一对多:单向/双向---外键列(多方)
多对一:单向/双向---双向跟一对多一样
多对多:单向/双向---中间表
```

```
many2one
sql中通过例如${dept.id}获取属性
@Cleanup
获取mapper代理对象
准备one方对象
准备many方对象
设置关系
保存到数据库(one方和many方对象)
(主键自增长 回填)
(引用传递)
(先保存one方对象再保存many方)
session.commit();
```

# 延迟加载
```
不需要的时候不要查询多余的信息
需要的时候再查询
```
<img alt="MyBatis+-5ffc29d9.png" src="assets/MyBatis+-5ffc29d9.png" width="" height="" >
<img alt="MyBatis+-edf37032.png" src="assets/MyBatis+-edf37032.png" width="" height="" >
<img alt="MyBatis+-b3fee991.png" src="assets/MyBatis+-b3fee991.png" width="" height="" >
