package com.string;

public class Invariance {

	public static void main(String[] args) {
		String s1 = "LeonChen";
		String s2 = "LeonChen";
		//�����ַ���s3�����桰I love����s1ƴ�Ӻ������
		String s3 = "I love" + s1;
		// LeonChenΪ�����ַ�������γ���ʱ�ᱻ�������Ż���ֻ����һ������
		System.out.println("s1��s2�ڴ��ַ��ͬ��" +(s1 == s2));
		System.out.println("s1��s3�ڴ��ַ��ͬ��" +(s1 == s3));
		String s4 = "I love" + s1;
		//s1�Ǳ�����s4������ʱ��֪������ֵ������s3��s4�ǲ�ͬ�Ķ���
		System.out.println("s3��s4�ڴ��ַ��ͬ��" +(s3 == s4));
	}

}
