# maven
## 问题:
1.项目构建重复
2.项目依赖大量的第三方包

## 安装Maven
1.JDK:JAVA_HOME,PATH环境变量
2.Maven MAVEN_HOME,PATH 环境变量
3.验证 cmd mvn -v 查看版本

## Maven 目录结构
conf:里面的setting.xml 全局配置文件(重要)
## 仓库
```
本地仓库
默认位置在 ${user.home}/.m2/repository
将 Maven 根目录的 conf/settings.xml 拷贝到 .m2 中，作为个人 Maven 配置文件；
在 settings.xml 文件中 <localRepository> 修改本地仓库的位置。
中央仓库
在 setting.xml 中配置国内的阿里镜像：
<mirror>  
        <id>alimaven</id>  
        <name>aliyun maven</name>  
        <url>http://maven.aliyun.com/nexus/content/groups/public/</url>  
        <mirrorOf>central</mirrorOf>
</mirror>  
或者(私服)
在 setting.xml 中配置 Maven 私服镜像：
<mirror>  
        <id>localmaven</id>  
       <name>local maven</name>  
       <url>http://私服主机的IP:端口/repository/maven-public/</url>
       <mirrorOf>central</mirrorOf>  
</mirror>

```

## Maven 项目格式
```
src/main/java —— 存放项目的.java文件
src/main/resources —— 存放项目资源文件，如spring、struts2配置文件，db.properties
src/main/webapp —— 存放jsp，css，image等文件
src/test/java —— 存放所有测试.java文件，如JUnit测试类
src/test/resources —— 测试资源文件
pom.xml——主要要写的maven配置文件
target —— 项目由maven自动输出位置

```
## 基本命令
```
mvn compile   编译
mvn clean     清除字节码文件
mvn test      测试
mvn package   打包到target
mvn install   发送到repository
```

## eclipse 中 maven中的配置
```
windows-perference-maven-installtions 配置安装的maven
maven-User Settings 配置用户配置(setting.xml的位置-->本地仓的位置)
maven 除了offline,javaDoc,hide folders其他都勾上
```

## Maven项目

### JavaSe项目
```
骨架:的 maven-archetype-quickstart
Group Id:公司域名倒写
Artifact Id:项目名或者模块名
Version:版本号
Package包名
需要自己手动添加资源目录scr/main/resources

依赖:
禁用全局仓库索引:Disable index Details
重建本地仓库索引:Rebuild Index
在pom.xml中 右键选择Maven-add dependency添加依赖
搜索栏选中搜索结果,自动填充坐标
另一种方法
在mvnrepository.com这里找
点击对应的版本,拷贝依赖
依赖的传递性:
optional 可选项
exclusion 排除

Maven 命令
项目-右键-Debug
Maven clean 清除
Maven build - Goals填入package - Debug -->生成文件到target
```

### JaveWeb项目
```
选择的骨架是 org.apache.maven.archetypes 的 maven-archetype-webapp。
使用的容器基本都是 3.0+ 以上的，而使用骨架生成出来 web.xml 还是 2.3，所以修改文件约束头：

<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns="http://java.sun.com/xml/ns/javaee"
	xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
	version="3.0">




打包方式:WAR
pom.xml中
plugins
<!-- 配置编译器插件 -->
<!-- 配置启动Tomcat7的插件 -->
配置tomcat

作用域scope
compile 默认 编译,测试,运行都有效
provided 编译时有效,打包时不需要,容器来提供
test 测试时有效
runtime 运行时有效,例子:jdbc的驱动包

启动项目:
Maven build - Goals填入 tomcat7:run -- Debug
```

### 概念
```
坐标:
groupId:项目名,公司域名倒写
artifactId:模块名
version:版本号

依赖:包含作用域scope和坐标...

仓库:
本地仓库
中央仓库

仓库镜像

在 settings.xml 中配置：
<mirror>
            <id>alimaven</id>
            <name>aliyun maven</name>
            <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
            <mirrorOf>central</mirrorOf>
 </mirror>

```

# UML
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
