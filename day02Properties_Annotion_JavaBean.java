1.�����ļ�
	Ŀ��:���Ӳ��������
		Ӳ����(��java��д����,��������Ҫ�����ĵ�)

	�����������ļ���:properties,xml
		properties��ʹ��:
			λ��:����Source Folder(����ʹ�����·����ȡ)
			��д:������=����ֵ
				 ע��:�м䲻Ҫ�пո�
			��ȡ:	Properties ��(����:��properties�ļ���ȡ��Ϣ)
					InputStream in = Thread
									.CurrentThread()
									.getContextClassLoader()
									.getResourceAsStream("XX.properties");
									//properties�ļ����·��
					Properties.load(in);//load��������
					Properties ps = new Properties();
					����ֵ = ps.getProperty("������");

2.ע��:һ��Ԫ����(�����������ݵ�����)
	�ӿ�:Annotation
	Ŀ��:���xml����ӷ�׵�����
	ע��:��Ҫ�е���������ʹ�÷��丳�蹦��
	����:
		@Target(ElementType.METHOD)//����λ��
		@Retention(RetentionPolicy.SOURCE)//����ֱ��ʲôʱ��SOURCE--ClASS--RUNTIME
		public @interface ��ǩ��{
			�������� ����() default Ĭ��ֵ;
		}
	ʹ��:@ע���� (������=����ֵ,...)
		Class clz = Person.class;//Person�Ǳ���ע�����
		User u = (User)clz.getAnnotation(User.class);//User���Զ����ע��
		System.out.println(u.name());//ע������
		System.out.println(u.age());//ע������



3.JavaBean
		�淶:	1.����public����
				2.�����޲ι�����
				3.�ֶ���private����,
				4.�ṩget/set����
		����:	get/set�����Ƶ��õ���
		��ʡ:	Introspector ��
					//��ȡjavabean��������Ϣ
					BeanInfo beanInfo = Introspector.getBeanInfo(Class<?> beanClass, Class<?> stopClass)
					//��ȡ����������(����)
					PropertyDescriptor[] pd = beanInfo.getPropertyDescriptors();
					//��ȡ������/��д����/��������
					for(PropertyDescriptor pd : pds){
							String name = pd.getName();
							Method rm = pd.getReadMethod();
							Method wm = pd.getWriteMethod();
							Class clz = pd.getPropertyType();
							if("xx".equals(name)){
								rm.invoke(obj,Object ����)//����xx�ֶε�set����
							}
						}

		javabean2map:	//1.��ȡjavabean������ֵ(��ʡ����,��ȡ����ֵ)
						//2.������ֵ����map(map.put(������,����ֵ))

		map2javabean:	//1.��map��keyȡ��value

						//2.����javabean����ֵ

		lombok���:һ�仰�㶨get set ������....
						@Data
						@AllArgsConstructor
						@NoArgsConstructor
