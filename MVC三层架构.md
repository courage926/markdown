# 三层架构  

表示层  
数据访问层  
业务逻辑层  

# 准备工作

1.搭建web项目结构  
2.创建模型包和product模型  
3.创建dao和dao接口  
4 创建dao.impl  
5.创建service包和接口  
6.创建service.impl包和实现类  
7.创建mybatis-cfg.xml  
8.创建mapper包和XxxMapper.xml  
9.实现crud  
10.实现一个方法,测试一个  


创建web.servlet包和XxxServlet  
封装请求,封装对象  
调用业务方法来处理请求  
控制跳转  

# 常见错误
上下文路径
url从定向
添加 删除 编辑的超链接

请求转发默认就在上下文路径下,无需重新加上 上下文路径

结论:以后做跳转才做,只要涉及不需要带数据跳转数据统统用url重定向

可能的错误
修改变成保存 input.jsp没有带id
或者saveOrUpdate没有获取id去判断

2 数字化格式化异常
没有判断数值类型的字符串就直接转为number

小结
mvc
三层架构


查询
ProductServlet->list方法中去查询所有的数据
设置共享数据
跳转到list,jsp去做显示操作

删除
编写页面的超链接 需要带上id
在
ProductServlet->delete去获取id 然后删除
跳转到/product中去查询列表数据

添加
编写超链接跳转到/product?cmd=edit
在ProductServlet->edit跳转到input.jsp页面去录入数据
...

编辑
