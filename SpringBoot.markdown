# SpringBoot简介
<img alt="SpringBoot-300612ba.png" src="assets/SpringBoot-300612ba.png" width="" height="" >

# AnnotationConfig
<img alt="SpringBoot-7c0000ac.png" src="assets/SpringBoot-7c0000ac.png" width="" height="" >

<img alt="SpringBoot-2f82478d.png" src="assets/SpringBoot-2f82478d.png" width="" height="" >

<img alt="SpringBoot-d5de15f9.png" src="assets/SpringBoot-d5de15f9.png" width="" height="" >

<img alt="SpringBoot-90dbcbcf.png" src="assets/SpringBoot-90dbcbcf.png" width="" height="" >

<img alt="SpringBoot-22ef735e.png" src="assets/SpringBoot-22ef735e.png" width="" height="" >

<img alt="SpringBoot-0b642195.png" src="assets/SpringBoot-0b642195.png" width="" height="" >

- 配置类返回值交给Spring容器管理

# @ComponentScan
<img alt="SpringBoot-933c5526.png" src="assets/SpringBoot-933c5526.png" width="" height="" >
- 有默认值 默认是配置类所在的包

<img alt="SpringBoot-eeff1f98.png" src="assets/SpringBoot-eeff1f98.png" width="" height="" >

数组  

<img alt="SpringBoot-4ef843c8.png" src="assets/SpringBoot-4ef843c8.png" width="" height="" >

一个的时候可以省略

<img alt="SpringBoot-09d06dd8.png" src="assets/SpringBoot-09d06dd8.png" width="" height="" >

默认方法名就是id

<img alt="SpringBoot-3954f040.png" src="assets/SpringBoot-3954f040.png" width="" height="" >

scope(""):作用域 默认是单例


# DI注入

硬编码创建(new 创建)
<img alt="SpringBoot-b79df79b.png" src="assets/SpringBoot-b79df79b.png" width="" height="" >


<img alt="SpringBoot-ffa47e2f.png" src="assets/SpringBoot-ffa47e2f.png" width="" height="" >

依赖注入(引用内存地址)
<img alt="SpringBoot-2f0a3087.png" src="assets/SpringBoot-2f0a3087.png" width="" height="" >

# @import
<img alt="SpringBoot-2798699a.png" src="assets/SpringBoot-2798699a.png" width="" height="" >

<img alt="SpringBoot-d30914e5.png" src="assets/SpringBoot-d30914e5.png" width="" height="" >

# @importResource
<img alt="SpringBoot-89bd7e6b.png" src="assets/SpringBoot-89bd7e6b.png" width="" height="" >

<img alt="SpringBoot-3f29741c.png" src="assets/SpringBoot-3f29741c.png" width="" height="" >

模拟连接池

<img alt="SpringBoot-67ef5a53.png" src="assets/SpringBoot-67ef5a53.png" width="" height="" >

<img alt="SpringBoot-4cccf51c.png" src="assets/SpringBoot-4cccf51c.png" width="" height="" >


<img alt="SpringBoot-a53c40ed.png" src="assets/SpringBoot-a53c40ed.png" width="" height="" >


# 运行环境

<img alt="SpringBoot-0db1536d.png" src="assets/SpringBoot-0db1536d.png" width="" height="" >

两套环境都引入,需要用到的环境就激活
<img alt="SpringBoot-e45ac58c.png" src="assets/SpringBoot-e45ac58c.png" width="" height="" >

<img alt="SpringBoot-b385e369.png" src="assets/SpringBoot-b385e369.png" width="" height="" >

<img alt="SpringBoot-d7141cc5.png" src="assets/SpringBoot-d7141cc5.png" width="" height="" >

# Spring Boot
引导启动

<img alt="SpringBoot-6e037253.png" src="assets/SpringBoot-6e037253.png" width="" height="" >

<img alt="SpringBoot-caa57d43.png" src="assets/SpringBoot-caa57d43.png" width="" height="" >

<img alt="SpringBoot-871a96ea.png" src="assets/SpringBoot-871a96ea.png" width="" height="" >


<img alt="SpringBoot-84874dd7.png" src="assets/SpringBoot-84874dd7.png" width="" height="" >

# 打包
<img alt="SpringBoot-0a83654f.png" src="assets/SpringBoot-0a83654f.png" width="" height="" >

<img alt="SpringBoot-3ed2e2fc.png" src="assets/SpringBoot-3ed2e2fc.png" width="" height="" >

<img alt="SpringBoot-c0edbf2b.png" src="assets/SpringBoot-c0edbf2b.png" width="" height="" >

<img alt="SpringBoot-314b26dc.png" src="assets/SpringBoot-314b26dc.png" width="" height="" >

# SpringBoot参数配置

<img alt="SpringBoot-0dd4a46b.png" src="assets/SpringBoot-0dd4a46b.png" width="" height="" >

