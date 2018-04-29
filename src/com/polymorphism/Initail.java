package com.polymorphism;

public class Initail {

	public static void main(String[] args) {
		/*
		ParentClass obj1 = new ParentClass();
		ParentClass obj2 = new SubClass();//父类的引用是可以指向子类对象的
		ParentClass obj3 = new BoyClass();
		//SubClass obj3 = new ParentClass();//错
		obj1.eat();
		obj2.eat();
		obj3.eat();
		*/
		SubClass child = new SubClass();
		ParentClass parent = child;//自动类型提升  向上类型转换
		if(parent instanceof SubClass){
			SubClass son = (SubClass)parent;//强制类型转换 向下类型转换
		}else{
			System.out.println("无法进行类型转换，转换成SubClass类型");
		}
		if(parent instanceof BoyClass){
			BoyClass boy = (BoyClass)parent;//1.编译时BoyClass类型 2.运行时SubClass类型
		}else{
			System.out.println("无法进行类型转换，转换成BoyClass类型");
		}
	}
}
/**多态
 * 对象的多种形态
 * 1.引用多态
 * 父类的引用可以指向本类的对象
 * 父类的引用可以指向子类的对象
 * 2.方法多态
 * 创建本类对象时，调用的方法为本类方法
 * 创建子类对象时，调用的方法为子类重写的方法或者继承的方法*/
 