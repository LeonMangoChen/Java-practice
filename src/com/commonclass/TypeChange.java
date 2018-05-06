package com.commonclass;

public class TypeChange {

	public static void main(String[] args) {
		// 将基本类型转换为字符串
		int c = 10;
		String str1 = Integer.toString(c);
		String str2 = String.valueOf(c);
		String str3 = c + "";
		System.out.println("toString()方法转换成字符串：" + (str1+"toString()"));
		System.out.println("valueOf()方法转换成字符串：" + (str2+"valueOf()"));
		System.out.println("基本类型加上空字符串方法转换成字符串：" + (str3+"空字符串"));
		//将字符串转换为基本类型
		String str4 = "8";
		int d = Integer.parseInt(str4);
		int e = Integer.valueOf(str4);
		System.out.println("字符串“8”用parseInt()方法将字符串转换为int类型后加2是"+(d + 2));
		System.out.println("字符串“8”用valueOf()方法将字符串转换为int类型后加5是"+(e + 5));
		
		//练习
		double m = 78.5;
		String str5 = String.valueOf(m);
		System.out.println("m为78.5，m转换为String型后与整数20的求和结果为：" + (str5+20));
		
		String str = "180.20";
		double a = Double.valueOf(str);
		System.out.println("str转换为double型后与整数20的求和结果为"+ (a+20));
		
	}

}
