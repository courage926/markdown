# Spring的事务管理
```


<bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
		<property name="dataSource" ref="myDataSource"/>
	</bean>
	<tx:advice id="txAdvice"  transaction-manager="transactionManager">
		<tx:attributes>
			<tx:method name="get*" read-only="true"/>
			<tx:method name="list*" read-only="true"/>
			<tx:method name="*"/>
		</tx:attributes>
	</tx:advice>
	<aop:config >
		<aop:pointcut expression="execution(* cn.wolfcode.emis.service..*Service.*(..))" id="txPonitcut"/>
		<aop:advisor advice-ref="txAdvice" pointcut-ref="txPonitcut"/>
	</aop:config>
	</beans>
```


# 注解版
```
<!-- Tx注释解析器 -->
	<tx:annotation-driven transaction-manager="transactionManager"/>

@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService{
	@Autowired
	private EmployeeMapper employeeMapper;
	public void setEmployeeMapper(EmployeeMapper employeeMapper) {
		this.employeeMapper = employeeMapper;
	}
	public void save(Employee emp) {
		employeeMapper.insert(emp);
		int a = 1/0;//测试回滚
	}

	public void delete(Long id) {
		employeeMapper.delete(id);

	}

	public void update(Employee emp) {
		employeeMapper.update(emp);

	}

	@Transactional(readOnly = true)
	public Employee get(Long id) {
		return employeeMapper.selectById(id);
	}

	@Transactional(readOnly = true)
	public List<Employee> listAll() {

		return employeeMapper.selectAll();
	}

}
```

# SpringMVC
```
web.xml:前端控制器
<servlet>
  <servlet-name>springMVC</servlet-name>
  <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
  <init-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>classpath:mvc.xml</param-value>
  </init-param>
  <load-on-startup>1</load-on-startup>
</servlet>

<!-- Map all requests to the DispatcherServlet for handling -->
<servlet-mapping>
  <servlet-name>springMVC</servlet-name>
  <url-pattern>/</url-pattern>
</servlet-mapping>

mvc.xml
<mvc:annotation-driven/>
<context:component-scan base-package="cn.wolfcode.hello"/>

controller
@Controller
public class HelloController {

	@RequestMapping("/sayhello")
	public ModelAndView hello(){
		System.out.println(123);
		ModelAndView mv = new ModelAndView();
		mv.addObject("hello","你好");
		mv.setViewName("/WEB-INF/welcome.jsp");
		return mv;
	}
}
```

# DI注解
```
1.
@Autowired 配合 @Qualifier
@Resource(name="")

Spring 3.0之前
解析器
<context:annotation-config/>

2.Value
```
# IoC注解

```
1.bean组件(其实作用一样,区分位置)
@Respository DAO
@Service Service
@Controller 控制层
@Component 泛指组件

<!-- IoC注释解析器 -->
<context:component-scan base-package="cn.wolfcode.emis"/>
表示去哪些包中及其子包中去扫描组件注解

2.作用域注解
@scope

```
# AOP注解
```
@Aspect 贴在增强类上 注意配合@Componment
@Pointcut("execution(* .....)") 贴在方法上,方法名作为id
@Before("txPointcut")
@After 后置
@AfterThrowing 异常
@AfterReturning 最终
@Around 环绕

AOP注解解析器
<!-- AOP注释解析器 -->
<aop:aspectj-autoproxy />
```

# Tx注解
```
<bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
		<property name="dataSource" ref="myDataSource"/>
	</bean>


<!-- Tx注释解析器 -->
<tx:annotation-driven transaction-manager="transactionManager"/>

@Transactional
贴在类上 :该类的所有方法
贴在方法上:只针对被贴的一个方法

只读
@Transactional(readOnly = true)


```

# SpringMVC
```
控制层 @Controller
@RequestMapping("/XXOO")

mvc.xml
MVC注释解析器
<mvc:annotation-driven/>
将静态资源交由Tomcat默认的Servlet处理
<mvc:default-servlet-handler/>
组件扫描
<context:component-scan base-package="cn.wolfcode.emis.web.controller"/>
```
# SpringMVC执行流程
<img alt="SpringTransaction and SpringMVC-a517eb35.png" src="assets/SpringTransaction and SpringMVC-a517eb35.png" width="" height="400" >

