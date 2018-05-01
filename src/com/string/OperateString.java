package com.string;

public class OperateString {

	public static void main(String[] args) {
		// Java文件名
		String fileName = "OperateString.java";
		//邮箱
		String email = "leonmangochen@163.com";
		// 判断.java文件名是否正确：合法的文件名应该以.java结尾
        /*
        参考步骤：
        1、获取文件名中最后一次出现"."号的位置
        2、根据"."号的位置，获取文件的后缀
        3、判断"."号位置及文件后缀名
        */
        //获取文件名中最后一次出现"."号的位置
		int index = fileName.lastIndexOf(".");
		System.out.println(index);
		//获取文件的后缀
		String suffix = fileName.substring(index);
		System.out.println(suffix);
		//判断必须包含"."号，且不能出现在首位，同时后缀为"java"
		System.out.println(fileName.indexOf(".") != 0);
		if((fileName.indexOf('.')!=-1)&&(fileName.indexOf('.')!=0)&&(fileName.substring(index).equals(".java"))){
			System.out.println("Java文件名正确");
		}else{
			System.out.println("Java文件名无效");
		}
		
		// 判断邮箱格式是否正确：合法的邮箱名中至少要包含"@", 并且"@"是在"."之前
        /*
       参考步骤：
       1、获取文件名中"@"符号的位置
       2、获取邮箱中"."号的位置
       3、判断必须包含"@"符号，且"@"必须在"."之前
       */
	    // 获取邮箱中"@"符号的位置
		int index2 = email.indexOf('@');
		// 获取邮箱中"."符号的位置
		int index3 = email.indexOf('.');
		// 判断必须包含"@"符号，且"@"必须在"."之前
		if (index2 != -1 && index3 > index2) {
			System.out.println("邮箱格式正确");
		} else {
			System.out.println("邮箱格式无效");
		}
	}

}
