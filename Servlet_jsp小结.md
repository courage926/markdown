# Servlet_jsp小结
<img alt="Servlet_jsp小结-6e22e5fb.png" src="assets/Servlet_jsp小结-6e22e5fb.png" width="" height="" >

# 获取表单请求参数(重要)
````
01.String getParameter(String name):返回指定名字参数的值。
02.String[] getParameterValues(String name):返回指定名字参数的多个参数值。(复选框)
03.Enumeration<String> getParameterNames():返回所有参数名的Enumeration对象。
04.Map<String,String[]> getParameterMap():返回所有的参数和值所组成的Map对象。
````
#  解决中文乱码的问题
````
使用自带API 来解决中文乱码的问题
    req.setCharacterEncoding("UTF-8");
    注意: 次方法的调用必须在获取所有参数之前.
````

# HttpServletResponse
<img alt="Servlet_jsp小结-c0b4b0f6.png" src="assets/Servlet_jsp小结-c0b4b0f6.png" width="" height="" >

设置MIME类型  
<img alt="Servlet_jsp小结-83254a32.png" src="assets/Servlet_jsp小结-83254a32.png" width="" height="" >  

获取输出流  
<img alt="Servlet_jsp小结-f501471b.png" src="assets/Servlet_jsp小结-f501471b.png" width="" height="" >

# 映射细节  
````
1.default
<Servlet-name>中的内容可以配置任意的字符,但是不能写default    
在tomcat/conf/web.xml 中默认配置一个DefaultServlet   
它的名称就是default,而此Servlet 作用就是用来处理静态资源的(html/css/js)  
若被覆盖,就不能处理静态资源
 ````

 ````
 2.映射路径
 一个Servlet可以配置多个映射<servlet-mapping>
 可以配置多个 <url-pattern>
 注意: 映射的名称必须唯一.
 注意: 必须以/ 开头.
 ````

 ````
 3.通配符(*)
 * : 表示任意个数的任意字符:
1) /* : 表示任意的个数的任意字符的请求连接都可以访问到当前Servlet
    /ooxx/* : 表示任意以/ooxx/开头的任意个数的任意字符的连接都可以访问到当前的Servlet
    注意: 必须以/ 开头.
2) *.ooxx :  以oox 结尾的任意个数的任意字符的连接都可以访问当前的Servlet
注意: 没有/ 开头.

 ````
````
4 欢迎页面配置
Tocmat /conf/web.xml 中默认配置了欢迎页面
默认情况下可以直接访问指定的文件.

配置: 在自己的web.xml 中去覆盖
````
<img alt="Servlet_jsp小结-fee9b16b.png" src="assets/Servlet_jsp小结-fee9b16b.png" width="" height="" >

````
5 服务器启动初始化Servlet 配置:
如果项目有需求: 在项目中写比较多的初始化代码.
   问题: 第一访问客户很慢,体验不好.
    需要让初始化代码在服务器启动时就执行,而不是又用户去调用.

如何配置:在<servlet > 中加入 <load-on-startup>1</load-on-startup>来配置Servlet 的启动优先级
 <load-on-startup>1</load-on-startup> 中间的数值越小优先级越高,如果是负数表示没有启动执行.
````

# 计算器
在jvava代码中写html很麻烦  

<img alt="Servlet_jsp小结-1fd7a7fb.png" src="assets/Servlet_jsp小结-1fd7a7fb.png" width="" height="" >

<img alt="Servlet_jsp小结-c1891a70.png" src="assets/Servlet_jsp小结-c1891a70.png" width="" height="" >

<img alt="Servlet_jsp小结-05dfc704.png" src="assets/Servlet_jsp小结-05dfc704.png" width="" height="" >
# 创建一个jsp文件和配置编码


# jsp的语法和原理
## 语法:
````
1、JSP的注释：
    作用：注释Java脚本代码
    语法：<%--这是注释,不会翻译到Servelt 中--%>
2、JSP中的Java脚本片段：(实际开发中，应做到JSP中不能出现一行Java脚本片段)
    作用：书写Java代码逻辑
    语法：<%
                语句1;
                语句2;
              %>
    原理：其中的语句会原封不动的被服务器翻译到对应的Servlet的_jspService方法中。
3、JSP的Java脚本表达式：
    作用：输出数据到页面上
    语法：<%=表达式%>(实际上就是调用输出流打印到页面上) out.print(表达式);

4、JSP的声明：
    作用：定义类的成员
    语法：<%!
                  Java代码
                %>
````
## 原理:
````
1 所有 以.jsp 和.jspx 的访问都交给 JspServlet 来处理
    1) 把 jsp 文件转化为 java文件
    2) 把 java文件编译成字节码文件
    3) 把转化的文件存放到 tomcat/work/.. 目录下
2 通过源码查看得知 jsp 的继承体系
    hello_jsp ---> HttpJspBase -> HttpServlet
    所以 jsp 其实就是一个 Servlet
3 在转化的java文件中发现,   _jspService 方法中

````
# 配置如何配置全局的异常页面

````
*errorPage: 指示当前页面出错后转向（转发）的页面。
    目标页面如果以"/"（当前应用）就是绝对路径。
配置全局错误提示页面：
web.xml
<error-page>
    <exception-type>java.lang.Exception</exception-type>
    <location>/error.jsp</location>
</error-page>
<error-page>
<error-code>404</error-code>
    <location>/404.jsp</location>
</error-page>
````






# Servlet线程安全
Servlet是单例模式,如果数据存在成员变量,那么数据会共享,导致数据混乱


# 注解  (添加参数)
<img alt="Servlet_jsp小结-0d804087.png" src="assets/Servlet_jsp小结-0d804087.png" width="" height="" >
