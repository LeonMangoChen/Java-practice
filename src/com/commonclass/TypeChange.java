package com.commonclass;

public class TypeChange {

	public static void main(String[] args) {
		// ����������ת��Ϊ�ַ���
		int c = 10;
		String str1 = Integer.toString(c);
		String str2 = String.valueOf(c);
		String str3 = c + "";
		System.out.println("toString()����ת�����ַ�����" + (str1+"toString()"));
		System.out.println("valueOf()����ת�����ַ�����" + (str2+"valueOf()"));
		System.out.println("�������ͼ��Ͽ��ַ�������ת�����ַ�����" + (str3+"���ַ���"));
		//���ַ���ת��Ϊ��������
		String str4 = "8";
		int d = Integer.parseInt(str4);
		int e = Integer.valueOf(str4);
		System.out.println("�ַ�����8����parseInt()�������ַ���ת��Ϊint���ͺ��2��"+(d + 2));
		System.out.println("�ַ�����8����valueOf()�������ַ���ת��Ϊint���ͺ��5��"+(e + 5));
		
		//��ϰ
		double m = 78.5;
		String str5 = String.valueOf(m);
		System.out.println("mΪ78.5��mת��ΪString�ͺ�������20����ͽ��Ϊ��" + (str5+20));
		
		String str = "180.20";
		double a = Double.valueOf(str);
		System.out.println("strת��Ϊdouble�ͺ�������20����ͽ��Ϊ"+ (a+20));
		
	}

}
