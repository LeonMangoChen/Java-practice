package com.domtest;

import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMTest {

	public static void main(String[] args) {
		// ����һ��DocumentBuilderFactory�Ķ���
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		//����һ��DocumentBuilder�Ķ���
		try {
			//����DocumentBuilder����
			DocumentBuilder db = dbf.newDocumentBuilder();
			//ͨ��DocumentBuilder�����parser��������book.xml�ļ�����ǰ��Ŀ��
			//Document document = db.parse(new FileInputStream("D:\\�ļ�\\Practice\\workspace\\Java-practice\\src\\com\\domtest\\books.xml"));
			Document document = db.parse("src/com/domtest/books.xml");
			//��ȡ����book�ڵ�ļ���
			NodeList bookList = document.getElementsByTagName("book");
			//ͨ��nodelist��getLength()�������Ի�ȡ��bookList�ĳ���
			System.out.println("һ����" + bookList.getLength() + "����");
			//����ÿһ��book�ڵ�
			for(int i = 0;i < bookList.getLength();i++){
				//ͨ�� ��ȡһ��book�ڵ㣬nodelist�� ����ֵ��0��ʼ
				Node book = bookList.item(i);
				//��ȡbook�ڵ���������Լ���
				NamedNodeMap attrs = book.getAttributes();
				System.out.println("��" + (i + 1) + "���鹲��" + attrs.getLength()+ "������");
				//����book������
				for(int j = 0;j < attrs.getLength();j++){
					System.out.println("=========���濪ʼ������" + (i+1) + "���������=========");
					//ͨ��item(index)�ķ�����ȡbook�ڵ��ĳһ������
					Node attr = attrs.item(j);
					//��ȡ������
					System.out.print("��������" + attr.getNodeName());
					//��ȡ����ֵ
					System.out.println("--����ֵ��" + attr.getNodeValue());
				}
				System.out.println("=========����������" + (i+1) + "���������=========");
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}