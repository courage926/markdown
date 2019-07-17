# 数据库选择
- ngoDB:存储文档类型的数据,平面化,不用左右关联,弱事务
- NySql:金钱,积分相关

# 快速开发
- JPA
- spring-data-jpa

# 数据统计
- 缓存处理 热数据 实时数据
- 数据库:报表数据/冷数据,无需实时

# 缓存框架
<img alt="项目三day7-0197d614.png" src="assets/项目三day7-0197d614.png" width="" height="" >

# redis初始化
关系型数据库->缓存

# 缓存数据管理页面
- 可控
- 数据初始化
- 数据更新
- 数据落地

# 定时器
- 一旦开启,无法关闭
- quartz框架能做到更精细的控制
- 真实项目会有很多定时控制
- 任务调度器

# 攻略首页
## ZSET
# 网站首页


# 攻略推荐
domain
表-删除目的地id
逆向工程

<img alt="项目三day7-174c7f63.png" src="assets/项目三day7-174c7f63.png" width="" height="" >

<img alt="项目三day7-0b58986d.png" src="assets/项目三day7-0b58986d.png" width="" height="" >

<img alt="项目三day7-58ba5b1d.png" src="assets/项目三day7-58ba5b1d.png" width="" height="" >

# 页面改动
<img alt="项目三day7-5043a10d.png" src="assets/项目三day7-5043a10d.png" width="" height="" >

# 数据传递
<img alt="项目三day7-63a015e2.png" src="assets/项目三day7-63a015e2.png" width="" height="" >

# saveOrUpdate
<img alt="项目三day7-b53b9f61.png" src="assets/项目三day7-b53b9f61.png" width="" height="" >


# website controller
<img alt="项目三day7-060c5943.png" src="assets/项目三day7-060c5943.png" width="" height="" >

<img alt="项目三day7-342660db.png" src="assets/项目三day7-342660db.png" width="" height="" >

<img alt="项目三day7-34baa60a.png" src="assets/项目三day7-34baa60a.png" width="" height="" >

<img alt="项目三day7-da487b01.png" src="assets/项目三day7-da487b01.png" width="" height="" >

<img alt="项目三day7-591580f9.png" src="assets/项目三day7-591580f9.png" width="" height="" >

<img alt="项目三day7-7fd8ff3f.png" src="assets/项目三day7-7fd8ff3f.png" width="" height="" >

<img alt="项目三day7-5e9abbc2.png" src="assets/项目三day7-5e9abbc2.png" width="" height="" >

<img alt="项目三day7-85ab640a.png" src="assets/项目三day7-85ab640a.png" width="" height="" >

<img alt="项目三day7-aef8884b.png" src="assets/项目三day7-aef8884b.png" width="" height="" >

# 获取zset中的所有数据 倒序
<img alt="项目三day7-994111b1.png" src="assets/项目三day7-994111b1.png" width="" height="" >
<img alt="项目三day7-0501f22b.png" src="assets/项目三day7-0501f22b.png" width="" height="" >
<img alt="项目三day7-91e92f30.png" src="assets/项目三day7-91e92f30.png" width="" height="" >

<img alt="项目三day7-8000c6f9.png" src="assets/项目三day7-8000c6f9.png" width="" height="" >

```
需求:将所有的攻略按照一定的逻辑排序
排序逻辑:点赞+收藏数
vo对象仅仅存储显示的数据,没有排序效果
此时需要zset这个数据结构实现攻略vo的排序
```
<img alt="项目三day7-6bd1d6a9.png" src="assets/项目三day7-6bd1d6a9.png" width="" height="" >

<img alt="项目三day7-be0aaba7.png" src="assets/项目三day7-be0aaba7.png" width="" height="" >

<img alt="项目三day7-ce15c95e.png" src="assets/项目三day7-ce15c95e.png" width="" height="" >

<img alt="项目三day7-dffe93f6.png" src="assets/项目三day7-dffe93f6.png" width="" height="" >

listener
<img alt="项目三day7-3fccd605.png" src="assets/项目三day7-3fccd605.png" width="" height="" >


<img alt="项目三day7-20ee5f50.png" src="assets/项目三day7-20ee5f50.png" width="" height="" >

<img alt="项目三day7-9ac9b307.png" src="assets/项目三day7-9ac9b307.png" width="" height="" >

<img alt="项目三day7-e061389d.png" src="assets/项目三day7-e061389d.png" width="" height="" >
