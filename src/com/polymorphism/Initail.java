package com.polymorphism;

public class Initail {

	public static void main(String[] args) {
		/*
		ParentClass obj1 = new ParentClass();
		ParentClass obj2 = new SubClass();//����������ǿ���ָ����������
		ParentClass obj3 = new BoyClass();
		//SubClass obj3 = new ParentClass();//��
		obj1.eat();
		obj2.eat();
		obj3.eat();
		*/
		SubClass child = new SubClass();
		ParentClass parent = child;//�Զ���������  ��������ת��
		if(parent instanceof SubClass){
			SubClass son = (SubClass)parent;//ǿ������ת�� ��������ת��
		}else{
			System.out.println("�޷���������ת����ת����SubClass����");
		}
		if(parent instanceof BoyClass){
			BoyClass boy = (BoyClass)parent;//1.����ʱBoyClass���� 2.����ʱSubClass����
		}else{
			System.out.println("�޷���������ת����ת����BoyClass����");
		}
	}
}
/**��̬
 * ����Ķ�����̬
 * 1.���ö�̬
 * ��������ÿ���ָ����Ķ���
 * ��������ÿ���ָ������Ķ���
 * 2.������̬
 * �����������ʱ�����õķ���Ϊ���෽��
 * �����������ʱ�����õķ���Ϊ������д�ķ������߼̳еķ���*/
 