# 冗余数据/打破第三范式
免于关联过多的中间表,查出重复数据
# 旅游日记
<img alt="项目三day5-d5a5fa8d.png" src="assets/项目三day5-d5a5fa8d.png" width="" height="" >

# 表设计
- 根据页面效果 所见即所得
<img alt="项目三day5-c27b56fd.png" src="assets/项目三day5-c27b56fd.png" width="" height="" >
- 隐藏字段 状态 在页面中未显示出来的
- 关联表 (目的地,作者)

- 表格跟doamian字段对应

<img alt="项目三day5-1b26b6ad.png" src="assets/项目三day5-1b26b6ad.png" width="" height="" >

<img alt="项目三day5-4ff9b8d8.png" src="assets/项目三day5-4ff9b8d8.png" width="" height="" >

# 目的地明细下游记
<img alt="项目三day5-278fc6e7.png" src="assets/项目三day5-278fc6e7.png" width="" height="" >

<img alt="项目三day5-eaa10f80.png" src="assets/项目三day5-eaa10f80.png" width="" height="" >

<img alt="项目三day5-a5e43b1e.png" src="assets/项目三day5-a5e43b1e.png" width="" height="" >

<img alt="项目三day5-d55fc0c3.png" src="assets/项目三day5-d55fc0c3.png" width="" height="" >

<img alt="项目三day5-93288b74.png" src="assets/项目三day5-93288b74.png" width="" height="" >

# 范围查询
<img alt="项目三day5-449c9a46.png" src="assets/项目三day5-449c9a46.png" width="" height="" >

<img alt="项目三day5-cb2fd94f.png" src="assets/项目三day5-cb2fd94f.png" width="" height="" >

<img alt="项目三day5-2888538c.png" src="assets/项目三day5-2888538c.png" width="" height="" >

<img alt="项目三day5-46f73644.png" src="assets/项目三day5-46f73644.png" width="" height="" >

# 排序
<img alt="项目三day5-13e18f27.png" src="assets/项目三day5-13e18f27.png" width="" height="" >

<img alt="项目三day5-1c0bb6e2.png" src="assets/项目三day5-1c0bb6e2.png" width="" height="" >

# TravelController
## "list"
### 长度过长/省略号
<img alt="项目三day5-53f12300.png" src="assets/项目三day5-53f12300.png" width="" height="" >
## detail 游记明细
- detail
- toasts
- sds 阅读量前3攻略明细
- ts 阅读量前3游记
- <img alt="项目三day5-fd8af5f7.png" src="assets/项目三day5-fd8af5f7.png" width="" height="" >

- <img alt="项目三day5-1497a9e3.png" src="assets/项目三day5-1497a9e3.png" width="" height="" >

<img alt="项目三day5-226aef42.png" src="assets/项目三day5-226aef42.png" width="" height="" >

<img alt="项目三day5-d73e0464.png" src="assets/项目三day5-d73e0464.png" width="" height="" >

<img alt="项目三day5-1e09a9dd.png" src="assets/项目三day5-1e09a9dd.png" width="" height="" >

## input
- 要求先登录 requireLogin
- tv
- region 实际上是目的地

<img alt="项目三day5-47cb0752.png" src="assets/项目三day5-47cb0752.png" width="" height="" >

### 图片上传/选择封面
<img alt="项目三day5-8b035ca8.png" src="assets/项目三day5-8b035ca8.png" width="" height="" >

### baidu ueditor /富文本编辑框
- ueditor mini  
- 导包 apache common

<img alt="项目三day5-b8853cb6.png" src="assets/项目三day5-b8853cb6.png" width="" height="" >

# 思考
<img alt="项目三day5-2648ca8e.png" src="assets/项目三day5-2648ca8e.png" width="" height="" >
js 先判断userinfo

# 游记的编辑与添加
<img alt="项目三day5-d656203b.png" src="assets/项目三day5-d656203b.png" width="" height="" >

- 其他
```
//作者
注解中获取:travel.setauthor(userinfo)
//文章摘要
1.截取200个字符串
2.审核时,运营人员总结概括
//创建时间
//最后更新时间
//游记内容
```

<img alt="项目三day5-a54a84e2.png" src="assets/项目三day5-a54a84e2.png" width="" height="" >

<img alt="项目三day5-6a17425a.png" src="assets/项目三day5-6a17425a.png" width="" height="" >

<img alt="项目三day5-750aa670.png" src="assets/项目三day5-750aa670.png" width="" height="" >

<img alt="项目三day5-b5d04ee7.png" src="assets/项目三day5-b5d04ee7.png" width="" height="" >

<img alt="项目三day5-201b299e.png" src="assets/项目三day5-201b299e.png" width="" height="" >

<img alt="项目三day5-f59deb81.png" src="assets/项目三day5-f59deb81.png" width="" height="" >

# 发布状态才查
<img alt="项目三day5-f9e4786e.png" src="assets/项目三day5-f9e4786e.png" width="" height="" >

<img alt="项目三day5-048678d8.png" src="assets/项目三day5-048678d8.png" width="" height="" >

