�����ܽ�

1.����淶
	�շ���������

	����	������д,Сд
	����	��ͷ��С
	������	��ͷСд
	����	��ͷСд
	����	ȫ��С

2.Junix����
	˼��:	��������
			(����һ��,ʵ��һ��)
	����:	��Junix���뻷��
			@Test ���ڷ�������
			����Ϊ�����޲��޷���
	ע��:	���Է�����ΪtestXxx
			��������ΪXxxTest
	����:	Assert.assertEquals(message,expected,actual);

	@Before ÿ�β��Է���ǰִ��
	@After  ÿ�β��Է�����ִ��

	@BeforeClass	���в��Է���ǰִ��һ��,����Ҫstatic����
	@AfterClass		���в��Է�����ִ��һ��,����Ҫstatic����

3.����
	��ȡClass����� (�����ֽ����ļ��ṹ,��ȡ�ֽ����Ա��Ϣ)
 	a:Class clz = Class.forName("ȫ�޶���");//ѡ����,�Ҽ�copy Qualified Name
	b:Class clz = Person.class;
	c:Person p  = new Person();
	  Class clz = p.getClass();
	
	��ȡ������
	a:Constructor con = clz.getDeclaredConstructor(int.class,String.class);//Class<?>... parameterTypes
	b:Constructor con = clz.getConstructor(int.class,String.class);//Class<?>... parameterTypes
	c:Constructor[] cons = clz.getDeclaredConstructors();//����ȫ��������
	d:Constructor[] cons = clz.getConstructors();//����ȫ������������

	��������
	a:con.setAccessible(true);//˽�й�����Ҫ������Ϊ����������
	  Object obj = con.newInstance(18,"A");//ͨ��������
	b:Object obj = clz.newInstance();//ͨ���ֽ������(���й������޲����Ĺ�����)

	��ȡ����(����û���� static ����,��Ҫ��ö���)
	a:Method m = clz.getMethod("m2",int.class);//ָ����������
	b:Method m = clz.getDeclaredMethod("m3",int.class);//ָ��������������
	c:Method[] ms = clz.getMethods();//�����̳еĹ�������
	d:Method[] ms = clz.getDeclaredMethods();//�������̳еĹ���,˽��...����

	���÷���
	m.setAccessible(true);//����Ϊ����������
	int a = (int) m.invoke(obj,2);//��������ΪObject,Ҫǿת
