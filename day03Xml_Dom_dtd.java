1.XML
		����:	(eXtensible Markup Language),����չ�ı������
		�Ա�:	properties�ļ�:��򵥵����� key=value
		����:	1.��������,��ͨ�õ����ݸ�ʽ
				2.��Ϊ�����ļ��Ĵ���,��Ϊ����,�нṹ������
		�﷨:	1.��һ��		version	�汾
								encoding����
				2.<>��ǩ/Ԫ��	����ֻ��һ���ĸ���ǩ
				3.��ǩ�����п��б�
				4.���� <linkman ������="����ֵ">
				5.�ϸ����ִ�Сд
				6.����Ƕ��,��������Ƕ��
		ע��:	�ĵ����ݺ��ļ�����ı����ʽҪһ��(UTF-8)
		�ṹ:	Document	�ĵ�
				Element		��ǩ/Ԫ��
				Attr		����
				Text		�ı�
				ͨ����������˼��ȥ����XML�е�����
				Xml��һ�нԽڵ�


2.DOM
		����:	(document object model),�ĵ�����ģ��
		����:	XML�ļ�-->�ڴ��е� DOM��
		��:		org.w3c.dom
		�ӿ�:	Node
				Attr
				Document
				Element
				Text

		��ö���:factory-->builder-->Document ����
				//1.����һ���µĿյ�Document����
				Document document = DocumentBuilderFactory.newInstance()
									.newDocumentBuilder().newDocument();
				//2.�������е��ļ����õ�Document����
				Document doc = DocumentBuilderFactory.newInstance()
									.newDocumentBuilder().parse(file);

			A.��ѯ����
				1.��ȡDocument����	doc
				2.�ҵ����ڵ�		doc.getDocumentElement();
				3.�ҵ�Ŀ��ڵ�		(Element)rootEle.getElementsByTagName("linkman").item(0)
									//ǿת�õ����෽��
				4.���ø���get����:	getArribute("id"),getTextContext()

			B.�޸�/ɾ������
				1.��ȡDocument����	doc
				2.�ҵ����ڵ�				doc.getDocumentElement();
				3.�ҵ�Ŀ��ڵ�		(Element)getElementsByTagName("linkman").item(0)
									//ǿת�õ����෽��
				4.���ø���set����:	setArribute("id","1"),setTextContext("123")
				4+.ɾ������			linkmanEle.getParentNode().removeChild(linkmanEle);
									//��Ҫ�ҵ����ڵ�,�ٵ��ø��ڵ��remove����
				5.ͬ������			TransformerFactory.newInstance()
									.newTransformer()
									.transform(new DOMSource(doc), new StreamResult(file));
									//�ڴ�DOM----�����--->����XML

			C.���Ӳ���
				1.��ȡDocument����	doc
				2.�ҵ����ڵ�		doc.getDocumentElement()
				3.�����ڵ�			doc.createElement("linkman")
				4.���ò㼶��ϵ		roorEle.appendChild{linkmanEle};
				5.���ڵ���������	����set
				6.ͬ��

			D.�½��ļ�
				1.�����µĿյ�Document����
				2.�������ڵ�,�丸�ڵ�ΪDocument�Ľڵ�
				3.���������ڵ�
				4.��������,�㼶��ϵ
				5.ͬ��


3.XML��Լ��
		����:	��XML�ĵ����淶,��ʹ�﷨û����,Ҳ�ò���
		���:	ʹ��XMLԼ��
