package com.commonclass;

public class PackageClass {

	public static void main(String[] args) {
		// ����int���ͱ�����ֵΪ86
		int score1 = 86; 
		        
		// ����Integer��װ����󣬱�ʾ����score1��ֵ
		Integer score2=new Integer(score1);
		        
		// ��Integer��װ��ת��Ϊdouble����
		double score3=score2.doubleValue();
		        
		// ��Integer��װ��ת��Ϊfloat����
		float score4=score2.floatValue();
		        
		// ��Integer��װ��ת��Ϊint����
		int score5 =score2.intValue();

		System.out.println("Integer��װ�ࣺ" + score2);
		System.out.println("double���ͣ�" + score3);
		System.out.println("float���ͣ�" + score4);
		System.out.println("int���ͣ�" + score5);

	}

}
