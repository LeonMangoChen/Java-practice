package com.practice;
import java.util.Scanner;
/*
 * 功能：为指定的成绩进行加分，直至分数大于等于60分为止
 * 输出加分前的成绩和加分后的成绩，并且统计加分的次数
 * 步骤：
 * 1.定义一个变量，用来保存加分的次数
 * 2.使用循环为成绩加分
 * 3.每次执行循环统计加分操作，加1分，并且统计加分的次数
 * 
 * 使用Scanner工具类来获取用户输入的成绩信息
 * Scanner类位于java.util包中，使用时需要导入此包
 * 步骤：
 * 1.导入java.util.Scanner
 * 2.创建Scanner对象
 * 3.接收并保存用户输入的值
 * */
public class AddScore {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);//创建Scanner对象
		System.out.println("请输入考试成绩信息：");
		int score = input.nextInt();//获取用户输入的成绩并保存在变量中
		int count = 0;//加分的次数
		System.out.println("加分前的成绩"+score);
		while(score < 60){//只要成绩小于60分，就循环进行加分操作
			score++;//每次循环加1分
			count++;//统计 次数
		}
		System.out.println("加分后的成绩"+score);
		System.out.println("共加了"+count+"次");
	}
}
