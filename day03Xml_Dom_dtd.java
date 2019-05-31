1.XML
		定义:	(eXtensible Markup Language),可拓展的标记语言
		对比:	properties文件:存简单得数据 key=value
		作用:	1.传输数据,是通用的数据格式
				2.作为配置文件的存在,较为复杂,有结构的数据
		语法:	1.第一行		version	版本
								encoding编码
				2.<>标签/元素	有且只有一个的根标签
				3.标签必须有开有闭
				4.属性 <linkman 属性名="属性值">
				5.严格区分大小写
				6.允许嵌套,不允许交叉嵌套
		注意:	文档内容和文件本身的编码格式要一致(UTF-8)
		结构:	Document	文档
				Element		标签/元素
				Attr		属性
				Text		文本
				通过面向对象的思想去操作XML中的数据
				Xml中一切皆节点


2.DOM
		定义:	(document object model),文档对象模型
		作用:	XML文件-->内存中的 DOM树
		包:		org.w3c.dom
		接口:	Node
				Attr
				Document
				Element
				Text

		获得对象:factory-->builder-->Document 对象
				//1.创建一个新的空的Document对象
				Document document = DocumentBuilderFactory.newInstance()
									.newDocumentBuilder().newDocument();
				//2.解析现有的文件来得到Document对象
				Document doc = DocumentBuilderFactory.newInstance()
									.newDocumentBuilder().parse(file);

			A.查询操作
				1.获取Document对象	doc
				2.找到根节点		doc.getDocumentElement();
				3.找到目标节点		(Element)rootEle.getElementsByTagName("linkman").item(0)
									//强转得到更多方法
				4.调用各种get方法:	getArribute("id"),getTextContext()

			B.修改/删除操作
				1.获取Document对象	doc
				2.找到根节点				doc.getDocumentElement();
				3.找到目标节点		(Element)getElementsByTagName("linkman").item(0)
									//强转得到更多方法
				4.调用各种set方法:	setArribute("id","1"),setTextContext("123")
				4+.删除操作			linkmanEle.getParentNode().removeChild(linkmanEle);
									//先要找到父节点,再调用父节点的remove方法
				5.同步操作			TransformerFactory.newInstance()
									.newTransformer()
									.transform(new DOMSource(doc), new StreamResult(file));
									//内存DOM----输出流--->磁盘XML

			C.增加操作
				1.获取Document对象	doc
				2.找到根节点		doc.getDocumentElement()
				3.创建节点			doc.createElement("linkman")
				4.设置层级关系		roorEle.appendChild{linkmanEle};
				5.给节点设置数据	各种set
				6.同步

			D.新建文件
				1.创建新的空的Document对象
				2.创建根节点,其父节点为Document的节点
				3.创建其他节点
				4.设置数据,层级关系
				5.同步


3.XML的约束
		问题:	若XML文档不规范,即使语法没问题,也用不了
		解决:	使用XML约束
