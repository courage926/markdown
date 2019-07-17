# admin 攻略文章 回显
<img alt="项目二day6-58bd47ca.png" src="assets/项目二day6-58bd47ca.png" width="" height="" >

<img alt="项目二day6-0b12d41b.png" src="assets/项目二day6-0b12d41b.png" width="" height="" >

<img alt="项目二day6-9ecae4bc.png" src="assets/项目二day6-9ecae4bc.png" width="" height="" >

<img alt="项目二day6-dd5be9ea.png" src="assets/项目二day6-dd5be9ea.png" width="" height="" >

<img alt="项目二day6-6614e7f6.png" src="assets/项目二day6-6614e7f6.png" width="" height="" >

# 二级联动下拉框 回显
<img alt="项目二day6-913e43b0.png" src="assets/项目二day6-913e43b0.png" width="" height="" >


<img alt="项目二day6-519b6e38.png" src="assets/项目二day6-519b6e38.png" width="" height="" >

# 文章内容回显
按编辑的时候去查
根据id获取攻略文章的内容
<img alt="项目二day6-34eebb04.png" src="assets/项目二day6-34eebb04.png" width="" height="" >

get方法

<img alt="项目二day6-7ff0894d.png" src="assets/项目二day6-7ff0894d.png" width="" height="" >

<img alt="项目二day6-19edfd42.png" src="assets/项目二day6-19edfd42.png" width="" height="" >

<img alt="项目二day6-445401b4.png" src="assets/项目二day6-445401b4.png" width="" height="" >

<img alt="项目二day6-bad26a7a.png" src="assets/项目二day6-bad26a7a.png" width="" height="" >

<img alt="项目二day6-41a29614.png" src="assets/项目二day6-41a29614.png" width="" height="" >

↑ 添加前清空数据

# app 显示攻略

获取地区表中状态为推荐的数据(不分页)
获取大攻略表状态为推荐的数据(不分页)

获取当前地区下的推荐状态的大攻略(不分页)
获取当前地区下的全部攻略(需要分页)

标签页
<img alt="项目二day6-d1fdbfc1.png" src="assets/项目二day6-d1fdbfc1.png" width="" height="" >

```
1.获取大攻略中状态为推荐的数据
资源路径  /strategies
请求动作  /get
请求参数  state=1
返回结果  List
```

<img alt="项目二day6-cdb2906a.png" src="assets/项目二day6-cdb2906a.png" width="" height="" >

pzgesize设置为0就不会分页

<img alt="项目二day6-500b80a8.png" src="assets/项目二day6-500b80a8.png" width="" height="" >

<img alt="项目二day6-9359abc1.png" src="assets/项目二day6-9359abc1.png" width="" height="" >

循环
<img alt="项目二day6-0a07fcaf.png" src="assets/项目二day6-0a07fcaf.png" width="" height="" >

<img alt="项目二day6-6fa6b098.png" src="assets/项目二day6-6fa6b098.png" width="" height="" >

<img alt="项目二day6-847d9c7e.png" src="assets/项目二day6-847d9c7e.png" width="" height="" >

# 地区数据动态显示
```
2.获取地区中状态为推荐的数据
资源路径  /regions
请求动作  /get
请求参数  state=1
返回结果  List
```
写过不不用了

<img alt="项目二day6-95160f4a.png" src="assets/项目二day6-95160f4a.png" width="" height="" >
用不了插件

使用拼接

<img alt="项目二day6-6a458cfc.png" src="assets/项目二day6-6a458cfc.png" width="" height="" >

<img alt="项目二day6-22d33cbf.png" src="assets/项目二day6-22d33cbf.png" width="" height="" >

<img alt="项目二day6-33708e13.png" src="assets/项目二day6-33708e13.png" width="" height="" >

<img alt="项目二day6-578fb075.png" src="assets/项目二day6-578fb075.png" width="" height="" >

<img alt="项目二day6-5e6ebdb2.png" src="assets/项目二day6-5e6ebdb2.png" width="" height="" >

<img alt="项目二day6-c438f1d6.png" src="assets/项目二day6-c438f1d6.png" width="" height="" >

可以克隆
# freemarker插件
利用模板生成代码

