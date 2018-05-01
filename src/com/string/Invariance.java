package com.string;

public class Invariance {

	public static void main(String[] args) {
		String s1 = "LeonChen";
		String s2 = "LeonChen";
		//定义字符串s3，保存“I love”和s1拼接后的内容
		String s3 = "I love" + s1;
		// LeonChen为常量字符串，多次出现时会被编译器优化，只创建一个对象
		System.out.println("s1和s2内存地址相同吗？" +(s1 == s2));
		System.out.println("s1和s3内存地址相同吗？" +(s1 == s3));
		String s4 = "I love" + s1;
		//s1是变量，s4在运行时才知道具体值，所以s3和s4是不同的对像
		System.out.println("s3和s4内存地址相同吗？" +(s3 == s4));
	}

}
