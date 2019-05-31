个人总结

1.编码规范
	驼峰命名规则

	包名	域名倒写,小写
	类名	开头大小
	方法名	开头小写
	变量	开头小写
	常量	全大小

2.Junix测试
	思想:	测试先行
			(测试一个,实现一个)
	步骤:	将Junix导入环境
			@Test 贴在方法上面
			方法为公共无参无返回
	注意:	测试方法名为testXxx
			测试类名为XxxTest
	断言:	Assert.assertEquals(message,expected,actual);

	@Before 每次测试方法前执行
	@After  每次测试方法后执行

	@BeforeClass	所有测试方法前执行一次,方法要static修饰
	@AfterClass		所有测试方法后执行一次,方法要static修饰

3.反射
	获取Class类对象 (描述字节码文件结构,获取字节码成员信息)
 	a:Class clz = Class.forName("全限定名");//选中类,右键copy Qualified Name
	b:Class clz = Person.class;
	c:Person p  = new Person();
	  Class clz = p.getClass();
	
	获取构造器
	a:Constructor con = clz.getDeclaredConstructor(int.class,String.class);//Class<?>... parameterTypes
	b:Constructor con = clz.getConstructor(int.class,String.class);//Class<?>... parameterTypes
	c:Constructor[] cons = clz.getDeclaredConstructors();//返回全部构造器
	d:Constructor[] cons = clz.getConstructors();//返回全部公共构造器

	创建对象
	a:con.setAccessible(true);//私有构造器要先设置为公共才能用
	  Object obj = con.newInstance(18,"A");//通过构造器
	b:Object obj = clz.newInstance();//通过字节码对象(具有公共的无参数的构造器)

	获取方法(方法没有用 static 修饰,需要获得对象)
	a:Method m = clz.getMethod("m2",int.class);//指定公共方法
	b:Method m = clz.getDeclaredMethod("m3",int.class);//指定的已声明方法
	c:Method[] ms = clz.getMethods();//包括继承的公共方法
	d:Method[] ms = clz.getDeclaredMethods();//不包含继承的公共,私有...方法

	调用方法
	m.setAccessible(true);//设置为公共才能用
	int a = (int) m.invoke(obj,2);//返回类型为Object,要强转