<img alt="项目二day6-9e6aa6db.png" src="assets/项目二day6-9e6aa6db.png" width="" height="" >

<img alt="项目二day6-89300ef4.png" src="assets/项目二day6-89300ef4.png" width="" height="" >

<img alt="项目二day6-b3d157cb.png" src="assets/项目二day6-b3d157cb.png" width="" height="" >

<img alt="项目二day6-796ea72e.png" src="assets/项目二day6-796ea72e.png" width="" height="" >

<img alt="项目二day6-3745a927.png" src="assets/项目二day6-3745a927.png" width="" height="" >

<img alt="项目二day6-3045d521.png" src="assets/项目二day6-3045d521.png" width="" height="" >

<img alt="项目二day6-d20f1ba7.png" src="assets/项目二day6-d20f1ba7.png" width="" height="" >                              

# 获取大攻略的数据
<img alt="项目二day6-3e8e8cdf.png" src="assets/项目二day6-3e8e8cdf.png" width="" height="" >

区分
请求头信息accept:期望接收到的数据类型

<img alt="项目二day6-ba958eeb.png" src="assets/项目二day6-ba958eeb.png" width="" height="" >

<img alt="项目二day6-640e925a.png" src="assets/项目二day6-640e925a.png" width="" height="" >

<img alt="项目二day6-acd4aa7a.png" src="assets/项目二day6-acd4aa7a.png" width="" height="" >

<img alt="项目二day6-e0332d93.png" src="assets/项目二day6-e0332d93.png" width="" height="" >

<img alt="项目二day6-63a1b816.png" src="assets/项目二day6-63a1b816.png" width="" height="" >

<img alt="项目二day6-a8073458.png" src="assets/项目二day6-a8073458.png" width="" height="" >

<img alt="项目二day6-11410db8.png" src="assets/项目二day6-11410db8.png" width="" height="" >

<img alt="项目二day6-8f47d0de.png" src="assets/项目二day6-8f47d0de.png" width="" height="" >

<img alt="项目二day6-f684e3de.png" src="assets/项目二day6-f684e3de.png" width="" height="" >

<img alt="项目二day6-bcc07880.png" src="assets/项目二day6-bcc07880.png" width="" height="" >
admin_>api

<img alt="项目二day6-d2253395.png" src="assets/项目二day6-d2253395.png" width="" height="" >

<img alt="项目二day6-8c4a96eb.png" src="assets/项目二day6-8c4a96eb.png" width="" height="" >

<img alt="项目二day6-5336f3c6.png" src="assets/项目二day6-5336f3c6.png" width="" height="" >

<img alt="项目二day6-17058ace.png" src="assets/项目二day6-17058ace.png" width="" height="" >

# 滚动

<img alt="项目二day6-dccd789b.png" src="assets/项目二day6-dccd789b.png" width="" height="" >

<img alt="项目二day6-ad1c244d.png" src="assets/项目二day6-ad1c244d.png" width="" height="" >

<img alt="项目二day6-adf4e684.png" src="assets/项目二day6-adf4e684.png" width="" height="" >

不要容器了

<img alt="项目二day6-af1d2732.png" src="assets/项目二day6-af1d2732.png" width="" height="" >

<img alt="项目二day6-c44840d9.png" src="assets/项目二day6-c44840d9.png" width="" height="" >

<img alt="项目二day6-fab073c2.png" src="assets/项目二day6-fab073c2.png" width="" height="" >

去除渲染,换成拼接的方式

<img alt="项目二day6-df22092e.png" src="assets/项目二day6-df22092e.png" width="" height="" >

<img alt="项目二day6-3fe4b836.png" src="assets/项目二day6-3fe4b836.png" width="" height="" >

<img alt="项目二day6-d18ef637.png" src="assets/项目二day6-d18ef637.png" width="" height="" >

<img alt="项目二day6-0eae82b5.png" src="assets/项目二day6-0eae82b5.png" width="" height="" >

<img alt="项目二day6-7daf070f.png" src="assets/项目二day6-7daf070f.png" width="" height="" >

<img alt="项目二day6-fe480341.png" src="assets/项目二day6-fe480341.png" width="" height="" >

