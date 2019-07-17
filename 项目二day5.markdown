# app看游记页面
```
展示已发布状态的游记(滚动分页)
按照发布时间倒序排序
```
# 游记内容页面
```
点击图片查看游记的内容
展示作者 地区...
```
<img alt="项目二day5-2d456c2e.png" src="assets/项目二day5-2d456c2e.png" width="" height="" >

# 接口设计
```
获取全部游记接口
1. 资源路径: /travels
2. 请求动作: get
3. 请求参数: 分页参数,状态
4. 返回结果: PageInfo
```
<img alt="项目二day5-7c72ffef.png" src="assets/项目二day5-7c72ffef.png" width="" height="" >

travelPage:  
<img alt="项目二day5-272d8c9e.png" src="assets/项目二day5-272d8c9e.png" width="" height="" >

自己手动包一个div:  
<img alt="项目二day5-1d41ad97.png" src="assets/项目二day5-1d41ad97.png" width="" height="" >

<img alt="项目二day5-4ff233b5.png" src="assets/项目二day5-4ff233b5.png" width="" height="" >

<img alt="项目二day5-310b5093.png" src="assets/项目二day5-310b5093.png" width="" height="" >

游记的作者的头像要查(sql)   
<img alt="项目二day5-7ca4dc70.png" src="assets/项目二day5-7ca4dc70.png" width="" height="" >

# a标签跳转
封面/标题:
<img alt="项目二day5-a041ee85.png" src="assets/项目二day5-a041ee85.png" width="" height="" >

头像:
<img alt="项目二day5-57abf01f.png" src="assets/项目二day5-57abf01f.png" width="" height="" >

<img alt="项目二day5-4dd52109.png" src="assets/项目二day5-4dd52109.png" width="" height="" >

<img alt="项目二day5-9f2bdfba.png" src="assets/项目二day5-9f2bdfba.png" width="" height="" >

<img alt="项目二day5-ca6564cf.png" src="assets/项目二day5-ca6564cf.png" width="" height="" >

<img alt="项目二day5-5c708a27.png" src="assets/项目二day5-5c708a27.png" width="" height="" >

# 抽取到common.js
<img alt="项目二day5-a13aafa6.png" src="assets/项目二day5-a13aafa6.png" width="" height="" >

<img alt="项目二day5-9620d30e.png" src="assets/项目二day5-9620d30e.png" width="" height="" >

# 跳转获取id
```
//获取游记id
var  params =
```
<img alt="项目二day5-4bef2a17.png" src="assets/项目二day5-4bef2a17.png" width="" height="" >

<img alt="项目二day5-8d89208c.png" src="assets/项目二day5-8d89208c.png" width="" height="" >

<img alt="项目二day5-ad39ec53.png" src="assets/项目二day5-ad39ec53.png" width="" height="" >

<img alt="项目二day5-1448e03f.png" src="assets/项目二day5-1448e03f.png" width="" height="" >

<img alt="项目二day5-e0a2a3b5.png" src="assets/项目二day5-e0a2a3b5.png" width="" height="" >

<img alt="项目二day5-35cd8f7b.png" src="assets/项目二day5-35cd8f7b.png" width="" height="" >

<img alt="项目二day5-ecd1ab09.png" src="assets/项目二day5-ecd1ab09.png" width="" height="" >

*查单日志要查询用户的数据*

<img alt="项目二day5-e9b6ea1d.png" src="assets/项目二day5-e9b6ea1d.png" width="" height="" >

<img alt="项目二day5-6e0dc27b.png" src="assets/项目二day5-6e0dc27b.png" width="" height="" >

# 攻略需求分析
<img alt="项目二day5-06e53dd8.png" src="assets/项目二day5-06e53dd8.png" width="" height="" >

<img alt="项目二day5-1fecc31f.png" src="assets/项目二day5-1fecc31f.png" width="" height="" >

# admin攻略管理页面
```
domain
mapper
service
xml:base->core
```
<img alt="项目二day5-52fe57cd.png" src="assets/项目二day5-52fe57cd.png" width="" height="" >

