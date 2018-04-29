package com.imooc;

	/*final*/ public class Animal {
	public int age = 10;
	public String name;
	public void eat(){
		System.out.println("动物具有吃东西的能力");
	}
	public Animal(){
		System.out.println("Animal类执行了");
		age = 20;
	}
}