# 请求和响应
## 处理去方法响应处理
```
Controller方法的返回类型
Controller共享数据到视图页面
```
- *返回void(了解)*
```
public void test1(HttpServletRequest req,HttpServletResponse resp){}
```
- *返回ModelAndView(掌握)*
```
public ModelAndView test2(){
	ModelAndView mv = new ModelAndView();
	return mv;
}
```
- *物理视图=视图前缀+逻辑视图+视图后缀*  
<img alt="SpringTransaction and SpringMVC-4eaeb26c.png" src="assets/SpringTransaction and SpringMVC-4eaeb26c.png" width="" height="" >
<img alt="SpringTransaction and SpringMVC-ee91c55a.png" src="assets/SpringTransaction and SpringMVC-ee91c55a.png" width="" height="" >
<img alt="SpringTransaction and SpringMVC-267be5e8.png" src="assets/SpringTransaction and SpringMVC-267be5e8.png" width="" height="" >
<img alt="SpringTransaction and SpringMVC-43e20a73.png" src="assets/SpringTransaction and SpringMVC-43e20a73.png" width="" height="" >

- *返回String(掌握)*
```
表示返回的逻辑视图名称(view),此时配合参数Model来完成(共享数据对象)
public String test4(Model model, View v){
	model.addAttribute("username","Lucy");
	return "respone/result"
	//return forward:/hello.html  请求转发
	//retrun redirect:/hello.html	重定向
}
```

# 请求
<img alt="SpringTransaction and SpringMVC-ae01034c.png" src="assets/SpringTransaction and SpringMVC-ae01034c.png" width="" height="" >
- Servlet API

# 请求编码
<img alt="SpringTransaction and SpringMVC-b6107a5d.png" src="assets/SpringTransaction and SpringMVC-b6107a5d.png" width="" height="" >

<img alt="SpringTransaction and SpringMVC-81315cad.png" src="assets/SpringTransaction and SpringMVC-81315cad.png" width="" height="" >

# ModelAttribute
```
SpringMVC中 会把方法参数放到request中去共享User->user

```

<img alt="SpringTransaction and SpringMVC-de3041e6.png" src="assets/SpringTransaction and SpringMVC-de3041e6.png" width="" height="" >

# dateTimeFormat
<img alt="SpringTransaction and SpringMVC-53b19145.png" src="assets/SpringTransaction and SpringMVC-53b19145.png" width="" height="" >

<img alt="SpringTransaction and SpringMVC-d0700cf0.png" src="assets/SpringTransaction and SpringMVC-d0700cf0.png" width="" height="" >
```
文件的上传
头像的问题
文件上传表单

上传解析器
Tomcat:Standard
Apache:
视图解析器

高级查询的数据封装到哪里
校验
```

<img alt="SpringTransaction and SpringMVC-ee74f02b.png" src="assets/SpringTransaction and SpringMVC-ee74f02b.png" width="" height="" >

<img alt="SpringTransaction and SpringMVC-673415df.png" src="assets/SpringTransaction and SpringMVC-673415df.png" width="" height="" >

<img alt="SpringTransaction and SpringMVC-fcfa4072.png" src="assets/SpringTransaction and SpringMVC-fcfa4072.png" width="" height="" >

<img alt="SpringTransaction and SpringMVC-ba0588f8.png" src="assets/SpringTransaction and SpringMVC-ba0588f8.png" width="" height="" >

<img alt="SpringTransaction and SpringMVC-04e85ec6.png" src="assets/SpringTransaction and SpringMVC-04e85ec6.png" width="" height="" >

<img alt="SpringTransaction and SpringMVC-9b64248d.png" src="assets/SpringTransaction and SpringMVC-9b64248d.png" width="" height="" >

<img alt="SpringTransaction and SpringMVC-ead9b7ae.png" src="assets/SpringTransaction and SpringMVC-ead9b7ae.png" width="" height="" >

<img alt="SpringTransaction and SpringMVC-f9ad5024.png" src="assets/SpringTransaction and SpringMVC-f9ad5024.png" width="" height="" >