<img alt="项目二day5-2562436d.png" src="assets/项目二day5-2562436d.png" width="" height="" >

<img alt="项目二day5-953e1404.png" src="assets/项目二day5-953e1404.png" width="" height="" >

<img alt="项目二day5-39f1bbee.png" src="assets/项目二day5-39f1bbee.png" width="" height="" >

<img alt="项目二day5-2db416d8.png" src="assets/项目二day5-2db416d8.png" width="" height="" >

<img alt="项目二day5-4231c1ff.png" src="assets/项目二day5-4231c1ff.png" width="" height="" >

<img alt="项目二day5-93c371ad.png" src="assets/项目二day5-93c371ad.png" width="" height="" >

查询/添加/修改

# 添加/修改功能
<img alt="项目二day5-757185c7.png" src="assets/项目二day5-757185c7.png" width="" height="" >

<img alt="项目二day5-fbbaea2e.png" src="assets/项目二day5-fbbaea2e.png" width="" height="" >


<img alt="项目二day5-49f65d3d.png" src="assets/项目二day5-49f65d3d.png" width="" height="" >

<img alt="项目二day5-b12c71f9.png" src="assets/项目二day5-b12c71f9.png" width="" height="" >

<img alt="项目二day5-13c47ed2.png" src="assets/项目二day5-13c47ed2.png" width="" height="" >

<img alt="项目二day5-a1d9977f.png" src="assets/项目二day5-a1d9977f.png" width="" height="" >

单引号:
<img alt="项目二day5-1e5c97f9.png" src="assets/项目二day5-1e5c97f9.png" width="" height="" >

# 地区处理
查询不为禁用的地区 共享

<img alt="项目二day5-ad722ae3.png" src="assets/项目二day5-ad722ae3.png" width="" height="" >

<img alt="项目二day5-efaebb53.png" src="assets/项目二day5-efaebb53.png" width="" height="" >


<img alt="项目二day5-d2ad1e39.png" src="assets/项目二day5-d2ad1e39.png" width="" height="" >

<img alt="项目二day5-9f4c8d9e.png" src="assets/项目二day5-9f4c8d9e.png" width="" height="" >

<img alt="项目二day5-0e9c9870.png" src="assets/项目二day5-0e9c9870.png" width="" height="" >

# 攻略目录管理(查询)
<img alt="项目二day5-1396b547.png" src="assets/项目二day5-1396b547.png" width="" height="" >

<img alt="项目二day5-dfb0a9cc.png" src="assets/项目二day5-dfb0a9cc.png" width="" height="" >\

<img alt="项目二day5-2daaf5ed.png" src="assets/项目二day5-2daaf5ed.png" width="" height="" >

# 添加和修改 排序

<img alt="项目二day5-b1287930.png" src="assets/项目二day5-b1287930.png" width="" height="" >

<img alt="项目二day5-14a00664.png" src="assets/项目二day5-14a00664.png" width="" height="" >

<img alt="项目二day5-b26b309d.png" src="assets/项目二day5-b26b309d.png" width="" height="" >

<img alt="项目二day5-89b76f8e.png" src="assets/项目二day5-89b76f8e.png" width="" height="" >

<img alt="项目二day5-a8ae1b1e.png" src="assets/项目二day5-a8ae1b1e.png" width="" height="" >

<img alt="项目二day5-ae4175e2.png" src="assets/项目二day5-ae4175e2.png" width="" height="" >

<img alt="项目二day5-a9771c17.png" src="assets/项目二day5-a9771c17.png" width="" height="" >

<img alt="项目二day5-9c152862.png" src="assets/项目二day5-9c152862.png" width="" height="" >

<img alt="项目二day5-02efc0af.png" src="assets/项目二day5-02efc0af.png" width="" height="" >

<img alt="项目二day5-6bddb01f.png" src="assets/项目二day5-6bddb01f.png" width="" height="" >

# 序号自增
<img alt="项目二day5-5dc4a51d.png" src="assets/项目二day5-5dc4a51d.png" width="" height="" >

<img alt="项目二day5-eedd1ec6.png" src="assets/项目二day5-eedd1ec6.png" width="" height="" >

