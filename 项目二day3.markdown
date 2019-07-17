<img alt="项目二day3-4509b278.png" src="assets/项目二day3-4509b278.png" width="" height="" >  

返回treeview需要的数据

返回table需要的数据

可以分开写,也可以合并到一个方法,通过加参数来匹配  
<img alt="项目二day3-4a2c58f2.png" src="assets/项目二day3-4a2c58f2.png" width="" height="" >

<img alt="项目二day3-7cdafb11.png" src="assets/项目二day3-7cdafb11.png" width="" height="" >

<img alt="项目二day3-b44a004e.png" src="assets/项目二day3-b44a004e.png" width="" height="" >

<img alt="项目二day3-28ab2272.png" src="assets/项目二day3-28ab2272.png" width="" height="" >

节点被选中事件  
<img alt="项目二day3-69017aa4.png" src="assets/项目二day3-69017aa4.png" width="" height="" >

<img alt="项目二day3-65dbc65e.png" src="assets/项目二day3-65dbc65e.png" width="" height="" >


<img alt="项目二day3-4c0e232a.png" src="assets/项目二day3-4c0e232a.png" width="" height="" >


<img alt="项目二day3-9e25bfb6.png" src="assets/项目二day3-9e25bfb6.png" width="" height="" >

<img alt="项目二day3-b4fec784.png" src="assets/项目二day3-b4fec784.png" width="" height="" >
table包起來 並設置隱藏

<img alt="项目二day3-4bb01c76.png" src="assets/项目二day3-4bb01c76.png" width="" height="" >


克隆的是tr 不是table

<img alt="项目二day3-80b4bcd6.png" src="assets/项目二day3-80b4bcd6.png" width="" height="" >

克隆模板
设置true 事件也克隆

另一个table
<img alt="项目二day3-0dca8e49.png" src="assets/项目二day3-0dca8e49.png" width="" height="" >

<img alt="项目二day3-3ec3e9fd.png" src="assets/项目二day3-3ec3e9fd.png" width="" height="" >

<img alt="项目二day3-6e5f05d6.png" src="assets/项目二day3-6e5f05d6.png" width="" height="" >

清空
<img alt="项目二day3-344eb3a4.png" src="assets/项目二day3-344eb3a4.png" width="" height="" >

<img alt="项目二day3-9ec28644.png" src="assets/项目二day3-9ec28644.png" width="" height="" >

<img alt="项目二day3-ee908bb9.png" src="assets/项目二day3-ee908bb9.png" width="" height="" >

sql

<img alt="项目二day3-f89d4132.png" src="assets/项目二day3-f89d4132.png" width="" height="" >

<img alt="项目二day3-2f2aa456.png" src="assets/项目二day3-2f2aa456.png" width="" height="" >

<img alt="项目二day3-5d2df97b.png" src="assets/项目二day3-5d2df97b.png" width="" height="" >

<img alt="项目二day3-898887a4.png" src="assets/项目二day3-898887a4.png" width="" height="" >

不更新状态
sql要改


<img alt="项目二day3-6cdaf833.png" src="assets/项目二day3-6cdaf833.png" width="" height="" >

<img alt="项目二day3-3e39c1a8.png" src="assets/项目二day3-3e39c1a8.png" width="" height="" >

添加

<img alt="项目二day3-afb9d8b7.png" src="assets/项目二day3-afb9d8b7.png" width="" height="" >

<img alt="项目二day3-cf34cbf6.png" src="assets/项目二day3-cf34cbf6.png" width="" height="" >

<img alt="项目二day3-e587486a.png" src="assets/项目二day3-e587486a.png" width="" height="" >


<img alt="项目二day3-304b61a7.png" src="assets/项目二day3-304b61a7.png" width="" height="" >

<img alt="项目二day3-7a7866c0.png" src="assets/项目二day3-7a7866c0.png" width="" height="" >

<img alt="项目二day3-fd94ac72.png" src="assets/项目二day3-fd94ac72.png" width="" height="" >

推荐按钮


<img alt="项目二day3-84d2e34a.png" src="assets/项目二day3-84d2e34a.png" width="" height="" >

<img alt="项目二day3-3f353714.png" src="assets/项目二day3-3f353714.png" width="" height="" >

<img alt="项目二day3-cbdc3f1e.png" src="assets/项目二day3-cbdc3f1e.png" width="" height="" >

<img alt="项目二day3-7cb48358.png" src="assets/项目二day3-7cb48358.png" width="" height="" >

<img alt="项目二day3-f0dfadc6.png" src="assets/项目二day3-f0dfadc6.png" width="" height="" >

<img alt="项目二day3-b998c418.png" src="assets/项目二day3-b998c418.png" width="" height="" >

<img alt="项目二day3-52498f1c.png" src="assets/项目二day3-52498f1c.png" width="" height="" >

travel
travelContent

公用一个service
引入两个mapper
主键关联

<img alt="项目二day3-7b872bf0.png" src="assets/项目二day3-7b872bf0.png" width="" height="" >

<img alt="项目二day3-7dd4e056.png" src="assets/项目二day3-7dd4e056.png" width="" height="" >

<img alt="项目二day3-6b852bf8.png" src="assets/项目二day3-6b852bf8.png" width="" height="" >

