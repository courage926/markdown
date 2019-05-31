# Spring概述
## 丑陋的代码
```
代码耦合度较高(不符合开闭原则)
控制事务繁琐(可以用模板方法的设计模式消除)
第三方框架运用麻烦
```
## Spring帝国
```
Spring 是一个轻量级的DI/IoC 和AOP容器的开源框架,致力于构建轻量级的JaveEE应用
容器Container:装对象的对象(需要管理对象的生命周期)
Tomcat就是Servlet和jsp的容器

Ioc/DI 低侵入/低耦合地创建并组装对象之间的依赖关系
AOP    面熊切面编程,无耦合地实现日志记录,性能统计,安全控制等

```
<img alt="Spring-236c6be6.png" src="assets/Spring-236c6be6.png" width="" height="" >

## 帝国第一战
```
Ioc和DI思想
IoC:Inversion of Control 反转控制
将原本在程序中手动创建对象的控制权,交由Spring框架的IoC容器来管理
DI:Dependency Injection(依赖注入):
将对象依赖属性(常量,对象,集合)通过配置设值给对象

被注入对象(Service对象)依赖IoC容器来配置依赖对象(DAO对象)
BeanFactory:Spring IoC容器:生产bean对象的工厂,负责配置,创建和管理bean
元数据配置:基于xml/annotation/java代码
```
### Spring IoC 原理:
```
1.通过Resource对象加载配置文件
2.解析配置文件,得到指定名称的bean
3.解析bean元素,id作为bean名字,class用于反射得到bean的实例
4.调用getBean方法的时候,从容器中返回对象实例
```
### Spring基本配置
```
bean元素中id和name
<import resource=""/>元素
```
### Spring测试框架
```
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class App {
	@Autowired
	private EmployeeMapper employeeMapper;

	@Test
	public void testSelectById() throws Exception {
		Employee e1 = employeeMapper.selectById(2L);
		System.out.println(e1);
	}
}
```

# Spring IoC/DI(重点)
## IoC核心(基于xml)
```
Ioc容器

Bean实例化:
1.构造器实例化
2.静态工厂实例化(不用)
3.实例工厂实例化(不用)
4.实现FactoryBean接口实例化(实例工厂的变种)

Bean 作用域
scope:
singleton:单例 默认
prototype:多例 每次从容器调用Bean 都返回一个新的

Bean初始化和销毁(生命周期)
init-method=""
destory-method=""

```
### Bean 实例化过程

## DI核心(基于xml)
```
注入:
setter方法(重点)
构造器注入(不常用)

注入值类型:
常量 value(重点)
对象 ref="被注入对象的bean的id"(重点)
集合 对应集合类型元素(Properties集合类型)

```
## 属性占位符
```
配置连接池
Property Place Holder
```
<img alt="Spring-c6c3c055.png" src="assets/Spring-c6c3c055.png" width="" height="" >
<img alt="Spring-4f1b3d03.png" src="assets/Spring-4f1b3d03.png" width="" height="" >
<img alt="Spring-549d4725.png" src="assets/Spring-549d4725.png" width="" height="" >
<img alt="Spring-13b72003.png" src="assets/Spring-13b72003.png" width="" height="" >
<img alt="Spring-9f96b7d2.png" src="assets/Spring-9f96b7d2.png" width="" height="" >
<img alt="Spring-0ee9c147.png" src="assets/Spring-0ee9c147.png" width="" height="" >


<img alt="Spring-36ffcd5f.png" src="assets/Spring-36ffcd5f.png" width="" height="" >
<img alt="Spring-c5866c73.png" src="assets/Spring-c5866c73.png" width="" height="" >

# Spring AOP
## 案例分析
### 增强
```
增强:Advice:原方法的基础上,通过插入一段代码从而增强原方法的功能
环绕增强=前置增强+后置增强+异常增强+最终增强

```
## 静态代理
```
代理模式:为其他对象提供一种代理以控制对这个对象的访问
特点:
1.代理对象完全包含真实对象
2.责任分离

静态代理:在运行程序前就已经存在代理类的字节码文件
代理对象和真实对象的关系在运行之前就确定了
优点:
缺点:
```

## 动态代理
```
动态代理:jvm通过反射动态生成的,不存在代理类的字节码文件,
代理对象和真实对象的关系是在运行时期才确定的

实现:
有接口:JDK动态代理
无接口:CGLIB火javassist组件

<img alt="Spring-cbda9524.png" src="assets/Spring-cbda9524.png" width="" height="" >


字节码的动态加载:
遵循java编译系统组织.class文件的格式和结构,生成相应的二进制数据,然后把这个二进制数据加载转换成对应的类

jdk动态代理:
原理:基于实现接口

CGLIB动态代理
原理:基于继承真实目标类
```

<img alt="Spring-d1edd53f.png" src="assets/Spring-d1edd53f.png" width="" height="" >

<img alt="Spring-9b514564.png" src="assets/Spring-9b514564.png" width="" height="" >