<img alt="项目二day5-819d119f.png" src="assets/项目二day5-819d119f.png" width="" height="" >

<img alt="项目二day5-b052d143.png" src="assets/项目二day5-b052d143.png" width="" height="" >

<img alt="项目二day5-8f51209c.png" src="assets/项目二day5-8f51209c.png" width="" height="" >

# 攻略文章管理

controller:  
<img alt="项目二day5-552414de.png" src="assets/项目二day5-552414de.png" width="" height="" >

<img alt="项目二day5-0915cda7.png" src="assets/项目二day5-0915cda7.png" width="" height="" >

<img alt="项目二day5-330be73a.png" src="assets/项目二day5-330be73a.png" width="" height="" >

# 二级联动
 <img alt="项目二day5-5aa0ff3a.png" src="assets/项目二day5-5aa0ff3a.png" width="" height="" >

 <img alt="项目二day5-1994e975.png" src="assets/项目二day5-1994e975.png" width="" height="" >

 根据大攻略id查询目录
 <img alt="项目二day5-3da8a619.png" src="assets/项目二day5-3da8a619.png" width="" height="" >

<img alt="项目二day5-6fc39628.png" src="assets/项目二day5-6fc39628.png" width="" height="" >

<img alt="项目二day5-3499aa3b.png" src="assets/项目二day5-3499aa3b.png" width="" height="" >

<img alt="项目二day5-1a14c81a.png" src="assets/项目二day5-1a14c81a.png" width="" height="" >

U  editor
CK editor

<img alt="项目二day5-0faa7ef3.png" src="assets/项目二day5-0faa7ef3.png" width="" height="" >

<img alt="项目二day5-c5ae6896.png" src="assets/项目二day5-c5ae6896.png" width="" height="" >

<img alt="项目二day5-9c848563.png" src="assets/项目二day5-9c848563.png" width="" height="" >

<img alt="项目二day5-1b7d1b60.png" src="assets/项目二day5-1b7d1b60.png" width="" height="" >

<img alt="项目二day5-f0bf0654.png" src="assets/项目二day5-f0bf0654.png" width="" height="" >

<img alt="项目二day5-5e4505f0.png" src="assets/项目二day5-5e4505f0.png" width="" height="" >

<img alt="项目二day5-ce3470b5.png" src="assets/项目二day5-ce3470b5.png" width="" height="" >

获取富文本编辑器中的内容


<img alt="项目二day5-54d54cf4.png" src="assets/项目二day5-54d54cf4.png" width="" height="" >

<img alt="项目二day5-6fcf36db.png" src="assets/项目二day5-6fcf36db.png" width="" height="" >

<img alt="项目二day5-62d1e908.png" src="assets/项目二day5-62d1e908.png" width="" height="" >

<img alt="项目二day5-0f083209.png" src="assets/项目二day5-0f083209.png" width="" height="" >

# 小结
1. app看游记页面
2. 内容游记页面
3. admin大攻略管理页面
```
提交表单才上传图片
```
4. admin攻略目录管理页面
```
按照序号正序排序,可以根据大攻略下拉框查询
添加:需要将查询下拉框的值设置到表单下拉框
保存时,用户没有输入要自增1
```
5. admin攻略文章管理页面
```
模态框中使用二级联动的方式选择攻略的类别
保存时,用户没有输入要自增1
如果是发布状态需要设置发布时间
保存时 需要先获取富文本编辑器的内容 在设置到表单的textarea中 才可以提交
ckeditor.getDate

富文本编辑器的上传图片:
需要设置controller的方法
接收的名字name为upload
返回时的状态是upload 0/1
先保存攻略文章表 再保存攻略内容表
```

<img alt="项目二day5-0d47f9a9.png" src="assets/项目二day5-0d47f9a9.png" width="" height="" >

<img alt="项目二day5-3d1aaa90.png" src="assets/项目二day5-3d1aaa90.png" width="" height="" >

<img alt="项目二day5-438a5715.png" src="assets/项目二day5-438a5715.png" width="" height="" >