<img alt="项目二day3-40eefd13.png" src="assets/项目二day3-40eefd13.png" width="" height="" >

travelcontent id 取消主键自增长
作为普通参数传入

<img alt="项目二day3-c5ce373f.png" src="assets/项目二day3-c5ce373f.png" width="" height="" >

<img alt="项目二day3-2a3538f7.png" src="assets/项目二day3-2a3538f7.png" width="" height="" >

获取用户的游记信息
1.资源路径 /user{id}/travels
2.请求动作 get
3.请求参数 无
4.返回结果 PageInfo
```
UserController

TravelQuery
```
<img alt="项目二day3-5bf16614.png" src="assets/项目二day3-5bf16614.png" width="" height="" >

<img alt="项目二day3-b10c0203.png" src="assets/项目二day3-b10c0203.png" width="" height="" >

<img alt="项目二day3-cda931ec.png" src="assets/项目二day3-cda931ec.png" width="" height="" >

<img alt="项目二day3-967967e1.png" src="assets/项目二day3-967967e1.png" width="" height="" >

<img alt="项目二day3-93f0a497.png" src="assets/项目二day3-93f0a497.png" width="" height="" >



<img alt="项目二day3-300c832e.png" src="assets/项目二day3-300c832e.png" width="" height="" >

<img alt="项目二day3-e9b55da2.png" src="assets/项目二day3-e9b55da2.png" width="" height="" >

<img alt="项目二day3-61be5e4a.png" src="assets/项目二day3-61be5e4a.png" width="" height="" >

<img alt="项目二day3-db60b310.png" src="assets/项目二day3-db60b310.png" width="" height="" >

<img alt="项目二day3-c40ad351.png" src="assets/项目二day3-c40ad351.png" width="" height="" >

<img alt="项目二day3-c4cc5a11.png" src="assets/项目二day3-c4cc5a11.png" width="" height="" >

<img alt="项目二day3-40154076.png" src="assets/项目二day3-40154076.png" width="" height="" >

<img alt="项目二day3-88655075.png" src="assets/项目二day3-88655075.png" width="" height="" >

<img alt="项目二day3-51bf98cf.png" src="assets/项目二day3-51bf98cf.png" width="" height="" >

<img alt="项目二day3-ed61a8f6.png" src="assets/项目二day3-ed61a8f6.png" width="" height="" >

<img alt="项目二day3-ce19c2c7.png" src="assets/项目二day3-ce19c2c7.png" width="" height="" >

<img alt="项目二day3-958d2015.png" src="assets/项目二day3-958d2015.png" width="" height="" >

<img alt="项目二day3-dc4ddc81.png" src="assets/项目二day3-dc4ddc81.png" width="" height="" >
已经滚动到底部了

<img alt="项目二day3-815077fa.png" src="assets/项目二day3-815077fa.png" width="" height="" >

<img alt="项目二day3-6e89a76e.png" src="assets/项目二day3-6e89a76e.png" width="" height="" >

<img alt="项目二day3-9ce3cf38.png" src="assets/项目二day3-9ce3cf38.png" width="" height="" >

判断是否超过总页数

存储游记数据

<img alt="项目二day3-ae5dcf4f.png" src="assets/项目二day3-ae5dcf4f.png" width="" height="" >

<img alt="项目二day3-9eeba6f0.png" src="assets/项目二day3-9eeba6f0.png" width="" height="" >

<img alt="项目二day3-b7e2d4a7.png" src="assets/项目二day3-b7e2d4a7.png" width="" height="" >

<img alt="项目二day3-43067c30.png" src="assets/项目二day3-43067c30.png" width="" height="" >

不能禁用缓存
不然会跳回去

<img alt="项目二day3-45c68c93.png" src="assets/项目二day3-45c68c93.png" width="" height="" >

<img alt="项目二day3-b88360f2.png" src="assets/项目二day3-b88360f2.png" width="" height="" >

<img alt="项目二day3-174d639a.png" src="assets/项目二day3-174d639a.png" width="" height="" >


<img alt="项目二day3-8925278c.png" src="assets/项目二day3-8925278c.png" width="" height="" >

# 需求整理出来,思考

1.admin旅游地区管理页面
动态显示table的数据

使用克隆模板的方式来显示内容,按钮是根据地区的状态来显示的


编辑地区


新增地区:把treeview选中的数据,回显到模态框中的上级地区
利用getSelected

设置推荐/取消推荐:通过异步请求修改状态

2.我的游记页面
/mine/travels.html
默认查询第一页的数据
根据滚动事件判断是否已经滚动到底部
如果已经滚到底部,需要判断当前页是否超过总页数
如果不是就继续查询

每次查询数据,就把pageinfo里面的list存放到容器中,jrender渲染数据时,使用容器来渲染
(先封装成带list属性 的对象) render-loop="list"
利用flag标记,解决重复发送的问题



<img alt="项目二day3-ed63c563.png" src="assets/项目二day3-ed63c563.png" width="" height="" >
用户头像 签名 背景 邮箱 游记

先在页面定义假的id
<img alt="项目二day3-934ef71d.png" src="assets/项目二day3-934ef71d.png" width="" height="" >