<img alt="Spring-7298a346.png" src="assets/Spring-7298a346.png" width="" height="" >

<img alt="Spring-8ff9de16.png" src="assets/Spring-8ff9de16.png" width="" height="" >

## 代理总结
```
JDK:
1.JAVA动态代理是使用java.lang.reflect包中的Proxy类与InvocationHandler接口来完成
2.要是使用JDK动态代理,委托必须要定义接口
3.JDK动态代理会拦截所有的public的方法
4.动态代理的最小单位是类,如果想拦截一部分方法,可以在invoke方法中对要执行的方法名进行判断

CGLIB:
1.CGLIB可以生成委托类的子类,并重写父类非final修饰的方法
2.要求类不能是final的,要拦截的方法是要非final,非static,非private的
3.动态代理的最小单位是类(所有类中的方法都会被处理)

```
## AOP思想
```
OOP:面向对象编程

AOP:面向切面编程思想
横切面关注点

把多个业务方法需要调用的代码封装到不同的模块中去(责任分离)
动态代理机制来动态的增强业务功能,
从而达到代码的复用,提高维护性

Joinpoint:when:连接点
pointcut:where:切入点
Advice:what:增强
Aspect:切面 when where what

Target:目标对象
Weaving:织入
Proxy:产生的代理对象

Pointcot 语法
```

## AOP开发
## 增强细节
<img alt="Spring-7593f5cc.png" src="assets/Spring-7593f5cc.png" width="" height="" >

<img alt="Spring-1a23d129.png" src="assets/Spring-1a23d129.png" width="" height="" >

# Spring持久层技术(了解)
## Spring对持久层技术支持
```
原因:
技术:
```
## Spring JDBC
```
JDBC模板类
JdbcDaoSupport类
jdbc操作:DML,DQL
```

# Spring 事务管理
## 引出事务
```
1.事务都应该开启在业务层
事务:把多个不可分割的操作看做一个整体.
转账业务功能:
	转出
	转入
2.为什么故意出异常
	模拟出错,演示回滚
```
## 事务回顾

## Spring 事务管理
```
platformTransactionManager:事务创建
选择事务管理器:DataSourceTransactionManager:支持JDBC Mybatis;
TransactionDefinition			:事务属性
事务隔离级别:ISOLATION_READ_COMMITTED(提交读)


传播规则(propagation):在一个事务中调用其他事务方法,此时事务该如何传播,
按照什么规则传播,用谁的事务,还是都不用等等
1.遵循当前事务			REQUIRED(缺省)/SUPPORTS/MANDATORY
2.不遵循当前事务			REQUIRES_NEW/NOT_SUPPORTRD/NEVER
3.寄生事务					NESTED(savePoint)

TransactionStatus					:事务状态
是否新开启事务
是否已经提交事务
Rollback-only?
```
## 事务配置

## Spring 注解开发
## DI注解
```
Autowired注解和Resource注解
Value注解
```
## IoC注解
```
不同组件的注解
作用域的注解
初始化和销毁的注解
```
## AOP注解
```
Aspect
Pointcut
Before
After
AfterThroing
AfterReturing
Around
```
## Tx 注解
```
Transactional注解


```
<img alt="Spring-8c1c8079.png" src="assets/Spring-8c1c8079.png" width="" height="" >
<img alt="Spring-9931c540.png" src="assets/Spring-9931c540.png" width="" height="" >
<img alt="Spring-985904ad.png" src="assets/Spring-985904ad.png" width="" height="" >
<img alt="Spring-7b728712.png" src="assets/Spring-7b728712.png" width="" height="" >
<img alt="Spring-7630e289.png" src="assets/Spring-7630e289.png" width="" height="" >
钩子方法
全栈式框架
WebSocket
<img alt="Spring-7a9079f5.png" src="assets/Spring-7a9079f5.png" width="" height="" >

<img alt="Spring-28757fc0.png" src="assets/Spring-28757fc0.png" width="" height="" >

<img alt="Spring-9d689403.png" src="assets/Spring-9d689403.png" width="" height="" >

<img alt="Spring-70bff70f.png" src="assets/Spring-70bff70f.png" width="" height="" >

<img alt="Spring-87a9814e.png" src="assets/Spring-87a9814e.png" width="" height="" >

<img alt="Spring-9ec47155.png" src="assets/Spring-9ec47155.png" width="" height="" >



# SpringMVC
```

```
<img alt="Spring-cb0cbc60.png" src="assets/Spring-cb0cbc60.png" width="" height="" >
<img alt="Spring-fd2fcf5a.png" src="assets/Spring-fd2fcf5a.png" width="" height="" >
<img alt="Spring-a19af0ef.png" src="assets/Spring-a19af0ef.png" width="" height="" >

<img alt="Spring-ccc007bb.png" src="assets/Spring-ccc007bb.png" width="" height="" >

<img alt="Spring-3040e0cf.png" src="assets/Spring-3040e0cf.png" width="" height="" >
<img alt="Spring-5f21b5e3.png" src="assets/Spring-5f21b5e3.png" width="" height="" >
