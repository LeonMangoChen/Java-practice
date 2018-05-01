package com.string;

public class OperateString2 {

	public static void main(String[] args) {
		String str = "qwertyauiopasadfghjkalzxacvbnm";
		//出现次数
		int num = 0;
		//循环遍历每个字符，判读是否是字符a，如果是，累加次数
		for(int i = 0;i<str.length();i++){
			//获取每个字符，判断是否是字符a
			if(str.charAt(i) == 'a'){//双引号报错
				//累加统计次数
				num++;
			}
		}
		System.out.println("字符a出现的次数："+ num);
	}

}
