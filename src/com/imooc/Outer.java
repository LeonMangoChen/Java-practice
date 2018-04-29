package com.imooc;
//外部类Outer
public class Outer {
	private int a = 99;//外部类的私有属性
	//内部类Inner
	public class Inner{
		int b = 2;//内部类的私有属性
		public void show() {
			System.out.println("welcom to world!");
			System.out.println("访问外部类中的a:" + a);
			System.out.println("访问内部类中的b:" + b);
		}
	}
	
	public static void main(String[] args){
		//创建外部类对象
		Outer o = new Outer();
		//创建内部类对象
		Inner i = o.new Inner();
		//调用内部类对象的方法
		i.show();
	}

}
