# Maven
## Maven 安装

<img alt="maven-fe7d7fa2.png" src="assets/maven-fe7d7fa2.png" width="" height="" >

<img alt="maven-3ed1d01c.png" src="assets/maven-3ed1d01c.png" width="" height="" >

pom.xml写maven的配置文件  
404 去target找文件是否编译成功

<img alt="maven-967eca67.png" src="assets/maven-967eca67.png" width="" height="" >

<img alt="maven-a6927849.png" src="assets/maven-a6927849.png" width="" height="" >

<img alt="maven-d57b74c8.png" src="assets/maven-d57b74c8.png" width="" height="" >

<img alt="maven-22243c57.png" src="assets/maven-22243c57.png" width="" height="" >

<img alt="maven-98a620cb.png" src="assets/maven-98a620cb.png" width="" height="" >

<img alt="maven-6bcde0cb.png" src="assets/maven-6bcde0cb.png" width="" height="" >


## maven 的概念
### 坐标
```
坐标构成:
域名倒写
项目名
版本号(version)

文件名生成规则:
域名倒写
项目名
版本号(version)
打包方式(jar/war/pom)

依赖:
坐标
作用域:
compile 默认 编译,测试,运行都有效
provided 编译时有效,打包时不需要,容器来提供
test 测试时有效
runtime 运行时有效,例子:jdbc的驱动包

依赖的传递性
optional 可选项
exclusion 排除****


仓库
本地仓
中央仓库
```

crm

## UML
模型:对现实的简化
图形化语言
模型化 可视化
伴随着整个软件开发的生命周期
UML可以协助我们分析和设计复杂的系统,协助软件开发人员进行思考和记录思路的结果

面向对象的可视化建模语言
类与类的关系

## 软件开发模式
### 瀑布模式
可行性分析
需求分析
...

不适应用户需求的变化
软件开发唯一不变的:需求一直再变

### 螺旋迭代
计划制定
风险分析
开发
客户评估

不断沟通

### 快速模型

### UML图
部署图
活动流程图 :开始-结束
泛化关系:继承/实现关系
领域模型图:一对一;一对多;多对多
时序图
用例图
状态图

perference Maven的配置三个地方 setting.xml 库的地址 install关联
