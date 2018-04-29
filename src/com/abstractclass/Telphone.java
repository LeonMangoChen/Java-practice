package com.abstractclass;

public abstract class Telphone {
	public abstract void call();
	public abstract void message();
	
}
/**
 * 1.语法定义：
 * 抽象类前使用abstract关键字修饰，则该类为抽象类
 * 2.应用场景：
 * a.在某些情况下，某个父类只是知道其子类应该包含怎样的方法，
 * 	但无法准确知道这些子类如何实现这些方法
 * b.从多个具有相同特征的类中抽象出一个抽象类，以这些抽象类
 * 作为子类的模板，从而避免了子类设计的随意性。
 * 3.作用：
 * 限制规定子类必须实现某些方法，但不关注实现细节
 * 4.使用规则
 * a.abstract定义抽象类
 * b.abstract定义抽象方法，只有声明，不需要实现
 * c.包含抽象方法的类是抽象类
 * d.抽象类中可以包含普通的方法，也可以没有抽象的方法
 * e.抽象类不能直接创建，可以定义引用变量*/
