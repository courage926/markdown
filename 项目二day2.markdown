# 后台管理项目
## 平台用户管理
```
web.xml:*.do
mvc.xml
```
```
静态资源:admin/js/... ->webapp
```
```
controller.UserController:
QueryObject:直接加keyword
public String getKeyword(){
  return StringUtils.hasLength(keyword)?keyword:null
}
```

<img alt="项目二day2-f728417f.png" src="assets/项目二day2-f728417f.png" width="" height="" >

```
views
list
```
配置admin


<img alt="项目二day2-17c4a9b5.png" src="assets/项目二day2-17c4a9b5.png" width="" height="" >
list
<img alt="项目二day2-6e0bbf9a.png" src="assets/项目二day2-6e0bbf9a.png" width="" height="" >
<img alt="项目二day2-dc38feb6.png" src="assets/项目二day2-dc38feb6.png" width="" height="" >

图片的处理
演示项目的upload拷过来
高级查询 回显

# 个人页面 profiles
放到mine里面
引入checkLogin.js
点"我的"跳转
a连接 target默认_self 改成_parent

info.html 设置个人信息
引入checkLogin


<img alt="项目二day2-b1a9a708.png" src="assets/项目二day2-b1a9a708.png" width="" height="" >
<img alt="项目二day2-fdc9e0d7.png" src="assets/项目二day2-fdc9e0d7.png" width="" height="" >
但是不这么写
用js
<img alt="项目二day2-48ea9aba.png" src="assets/项目二day2-48ea9aba.png" width="" height="" >

<img alt="项目二day2-ee04df56.png" src="assets/项目二day2-ee04df56.png" width="" height="" >

<img alt="项目二day2-49c40004.png" src="assets/项目二day2-49c40004.png" width="" height="" >

<img alt="项目二day2-2c1f143e.png" src="assets/项目二day2-2c1f143e.png" width="" height="" >

不更新密码 邮箱

<img alt="项目二day2-e890e097.png" src="assets/项目二day2-e890e097.png" width="" height="" >

避免图片丢失的问题
隐藏域
<img alt="项目二day2-1ba74e88.png" src="assets/项目二day2-1ba74e88.png" width="" height="" >

回显

<img alt="项目二day2-3ef5ccd1.png" src="assets/项目二day2-3ef5ccd1.png" width="" height="" >

提交动作
<img alt="项目二day2-d79be793.png" src="assets/项目二day2-d79be793.png" width="" height="" >

<img alt="项目二day2-e6aee376.png" src="assets/项目二day2-e6aee376.png" width="" height="" >

<img alt="项目二day2-214189aa.png" src="assets/项目二day2-214189aa.png" width="" height="" >

<img alt="项目二day2-98449ae3.png" src="assets/项目二day2-98449ae3.png" width="" height="" >

<img alt="项目二day2-b07178a3.png" src="assets/项目二day2-b07178a3.png" width="" height="" >

修改头像的按钮
绑定点击事件

<img alt="项目二day2-a11f35f7.png" src="assets/项目二day2-a11f35f7.png" width="" height="" >

隐藏表单

<img alt="项目二day2-6593f564.png" src="assets/项目二day2-6593f564.png" width="" height="" >

<img alt="项目二day2-e6a6d471.png" src="assets/项目二day2-e6a6d471.png" width="" height="" >

<img alt="项目二day2-1adc5329.png" src="assets/项目二day2-1adc5329.png" width="" height="" >

有值才提交
<img alt="项目二day2-1e3652ff.png" src="assets/项目二day2-1e3652ff.png" width="" height="" >

<img alt="项目二day2-ec526610.png" src="assets/项目二day2-ec526610.png" width="" height="" >

图片跨域问题:
<img alt="项目二day2-c5d7176d.png" src="assets/项目二day2-c5d7176d.png" width="" height="" >

util
<img alt="项目二day2-4aef9eae.png" src="assets/项目二day2-4aef9eae.png" width="" height="" >

上传控制器
<img alt="项目二day2-fdecf84d.png" src="assets/项目二day2-fdecf84d.png" width="" height="" >

回显
<img alt="项目二day2-e5686f8b.png" src="assets/项目二day2-e5686f8b.png" width="" height="" >

<img alt="项目二day2-8eae6426.png" src="assets/项目二day2-8eae6426.png" width="" height="" >

<img alt="项目二day2-54c34464.png" src="assets/项目二day2-54c34464.png" width="" height="" >

<img alt="项目二day2-5d9a199a.png" src="assets/项目二day2-5d9a199a.png" width="" height="" >

<img alt="项目二day2-1fe5fd73.png" src="assets/项目二day2-1fe5fd73.png" width="" height="" >