<img alt="SpringBoot-822f8882.png" src="assets/SpringBoot-822f8882.png" width="" height="" >

<img alt="SpringBoot-30d6ef9b.png" src="assets/SpringBoot-30d6ef9b.png" width="" height="" >

<img alt="SpringBoot-8f300a78.png" src="assets/SpringBoot-8f300a78.png" width="" height="" >

<img alt="SpringBoot-d62f7436.png" src="assets/SpringBoot-d62f7436.png" width="" height="" >

<img alt="SpringBoot-fe095b24.png" src="assets/SpringBoot-fe095b24.png" width="" height="" >

# @ConfigurationProperties
绑定对象属性

<img alt="SpringBoot-6fe55569.png" src="assets/SpringBoot-6fe55569.png" width="" height="" >

<img alt="SpringBoot-59bff741.png" src="assets/SpringBoot-59bff741.png" width="" height="" >

# 小结
```
1.注解配置Sprinf
@Configuration:替代xml文件
@bean 替代 bean标签
@componentScan 组件扫描器
@value 取属性文件中的值

2.SpringBoot
 @SpringBootApplication:
 配置对象
 组件扫描
 自动配置
 @ConfigurationProperties
 绑定属性文件
```


1. 了解AnnotationConfig理念
```
“约定优先配置”（convention over configuration）
1.定义配置类代替之前的xml文件,法保护bean对象交给spring管理
2.加载配置类启动AnnotationConfigApplicationContext容器
```
掌握@Configuration注解的作用
```
表示该类是Spring的配置类
```
掌握@Bean注解的作用
```
配置类的方法上贴,返回的对象交给Spring容器管理,
bean的id就是当前方法名
```
掌握@ComponentScan注解的作用
```
开启组件扫描器,默认扫描当前类所在的包,及其子包
```
掌握AnnotationConfig方式的依赖注入
```
方式1.把需要注入的Bean对象作为参数传入到另一个Bean的方法声明中,形参名称最好跟Bean的id一致
方式2.在依赖的处理时直接调用setter方法传入另一个Bean的声明方法
```
掌握@Import和@ImportResource导入资源文件
```
@Import(OtherConfig.class) //在主配置类中关联分支配置类
@ImportResource("classpath:applicationContext.xml") //在主配置类中关联XML配置
@ContextConfiguration(MainConfig.class) //加载主配置类
```
```
//把属性配置加载到Spring的环境对象中
@PropertySource("classpath:db.properties")
//@Value:从Spring环境对象中根据key读取value
@Value("${jdbc.url}")
private String url
```
掌握@SpringBootApplication及其上面的元注解的作用
```
@SpringBootApplication注解内部是3大注解功能的集成
@ComponentScan: 开启组件扫描
@SpringBootConfiguration: 作用等同于@Configuration注解,也是用于标记配置类
@EnableAutoConfiguration: 内部导入AutoConfigurationImportSelector,该类中有个
getCandidateConfigurations方法,加载jar包中META-INF/spring.factories文件中配置的配置对象,自动配
置定义的功能,包括: AOP / PropertyPlaceholder / FreeMarker / HttpMessageConverter / Jackson /
DataSource / DataSourceTransactionManager / DispatcherServlet / WebMvc 等等
```
了解SpringBoot常见的自动配置功能
```
父项目spring-boot-starter-parent帮我们管理和导入了许多的基础依赖
spring-boot-starter-web集成了运行网站应用的相关环境和工具,包括:SpringMVC / Tomcat / Jackson 等等
```
掌握SpringBoot属性绑定
```
一般用的比较多的就是直接在application.properties或者YAML配置,其次是命令行启动方式
@Value绑定单个属性
@ConfigurationProperties绑定对象属性
```
掌握SpringBoot搭建SSM开发环境
了解日志的作用



优点
1. 创建独立的Spring程序
2. 嵌入的Tomcat 无需部署war文件
3. 简化Maven配置
4. 自动配置Spring
5. 提供生产就绪功能 日志 健康检查 外部配置
6. xml没有要求配置
7. 非常容易和第三方框架集成起来

缺点
1. 版本更新较快,可能出现较大变化
2. 因为约定大于配置,所以经常会出现一些很难解决的问题

```
@Configration 配置类
@Bean         方法返回值为bean对象
@ComponentScan
@Value
@SpringBootApplication
@ConfigurationProperties
```

| @Annotataion             | 作用                       |
|:------------------------ |:-------------------------- |
| @Configration            | 配置类                     |
| @Bean                    | 方法返回值为bean对象       |
| @ComponentScan           | 组件扫描器                 |
| @Value                   | 取值                       |
| @SpringBootApplication   | 配置对象/组件扫描/自动配置 |
| @ConfigurationProperties | 绑定属性文件中的属性值     |
