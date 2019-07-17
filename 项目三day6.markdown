
# 点赞样式css
<img alt="项目三day6-c5a6dfcd.png" src="assets/项目三day6-c5a6dfcd.png" width="" height="" >

# 游记评论设计:domain分析
- refComment

# travel/detail
tcs注释解开

<img alt="项目三day6-4aa6a38a.png" src="assets/项目三day6-4aa6a38a.png" width="" height="" >

<img alt="项目三day6-d744d3ae.png" src="assets/项目三day6-d744d3ae.png" width="" height="" >

<img alt="项目三day6-d29d5569.png" src="assets/项目三day6-d29d5569.png" width="" height="" >

<img alt="项目三day6-230d0a0f.png" src="assets/项目三day6-230d0a0f.png" width="" height="" >

<img alt="项目三day6-505c5138.png" src="assets/项目三day6-505c5138.png" width="" height="" >

# 发表回复后刷新页面

<img alt="项目三day6-dd8601f8.png" src="assets/项目三day6-dd8601f8.png" width="" height="" >

<img alt="项目三day6-689cfa3c.png" src="assets/项目三day6-689cfa3c.png" width="" height="" >

# 服务间传递的对象不是同一个
<img alt="项目三day6-44275954.png" src="assets/项目三day6-44275954.png" width="" height="" >

# 数据统计
- 临时缓存
- 无需实时
- 最终一致

<img alt="项目三day6-ac6accd4.png" src="assets/项目三day6-ac6accd4.png" width="" height="" >

# 数据封装
<img alt="项目三day6-18e71a7e.png" src="assets/项目三day6-18e71a7e.png" width="" height="" >

# 代码实现
- vo value-object

# 攻略数据统计对象在redis前缀
- StrategyStatisKeyPrefix
- 不需要设置过期时间,后期会使用定时器定时同步缓存中的数据 到数据库中
- 时间 -1
<img alt="项目三day6-29812810.png" src="assets/项目三day6-29812810.png" width="" height="" >

# 攻略统计数据的服务
- strateStatisService
- @service

# 阅读量统计

## strategy/detail
```
//统计阅读量,+1
key=前缀+id
viewIncrease(key)
```
```
//判断vo是否存在对象key值
//存在,获取vo,viewnum+1
//不存在:创建vo,viewnum+1 在添加到redis中
//统一setvo
```
# 去找下BeanUtil 同名匹配原则
<img alt="项目三day6-bfd9d83f.png" src="assets/项目三day6-bfd9d83f.png" width="" height="" >

<img alt="项目三day6-8e8f36d9.png" src="assets/项目三day6-8e8f36d9.png" width="" height="" >

<img alt="项目三day6-d34fafab.png" src="assets/项目三day6-d34fafab.png" width="" height="" >

<img alt="项目三day6-e0059f7c.png" src="assets/项目三day6-e0059f7c.png" width="" height="" >

<img alt="项目三day6-6c369fb6.png" src="assets/项目三day6-6c369fb6.png" width="" height="" >

-------------------

# 攻略收藏数&点赞数

<img alt="项目三day6-1a803bb3.png" src="assets/项目三day6-1a803bb3.png" width="" height="" >

<img alt="项目三day6-bf0b6194.png" src="assets/项目三day6-bf0b6194.png" width="" height="" >

# 前缀
<img alt="项目三day6-f2ba35da.png" src="assets/项目三day6-f2ba35da.png" width="" height="" >



```
//判断收藏key值是否存在
//不存在:添加收藏key,vo中favornum +1
//存在:
//1.获取收藏key值对应的value值,判断value值是否包含uid
//如果包含(取消收藏):value值删除uid,vo中favornum减一
//不包含(要收藏):value添加uid vo中favornum+1
//统一保存vo和收藏的value值
```

<img alt="项目三day6-6a065d28.png" src="assets/项目三day6-6a065d28.png" width="" height="" >

