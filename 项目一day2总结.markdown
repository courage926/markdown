# 项目一day2
## 员工模块改造
### 查询和删除
- 查询:list.jsp->ftl(include/assign/list标签的使用)
- 删除:模态框/绑定data-url/异步请求/提示框/
### 添加和编辑
- input.jsp->ftl

```
<#if entity?? ></#if> //非空执行,回显
<#if !entity?? ></#if> //为空执行,例如密码输入
<#if entity?? && entity.admin></#if>//entity非空,且entity.admin为true
```

### 编辑数据校验
- 导入插件:jquery.validate.js
- 数据校验/校验规则
```
$("#editForm").validate(rules:{},message:{})
```

### 批量删除(前端/后端)
1. 创建复选框:数据绑定data-id
2. 批量删除按钮:
  - 模态框(确认删除/未选择数据)
  - 获取复选框的data("id")封装到ids
  - 发送异步请求/传递ids到后台
  - controller接收ids,调用service方法
  - service调用mapper->mapper.xml(*foreach标签*)

## 统一异常处理
```
统一异常处理
	<bean class="org.springframework.web.servlet.handler.SimpleMappingExceptionResolver">
		<!-- 定义默认的异常处理页面，当该异常类型的注册时使用 -->
		<property name="defaultErrorView" value="common/error"/>
		<!-- 定义异常处理页面用来获取异常信息的变量名，默认名为exception -->
		<property name="exceptionAttribute" value="ex"/>
		<!-- 定义需要特殊处理的异常，用类名或完全路径名作为key，异常也页名作为值 -->
		<property name="exceptionMappings">
			<value>
				org.apache.shiro.authz.UnauthorizedException=common/nopermissionSubject
				<!-- 这里还可以继续扩展不同异常类型的异常处理 -->
			</value>
		</property>
	</bean>
```

## shiro
- Subject:主体(用户/程序)
- SecurityManager:安全管理器
- Realms:安全数据源
- Authenticator:认证器
- Authorizer:授权器/访问控制器

### shiro认证
1. 依赖
2. shiro.ini
```
[users]
admin=123
```
3. test
```
//1:创建基于ini文件的安全管理器工厂
//2:从工厂中拿到安全管理器对象
//3.设置安全管理器运行环境
//4.在当前环境中拿到一个主题对象
//5.创建token(包含账号和密码信息)
//6.执行登陆认证
//7.查看当前用户相关状态
```
4. 常见异常

| 异常名                        | 异常类型   |
|:----------------------------- |:---------- |
| UnknownAccountException       | 未知账号   |
| IncorrectCredentialsException | 凭证不正确 |

### 认证流程分析
1. 主要流程
```
1.由默认的Realm把ini文件中的用户信息读取到系统中,封装成map
2.判断Subject携带的token中的用户名作为key,在map中找是否存在该key对应的value
  返回UnknownAccount/认证信息对象
3.在返回的认证信息中拿到凭证去匹配token中的密码看是否一致,
  返回IncorrectCredentials/认证成功
```
### 自定义Realm
### 集成CRM项目
1. web.xml中配置代理过滤器
2. shiro.xml配置代理过滤器.安全管理器
### shiro默认的过滤器
细化shiro的配置与拦截器路径

## 登录页面改动
1. 引入jquery.form插件
2. 修改表单提交的地址为/login.html
3. 点击登录按钮提交表单
4. 以上两个方法的返回值都是表示是否放行到shiro的下一个过滤器,true表示放行,false表示不放行
在ajax请求中,只需要把JSON的数据写回给客户端即可,所以都不需要再放行了
5. 重新配置认证过滤器
```
增加注销
覆盖系统默认的过滤器
```
