1.配置文件
	目的:解决硬编码问题
		硬编码(在java中写死的,但是又需要经常改的)

	常见的配置文件有:properties,xml
		properties的使用:
			位置:放在Source Folder(便于使用相对路径获取)
			编写:属性名=属性值
				 注意:中间不要有空格
			读取:	Properties 类(作用:从properties文件获取信息)
					InputStream in = Thread
									.CurrentThread()
									.getContextClassLoader()
									.getResourceAsStream("XX.properties");
									//properties文件相对路径
					Properties.load(in);//load方法加载
					Properties ps = new Properties();
					属性值 = ps.getProperty("属性名");

2.注解:一种元数据(描述其他数据的数据)
	接口:Annotation
	目的:解决xml配置臃肿的问题
	注意:需要有第三方程序使用反射赋予功能
	定义:
		@Target(ElementType.METHOD)//贴的位置
		@Retention(RetentionPolicy.SOURCE)//保存直到什么时期SOURCE--ClASS--RUNTIME
		public @interface 标签名{
			属性类型 属性() default 默认值;
		}
	使用:@注解名 (属性名=属性值,...)
		Class clz = Person.class;//Person是被贴注解的类
		User u = (User)clz.getAnnotation(User.class);//User是自定义的注解
		System.out.println(u.name());//注解属性
		System.out.println(u.age());//注解属性



3.JavaBean
		规范:	1.类名public修饰
				2.公共无参构造器
				3.字段用private修饰,
				4.提供get/set方法
		属性:	get/set方法推导得到的
		内省:	Introspector 类
					//获取javabean的描述信息
					BeanInfo beanInfo = Introspector.getBeanInfo(Class<?> beanClass, Class<?> stopClass)
					//获取属性描述器(数组)
					PropertyDescriptor[] pd = beanInfo.getPropertyDescriptors();
					//获取属性名/读写方法/属性类型
					for(PropertyDescriptor pd : pds){
							String name = pd.getName();
							Method rm = pd.getReadMethod();
							Method wm = pd.getWriteMethod();
							Class clz = pd.getPropertyType();
							if("xx".equals(name)){
								rm.invoke(obj,Object 数组)//调用xx字段的set方法
							}
						}

		javabean2map:	//1.获取javabean的属性值(内省机制,获取属性值)
						//2.把属性值放入map(map.put(属性名,属性值))

		map2javabean:	//1.从map按key取出value

						//2.设置javabean属性值

		lombok插件:一句话搞定get set 构造器....
						@Data
						@AllArgsConstructor
						@NoArgsConstructor
