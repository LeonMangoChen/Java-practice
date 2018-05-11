package com.commonclass;

public class UseMath {

	public static void main(String[] args) {
		double a = 12.81;//定义一个double类型变量
		int b = (int) a;//将double类型强制转换为int类型，去掉小数位
		System.out.println("将double类型数字12.81强制转换为int类型:" + b);
		long c = Math.round(a);//调用round方法，进行四舍五入
		System.out.println("将double类型数字12.81进行四舍五入" + c);
		double d = Math.floor(a);//调用floor方法，返回小于参数的最大整数
		System.out.println("floor:" + d);
		double e = Math.ceil(a);//调用ceil方法，返回大于参数的最小整数
		System.out.println("ceil:" + e);
		double x = Math.random();//调用random方法，产生[0,1]之间的随机浮点数
		System.out.println("随机数" + x);
		int y = (int) (Math.random()*99);//产生[0,99]之间的随机整数
		System.out.println("产生[0,99]之间的随机数：" + y);
		
		int[] nums = new int[10];//定义一个整型数组，长度为10
		//通过循环给数组复制
		for(int i = 0;i < nums.length;i++){
			int randomNum = (int) (Math.random()*10);//产生10以内的随机数
			nums[i] = randomNum;//为元素赋值
		}
		//使用foreach循环输出数组中的元素
		for(int num :nums){
			System.out.print(num+ " ");
		}
	}

}
