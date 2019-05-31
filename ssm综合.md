# SSM综合案例
## 项目项目搭建
```
日志框架

关联包整合
织入包

```
<img alt="ssm综合-e55e5f98.png" src="assets/ssm综合-e55e5f98.png" width="" height="" >
## 熟悉流程/整理思路
```
mybatis目的:集成mapper

1.将mapper代理对象的生命周期交给Spring容器管理
*MapperScannerConfigurer*
basePackage告诉Spring需要生成mapper代理对象的mapper接口所在的包

2.管理mapper需要的SqlSessionFactoryBean
configuration:指定mybatis主配置文件的位置
mapperLocations:mapper映射文件的配置s
dataSource:连接池ref
typeAliasesPackage:生成别名的类所在的包

3.配置所需的连接池对象
init-method
destroy-method
四要素

4.连接数据库的属性配置文件
context:property-placeholder location="classpath:db.properties"
system-properties-mode="NEVER"
```
*location相关的都要加classpath:前缀*  
*通配符*  
<img alt="ssm综合-02fb0b03.png" src="assets/ssm综合-02fb0b03.png" width="" height="" >

myDataSource
- driverClassName
- url
- username
- password

mySqlSessionFactory
- dataSource
- configuration
- typeAliasesPackage
- mapperLocations

*Employee对象中关联了Department对象*
 - 考虑我们该声明时候去执行额外sql去查询对应的部门对象
 - 在我们需要用到当前关联的部门对象的时候去查询
 - employee对象.getDept()时候

 *mybatis延迟加载*
 - lazyLoadingEnabled=true       允许懒加载
 - aggressiveLazyLoading=false   禁用积极加载
 - lazyLoadTriggerMethods=clone  触发完整加载的方法(clone要完整的信息)

*mybatis generator代码生成插件*
- 根据表生成实体类,Mapper接口 Mapper.xml
- pom中配置插件mybatis-generator-core
- overwrite设置false 追加而不是覆盖
- 关联mysql-connector依赖
- 配置文件generatorConfig.xml
  - jdbcConnection
  - javModelGenerator
  - sqlMapGenerator
  - javaClientGenerator
  - table 可以复制设置多张表  
  <img alt="ssm综合-cf6da136.png" src="assets/ssm综合-cf6da136.png" width="" height="" >
- *执行命令: mybatis-generator:generate*
- 替换jar包 mybatis/generator/mybatis-generator-core/ 去掉类型
- XxxMapper.xml注意删除多余代码

*Service*
- void saveOrUpdate(Department d);
- void delete(Long id);
- Department get(Long id)
- List<Department> listAll();
- **文档注释**

*ServiceImpl*
- saveOrUpdate(..)
```
if(d.getId()==null){
  mapper.save
}else{
  mapper.update()
}
```

*test*
- 通过日志看sql运行情况
- db.properties url


 *事务*
  - 声明式事务(Xml)
    - 事务管理器Bean TxManager
    - 配置业务方法的增强 tx:advice
    - 使用aop将事务管理织入到指定的位置aop:config
      - aop:pointcut expression
      - aop:advisor
  - 编程式事务(注解)

  测试:打印service.getclass()看看是否被代理proxy.$Proxyxx

  *web*
  - 前端控制器DispatcherServlet
    - mvc.xml的路径
    - 优先级:启动服务器的时候,初始化当前的Servlet
      初始化mvc配置文件中的bean元素
    - /或者*.do
    - 编码过滤器 CharacterEncodingFilter
    <img alt="ssm综合-ed02ebd7.png" src="assets/ssm综合-ed02ebd7.png" width="" height="" >
  - *mvc.xml*
    - mvc.xml包含service和mapper所在的配置文件(appliacationContext.xml)
    - 注解解析器 @ RequestMapping
    - 视图解析器:配置视图名称的前后缀

  - *controller*
    - @ RequestMapping
    - 调用service中的方法查询信息
    - 将查询的信息共享到页面 model.addAttribute("list",list);
    - 跳转到列表页面(默认请求转发,不用写forward) return "";
    - 资源不在WEB-INF中,并且请求中没有共享数据,所以使用URL重定向
      return"redirect:/..."
    - 必须通过请求转发才能访问WEB-INF中的资源

  *拦截器*
  - 用于对Controller进行预处理和后处理(类似于Servlet开发中过滤器)
  - 使用步骤
    - 创建一个类实现接口
    - 配置

    - preHandle()   预处理(用得最多)
      - return true 放行
      - return flase 不放行
    - postHandle()  后处理
    - afterCompletion() 视图处理后处理(捕获异常)


  - *登陆*  
    - <img alt="ssm综合-964f1038.png" src="assets/ssm综合-964f1038.png" width="" height="" >
    - forward:/login.jsp就不会自动加前后缀
    - <img alt="ssm综合-3f57254e.png" src="assets/ssm综合-3f57254e.png" width="" height="" >

    - *定义拦截器*
    ```
    public class CheckLoginInterceptor implements handlerInterceptor
    public Boolean... preHandle(){
      //从session中获取用户信息
      //如果为空,回到登陆页面
      resp.sendRedirect("/login.jsp");
      return false;
      //不为空,放行
    }
    ```
    - *配置拦截器*
      - mvc.xml
      - mvc:interceptors
      - /** 多级目录路径
      - <img alt="ssm综合-0830af02.png" src="assets/ssm综合-0830af02.png" width="" height="" >
      - <img alt="ssm综合-0d04548e.png" src="assets/ssm综合-0d04548e.png" width="" height="" >

      **理解**
      - 每一行配置的作用