<img alt="项目三day6-488c86ed.png" src="assets/项目三day6-488c86ed.png" width="" height="" >

<img alt="项目三day6-d836f6b3.png" src="assets/项目三day6-d836f6b3.png" width="" height="" >

# 小瑕疵
原来是return null的,现在先初始化一次,防止空指针
<img alt="项目三day6-2b0121cf.png" src="assets/项目三day6-2b0121cf.png" width="" height="" >

# AjaxResult code
- 返回参数码
- <img alt="项目三day6-24ac1ece.png" src="assets/项目三day6-24ac1ece.png" width="" height="" >
- <img alt="项目三day6-e8ffcf1d.png" src="assets/项目三day6-e8ffcf1d.png" width="" height="" >

<img alt="项目三day6-7c8eb8eb.png" src="assets/项目三day6-7c8eb8eb.png" width="" height="" >

<img alt="项目三day6-6bf2b3a3.png" src="assets/项目三day6-6bf2b3a3.png" width="" height="" >

# 删除和迭代的额外方法
- 因为没有泛型,导致list remove contains 都没办法使用
<img alt="项目三day6-cc0669a4.png" src="assets/项目三day6-cc0669a4.png" width="" height="" >

# 统一转成字符串就可以了
<img alt="项目三day6-70d91547.png" src="assets/项目三day6-70d91547.png" width="" height="" >
# String.equal的源码:先比较地址,如果不一致,比较值
<img alt="项目三day6-f4737bc4.png" src="assets/项目三day6-f4737bc4.png" width="" height="" >

# 多样化key值
<img alt="项目三day6-b8d6ae57.png" src="assets/项目三day6-b8d6ae57.png" width="" height="" >

<img alt="项目三day6-3d457515.png" src="assets/项目三day6-3d457515.png" width="" height="" >

<img alt="项目三day6-c77ddd7b.png" src="assets/项目三day6-c77ddd7b.png" width="" height="" >

# 顶
<img alt="项目三day6-79954e40.png" src="assets/项目三day6-79954e40.png" width="" height="" >

<img alt="项目三day6-7682218d.png" src="assets/项目三day6-7682218d.png" width="" height="" >

# redis数据初始化监听器
```
当spring容器启动后,马上执行的方法
```
<img alt="项目三day6-81aba675.png" src="assets/项目三day6-81aba675.png" width="" height="" >

将mysql中的数据同步到redis缓存中


<img alt="项目三day6-82f88244.png" src="assets/项目三day6-82f88244.png" width="" height="" >

<img alt="项目三day6-38fb0743.png" src="assets/项目三day6-38fb0743.png" width="" height="" >

# 数据落地
## spring定时器
周期性执行某个操作

<img alt="项目三day6-6772fb42.png" src="assets/项目三day6-6772fb42.png" width="" height="" >

<img alt="项目三day6-e2438768.png" src="assets/项目三day6-e2438768.png" width="" height="" >

<img alt="项目三day6-fb31c246.png" src="assets/项目三day6-fb31c246.png" width="" height="" >

<img alt="项目三day6-8f9a01ab.png" src="assets/项目三day6-8f9a01ab.png" width="" height="" >

<img alt="项目三day6-936bfa98.png" src="assets/项目三day6-936bfa98.png" width="" height="" >

<img alt="项目三day6-a4b2803c.png" src="assets/项目三day6-a4b2803c.png" width="" height="" >


<img alt="项目三day6-111eeb28.png" src="assets/项目三day6-111eeb28.png" width="" height="" >

<img alt="项目三day6-2687aa86.png" src="assets/项目三day6-2687aa86.png" width="" height="" >



<img alt="项目三day6-76cceca4.png" src="assets/项目三day6-76cceca4.png" width="" height="" >

<img alt="项目三day6-9fd9865f.png" src="assets/项目三day6-9fd9865f.png" width="" height="" >
