package com.practice;

public class temporary {

	public static void main(String[] args) {
		System.out.println(args); //[ljava.lang.string;@139a55  ��[���������飬 ��l������long , "@139a55"�����ϣֵ  
        System.out.println(args.length);  //Ĭ�ϳ���Ϊ0  
        for(int i = 0; i < args.length; i++) {
        	 System.out.println(args[i]); 
        }
	}
}
