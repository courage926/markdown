# Redis

<img alt="redis-847ad653.png" src="assets/redis-847ad653.png" width="" height="" >

<img alt="redis-1e70a893.png" src="assets/redis-1e70a893.png" width="" height="" >

# NoSQL:
Not Only 关系型数据库
非关系型数据库

针对关系型数据库不擅长的场景
```
键值存储:redis多用于项目的高速缓存
文档存储(树状结构的数据,类xml):MongoDB广泛用于社交类应用
文件存储:FastDFS 相册/视频网站
列式存储:HBase 主要用于分析领域
```

# Redis:
```
基于内存存储数据,必要时可以存到文件,所以性能极高
可以理解为是一个机器高性能的超大Map
数据结构比较简单,没有关系型数据库那么多功能
- redis中事务只有同时成功,没有同时失败
- 没有表的概念和相关操作
- 单线程,没有并发的线程安全问题
```

<img alt="redis-c5863f17.png" src="assets/redis-c5863f17.png" width="" height="" >

<img alt="redis-73f2f0f7.png" src="assets/redis-73f2f0f7.png" width="" height="" >

# redis支持的数据类型
https://www.runoob.com/redis/redis-tutorial.html

# 基本命令
<img alt="redis-518db3eb.png" src="assets/redis-518db3eb.png" width="" height="" >

<img alt="redis-a86dddbb.png" src="assets/redis-a86dddbb.png" width="" height="" >


<img alt="redis-55a82980.png" src="assets/redis-55a82980.png" width="" height="" >

# zset
<img alt="redis-0d8bbedc.png" src="assets/redis-0d8bbedc.png" width="" height="" >

<img alt="redis-2db8602d.png" src="assets/redis-2db8602d.png" width="" height="" >

# redis的管理命令
## 管理key的命令

<img alt="redis-fb1db9c0.png" src="assets/redis-fb1db9c0.png" width="" height="" >

# jedis
java操作redis
## 搭建环境

<img alt="redis-dc34e87c.png" src="assets/redis-dc34e87c.png" width="" height="" >

<img alt="redis-b8308102.png" src="assets/redis-b8308102.png" width="" height="" >

<img alt="redis-43447754.png" src="assets/redis-43447754.png" width="" height="" >

# 缓存
<img alt="redis-3c53ccd4.png" src="assets/redis-3c53ccd4.png" width="" height="" >

<img alt="redis-ed979e42.png" src="assets/redis-ed979e42.png" width="" height="" >

<img alt="redis-74ac220b.png" src="assets/redis-74ac220b.png" width="" height="" >

# 实时点赞统计
 可以通过配置文件进行修改
 短时间内的并发严重

# 热门推荐
# 抽奖
# 好友推荐

# 应用场景
<img alt="redis-6a3294ad.png" src="assets/redis-6a3294ad.png" width="" height="" >

# 集群模式

<img alt="redis-0ba47e78.png" src="assets/redis-0ba47e78.png" width="" height="" >

jredis

<img alt="redis-ba5c0eca.png" src="assets/redis-ba5c0eca.png" width="" height="" >
