package com.encapsulation;

public class InitailTelphone {
	public static void main(String[] args) {
		//ͨ���޲εĹ��췽�����Դ�������
		Telphone phone = new Telphone();
		//ͨ���вεĹ��췽��Ҳ���Դ������󣬲��������е�ʵ����������ֵ
		Telphone phone2 = new Telphone(5.0f,1.4f,2.0f);
		phone2.setScreen(6.0f);
		System.out.println("screen:" + phone2.getScreen());
	}
}