把email设置到对象 当中,避免丢失
<img alt="项目二day2-9ab9272d.png" src="assets/项目二day2-9ab9272d.png" width="" height="" >

修改背景
点击事件


<img alt="项目二day2-1212c6d5.png" src="assets/项目二day2-1212c6d5.png" width="" height="" >

<img alt="项目二day2-9bff976e.png" src="assets/项目二day2-9bff976e.png" width="" height="" >

<img alt="项目二day2-b2f675c6.png" src="assets/项目二day2-b2f675c6.png" width="" height="" >

接口安全问题
<img alt="项目二day2-dc9c037e.png" src="assets/项目二day2-dc9c037e.png" width="" height="" >

<img alt="项目二day2-bcde8b30.png" src="assets/项目二day2-bcde8b30.png" width="" height="" >

<img alt="项目二day2-99757047.png" src="assets/项目二day2-99757047.png" width="" height="" >

<img alt="项目二day2-b4489b20.png" src="assets/项目二day2-b4489b20.png" width="" height="" >

<img alt="项目二day2-b746b71b.png" src="assets/项目二day2-b746b71b.png" width="" height="" >

mvc配置登陆拦截器

<img alt="项目二day2-914e565a.png" src="assets/项目二day2-914e565a.png" width="" height="" >

<img alt="项目二day2-87339d71.png" src="assets/项目二day2-87339d71.png" width="" height="" >

admin地区信息
生成Region//目的地
parent->Region对象
state状态 常量

<img alt="项目二day2-4fd60ee8.png" src="assets/项目二day2-4fd60ee8.png" width="" height="" >

根地区

treeview

栅格

样式
<img alt="项目二day2-89b4c6f8.png" src="assets/项目二day2-89b4c6f8.png" width="" height="" >

<img alt="项目二day2-0be73e5d.png" src="assets/项目二day2-0be73e5d.png" width="" height="" >

<img alt="项目二day2-e023afc0.png" src="assets/项目二day2-e023afc0.png" width="" height="" >

<img alt="项目二day2-8f34dcdb.png" src="assets/项目二day2-8f34dcdb.png" width="" height="" >

<img alt="项目二day2-76518c2f.png" src="assets/项目二day2-76518c2f.png" width="" height="" >

<img alt="项目二day2-d9981e12.png" src="assets/项目二day2-d9981e12.png" width="" height="" >

<img alt="项目二day2-f89f7701.png" src="assets/项目二day2-f89f7701.png" width="" height="" >

 '+' 号
 <img alt="项目二day2-4aa69297.png" src="assets/项目二day2-4aa69297.png" width="" height="" >

 <img alt="项目二day2-96893464.png" src="assets/项目二day2-96893464.png" width="" height="" >

 sql中有条件判断就要加注解

 <img alt="项目二day2-dbb5c0f5.png" src="assets/项目二day2-dbb5c0f5.png" width="" height="" >

# 小結
需求分析:
1. admin:注册用户的列表 (关键字查询,分页)
```
创建表格user
User:定义性别默认值,写getGenderName方法
mapper:加上高级查询方法,sql
UserService:高级查询方法
UserController:list方法
admin/user/list.ftl getGenderName/空值处理
```
2. app 我的功能页面/mine/profiles.html
```
简单渲染
target="_parent"
$(".info").renderValues(user);

```
3. 编辑个人资料
背景要通过css方法回显
表单隐藏域:id,_ method,headImgUrl,coverImgUrl
```
email不更新,不用带到后台,直接在前台通过js替换SessionStorage中"user"
其他属性要通过隐藏域传递(尤其是_method)
```

图片上传:
js:隐藏表单,包括文件框,点击按钮触发文件框的点击动作
利用文件框的值改变事件提交表单
在表单的回调函数,需要将url回显到img和表单的隐藏域
利用一个变量标记flag是修改头像还是背景


后台:使用aliyun的图片服务器,直接用提供的文件上传工具
最后需要根据规定的结果返回map(status 0/1 ,url,msg)

更新用户信息时,sql需要去掉email和password

更新成功后把对user对象重新设置到sessionStroage

4. 接口安全处理
自定义注解,利用拦截器,判断执行的方法是否 需要检查session
写完要在mvc配置
如果需要并没有session就返回401状态码
更新用户信息,需要判断是否为当前用户

5. admin的地区管理页面
利用treeview插件
进入页面先查询所有根地区
利用懒加载来查询子地区的数据
插件必须根据规定的格式返回数据
需要在controller处理好再返回(text.tags.id)

懒加载:
1. 在节点属性添加lazyLoad为true(controller返回的map中)(才会出现+号)
2. 点击加号后会自动调用lazyLoad的函数,该函数在list.ftl中的treeview里面声明(全局属性)
通过以下方法可以把子节点添加到父节点上
treeview('addNode',子节点,父节点)