<img alt="项目三day5-51bc2777.png" src="assets/项目三day5-51bc2777.png" width="" height="" >

# 只有当前登录的用户是该游记的作者的时候,才能显示编辑按钮
<img alt="项目三day5-33f724ec.png" src="assets/项目三day5-33f724ec.png" width="" height="" >

查询detail是管理查询作者id跟登录的用户id对比,
一致时显示
不一致不显示

# 评论
平面化:文档格式:json:kv对格式

# mongoDB
<img alt="项目三day5-3853f6a6.png" src="assets/项目三day5-3853f6a6.png" width="" height="" >

<img alt="项目三day5-3b69eec9.png" src="assets/项目三day5-3b69eec9.png" width="" height="" >

# 服务创建
<img alt="项目三day5-92812ad7.png" src="assets/项目三day5-92812ad7.png" width="" height="" >
- 依赖配置
- 要到parent添加版本管理
- 配置文件application.mongodb.properties
- 创建luowowo数据库
- server propterties
- config.MongoDBConfig

<img alt="项目三day5-81d7d6d6.png" src="assets/项目三day5-81d7d6d6.png" width="" height="" >

- 启动类 CommentServer

<img alt="项目三day5-4198b661.png" src="assets/项目三day5-4198b661.png" width="" height="" >

- domain

<img alt="项目三day5-60aa648c.png" src="assets/项目三day5-60aa648c.png" width="" height="" >

- service

攻略评论服务

- impl
<img alt="项目三day5-7e97e72f.png" src="assets/项目三day5-7e97e72f.png" width="" height="" >

- 以前注入 MongoTemplate
- jpa
- spring-data
```
//原理:spring-data 在加载类的时候,会扫描所有实现mongorespository的所有接口
//然后通过aop方式实现crud pageing query等功能
```
- repository包 创建接口interface
```
使用mongoDb 的jpa规范处理 crud操作
1.必须集成
2.指定操作类型 可以通过类型获取文档名字,以及文档下的
3.指定id的类型是:String 即@Id 贴了这个标签的字段的类型
4.贴@repository
```
<img alt="项目三day5-4a608078.png" src="assets/项目三day5-4a608078.png" width="" height="" >

<img alt="项目三day5-ef660aca.png" src="assets/项目三day5-ef660aca.png" width="" height="" >

<img alt="项目三day5-1bc4c2bd.png" src="assets/项目三day5-1bc4c2bd.png" width="" height="" >

- dataController
  - initMongoData

# 评论类型
- 微信回复
- 盖楼式

# 评论实体分析

# StrategyController
```
//攻略评论
必须登录才能评论
```
<img alt="项目三day5-906e9374.png" src="assets/项目三day5-906e9374.png" width="" height="" >


<img alt="项目三day5-4f006c0d.png" src="assets/项目三day5-4f006c0d.png" width="" height="" >

<img alt="项目三day5-206985ba.png" src="assets/项目三day5-206985ba.png" width="" height="" >

# 评论回显
## 分页
springdata提供的分页封装对象,类似:PageResult
<img alt="项目三day5-b9f1ba41.png" src="assets/项目三day5-b9f1ba41.png" width="" height="" >

<img alt="项目三day5-1f748099.png" src="assets/项目三day5-1f748099.png" width="" height="" >

<img alt="项目三day5-70cd408d.png" src="assets/项目三day5-70cd408d.png" width="" height="" >

<img alt="项目三day5-00aac4ce.png" src="assets/项目三day5-00aac4ce.png" width="" height="" >

<img alt="项目三day5-858801e6.png" src="assets/项目三day5-858801e6.png" width="" height="" >

- 完整
<img alt="项目三day5-f29824b3.png" src="assets/项目三day5-f29824b3.png" width="" height="" >

# dubbo序列化方式
<img alt="项目三day5-397a292e.png" src="assets/项目三day5-397a292e.png" width="" height="" >

- hession:需要所有类实现serializable 同时存在空参构造器(默认使用这个)
- kryo:也是一种序列化的方式,这种相对来说性能更高,不需要实现serializable

<img alt="项目三day5-208cd892.png" src="assets/项目三day5-208cd892.png" width="" height="" >

<img alt="项目三day5-935f4ec3.png" src="assets/项目三day5-935f4ec3.png" width="" height="" >

<img alt="项目三day5-a59c5290.png" src="assets/项目三day5-a59c5290.png" width="" height="" >



<img alt="项目三day5-aa5bea03.png" src="assets/项目三day5-aa5bea03.png" width="" height="" >

<img alt="项目三day5-3830ca57.png" src="assets/项目三day5-3830ca57.png" width="" height="" >

<img alt="项目三day5-788c0888.png" src="assets/项目三day5-788c0888.png" width="" height="" >

# 总结
```
1. 游记的crud
带范围的条件高级查询

2.mongodb

3,攻略评论与点赞
```

<img alt="项目三day5-5f4244f1.png" src="assets/项目三day5-5f4244f1.png" width="" height="" >
