package com.imooc;
//�ⲿ��Outer
public class Outer {
	private int a = 99;//�ⲿ���˽������
	//�ڲ���Inner
	public class Inner{
		int b = 2;//�ڲ����˽������
		public void show() {
			System.out.println("welcom to world!");
			System.out.println("�����ⲿ���е�a:" + a);
			System.out.println("�����ڲ����е�b:" + b);
		}
	}
	
	public static void main(String[] args){
		//�����ⲿ�����
		Outer o = new Outer();
		//�����ڲ������
		Inner i = o.new Inner();
		//�����ڲ������ķ���
		i.show();
	}

}
