# <center>day3总结
## shiro授权概述
1. 为员工分配角色,为角色分配权限
2. 员工发起请求访问系统中的资源,检查员工是否有对应的权限
3. 员工拥有的权限:在数据库中查询到
4. 访问资源需要的权限:通过获取被访问的方法上的注解获取到

## 权限管理实现方式
1. 编程式 通过写if/else授权代码块完成
2. 注解式 通过在执行的Java方法上放置相应的注解完成
3. JSP标签(shiro自带)或freemarker的标签(第三方) 在JSP页面通过相应的标签完成

## 基于ini的授权
### 权限表达式
- "用户名=密码,角色1,角色2"  
- "角色=权限1,权限2"  
```
isPermitted(String permission):是否拥有当前指定的一个权限
isPermitted(String permission,...):是否拥有当前指定的一个或者多个权限，以数组形式返回每
个判断的结果
hasRole(String role):是否拥有当前指定的一个角色
hasRoles(List roles):是否拥有当前指定的多个角色，以数组形式返回每个判断的结果
hasAllRoles(Collection roles):是否拥有指定的多个角色，只有当都有的时候才返回true，反之
返回false
```
### 基于Realm的授权
- 认证流程
  1. 自定义Realm
  ```
  继承AuthorizingRealm
  覆写doGetAuthenticationInfo(){}//获取认证信息
  覆写doGetAuthorizationInfo(){}//获取授权信息
  ```
  2. 在自定义Realm中实现授权操作
  3. 在ini文件中指定当前使用的Realm

### 基于Shiro的权限加载
先将权限注解贴在需要的方法上,在扫描对应类的方法,获取对应的注解生成权限表达式
1. 在Controller的方法上贴上Shiro提供的权限注解(@Requirespermissions)
```
@RequiresPermissions({"employee:list", "员工列表"},logical = Logical.OR)
```
2. 开启Shiro注解扫描器,当扫描到Controller中有使用@RequiresPermissions注解时,会使用动态代理为当前Controller生成代理对象,增强对应方法的权限校验功能
3. 扫描Controller类中的方法,生成权限信息到数据库中
```
因为生成了代理类,而代理类上并没有贴注解,所以需要到其父类(真实的Controller)获取方法
```

### web环境的Shiro授权
```
//获取授权信息
//获取当前登录的用户
//如果是超级管理员,授予其admin的角色和所有权限
//否则
//根据登录用户的id查询到其拥有的所有角色的编码
//根据登录用户的id查询到其拥有的所有权限表达式
//将用户的角色和权限添加到授权信息对象中,供Shiro权限校验时使用
```
### 细节
1. SpringMVC统一异常处理:在exceptionMappings中以键值对的格式设置异常需要跳转的错误页面。
2. 异步请求没有权限异常处理
  - @ControllerAdvice:Controller增强器
  - @ExceptionHandler:异常处理器

### Shiro标签
1. 作用:可以根据用户拥有的权限来显示具体的页面
2. 使用步骤
  1. 依赖
  2. 自定义MyFreemarkerConfigurer,相当于注册shiro的标签前
  3. 在mvc.xml中将MyFreeMarkerConfig设置为当前环境中使用的配置对象
  4. 常用标签
  ```
  1. authenticated标签：已认证通过的用户。<@shiro.authenticated>
</@shiro.authenticated>
2. notAuthenticated标签：未认证通过的用户。与authenticated标签相对。
<@shiro.notAuthenticated></@shiro.notAuthenticated>
3. principal标签：
输出当前用户信息，通常为登录帐号信息 <@shiro.principal property="name" />
4. hasRole标签：验证当前用户是否属于该角色 ，<@shiro.hasRole name=”admin”>Hello
admin!</@shiro.hasRole>
5. hasAnyRoles标签：验证当前用户是否属于这些角色中的任何一个，角色之间逗号分隔 ，
<@shiro.hasAnyRoles name="admin,user,operator">Hello admin!
</@shiro.hasAnyRoles>
6. hasPermission标签：验证当前用户是否拥有该权限 ，<@shiro.hasPermission
name="/order:*">订单/@shiro.hasPermission>
  ```

## MD5加密
### 概要
- 目的:相对安全
- 加密/加盐/加密次数

### CRM中使用MD5加密
1. 在添加用户的时候,需要对添加的用户密码进行 *加密*
2. 登陆认证过程中,密码匹配需要用到的密码应该和添加用户时的加密规则一致,所以同上,指定 *加密* 使用的盐为当前用户的用户名
3. shiro.xml配置,指定加密算法
4. 将使用的凭证匹配器设置到当前使用的Realm中
```
setCredentialsMatcher方法上贴@autowired
```

## 集成EhCache
1. 添加依赖
2. 配置缓存管理器并引用缓存管理器
3. 添加ehcache配置文件:shiro-echcache.xml

### 清空缓存
1. 用户正常退出,自动清空
2. 非正常退出,自动清空
3. 修改了用户权限,用户不退出系统,权限无法立刻生效
4. 如果想修改权限后立即清除缓存,可以点哦呦realm的clearCache方法清除缓存
