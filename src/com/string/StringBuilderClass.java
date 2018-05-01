package com.string;

public class StringBuilderClass {

	public static void main(String[] args) {
		// 创建一个StringBuilder对象，用来存储字符串
		StringBuilder hobby = new StringBuilder("LeonMangoChen");
		System.out.println(hobby);
		
		StringBuilder str = new StringBuilder();
		//追加字符串
		str.append("fajjdlajsldsajfsd");
		//从后往前每隔三位插入逗号
		for(int i = str.length()-3;i>0;i=i-3){
			str.insert(i, ',');
		}
		System.out.println(str.toString());
		System.out.println(str.equals(str.toString()));//false，因为两个类型不同
	}

}
