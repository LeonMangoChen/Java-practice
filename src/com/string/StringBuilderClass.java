package com.string;

public class StringBuilderClass {

	public static void main(String[] args) {
		// ����һ��StringBuilder���������洢�ַ���
		StringBuilder hobby = new StringBuilder("LeonMangoChen");
		System.out.println(hobby);
		
		StringBuilder str = new StringBuilder();
		//׷���ַ���
		str.append("fajjdlajsldsajfsd");
		//�Ӻ���ǰÿ����λ���붺��
		for(int i = str.length()-3;i>0;i=i-3){
			str.insert(i, ',');
		}
		System.out.println(str.toString());
		System.out.println(str.equals(str.toString()));//false����Ϊ�������Ͳ�ͬ
	}

}