<img alt="项目二day6-9fee5bfa.png" src="assets/项目二day6-9fee5bfa.png" width="" height="" >

<img alt="项目二day6-7751439c.png" src="assets/项目二day6-7751439c.png" width="" height="" >

<img alt="项目二day6-be4e5c4b.png" src="assets/项目二day6-be4e5c4b.png" width="" height="" >

有地区id才查询
<img alt="项目二day6-4bde551c.png" src="assets/项目二day6-4bde551c.png" width="" height="" >


<img alt="项目二day6-88217022.png" src="assets/项目二day6-88217022.png" width="" height="" >


默认就是json
<img alt="项目二day6-4d5f3cab.png" src="assets/项目二day6-4d5f3cab.png" width="" height="" >

<img alt="项目二day6-976d70e1.png" src="assets/项目二day6-976d70e1.png" width="" height="" >

<img alt="项目二day6-dece8aea.png" src="assets/项目二day6-dece8aea.png" width="" height="" >

<img alt="项目二day6-5f1b01ca.png" src="assets/项目二day6-5f1b01ca.png" width="" height="" >


# 攻略目录渲染
<img alt="项目二day6-8421b8bb.png" src="assets/项目二day6-8421b8bb.png" width="" height="" >

<img alt="项目二day6-83d5505b.png" src="assets/项目二day6-83d5505b.png" width="" height="" >

<img alt="项目二day6-cede547f.png" src="assets/项目二day6-cede547f.png" width="" height="" >

<img alt="项目二day6-b48e0705.png" src="assets/项目二day6-b48e0705.png" width="" height="" >

<img alt="项目二day6-9891f407.png" src="assets/项目二day6-9891f407.png" width="" height="" >

<img alt="项目二day6-6c6ef3a8.png" src="assets/项目二day6-6c6ef3a8.png" width="" height="" >

<img alt="项目二day6-ed1ae60a.png" src="assets/项目二day6-ed1ae60a.png" width="" height="" >

# 文章
<img alt="项目二day6-946c8878.png" src="assets/项目二day6-946c8878.png" width="" height="" >


<img alt="项目二day6-e78cd6a1.png" src="assets/项目二day6-e78cd6a1.png" width="" height="" >

<img alt="项目二day6-b090bc79.png" src="assets/项目二day6-b090bc79.png" width="" height="" >

<img alt="项目二day6-b3cdcbe3.png" src="assets/项目二day6-b3cdcbe3.png" width="" height="" >

<img alt="项目二day6-3c716eb8.png" src="assets/项目二day6-3c716eb8.png" width="" height="" >


# 小bug
<img alt="项目二day6-d8299c03.png" src="assets/项目二day6-d8299c03.png" width="" height="" >

<img alt="项目二day6-4485df4d.png" src="assets/项目二day6-4485df4d.png" width="" height="" >

# 小结
需求分析
1. admin的攻略文章回显
```
二级联动下拉框回显(先按照大攻略查询攻略目录,再回显目录)
文章内容回显,发ajax获取文章内容,通过ckeditor.setData设置
```
2. 找攻略页面
```
1.推荐栏目的[当季推荐]:查询大攻略中所欲状态为推荐的数据(不用分页,jrender实现)
2.实现导航栏的地区数据,查询地区中所有状态为推荐的数据(不分页,拼接方式实现)
3.点击地区发生ajax请求,带上地区id,获取该地区的攻略数据(html格式)
  后台需要查询两个数据:
    当季推荐的攻略数据(不分页)
    全部攻略数据(分页)
  准备ftl模板,写上相关指令
  使用freemarker工具进行渲染
  通过response响应流返回给前台
4.页面滚动分页功能(json格式)
  滚动时,判断有否地区id,有再去查询
  滚动式,默认查询第二页的数据,总页数从2开始
  回调函数中通过模板克隆的方式来拼接到选择器中
```
3. 攻略目录页面
```
1.根据大攻略id查询大攻略信息,并且渲染
2.根据大攻略id查询目录信息,查询目录的同事使用懒加载把文章也查出来,封装到目录中的文章集合
解决json转换的问题(忽略handler的属性)
```

点击事件 重置currentPage和pages
