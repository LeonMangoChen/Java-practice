package com.practice;
import java.util.Scanner;
/*
 * ���ܣ�Ϊָ���ĳɼ����мӷ֣�ֱ���������ڵ���60��Ϊֹ
 * ����ӷ�ǰ�ĳɼ��ͼӷֺ�ĳɼ�������ͳ�ƼӷֵĴ���
 * ���裺
 * 1.����һ����������������ӷֵĴ���
 * 2.ʹ��ѭ��Ϊ�ɼ��ӷ�
 * 3.ÿ��ִ��ѭ��ͳ�Ƽӷֲ�������1�֣�����ͳ�ƼӷֵĴ���
 * 
 * ʹ��Scanner����������ȡ�û�����ĳɼ���Ϣ
 * Scanner��λ��java.util���У�ʹ��ʱ��Ҫ����˰�
 * ���裺
 * 1.����java.util.Scanner
 * 2.����Scanner����
 * 3.���ղ������û������ֵ
 * */
public class AddScore {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);//����Scanner����
		System.out.println("�����뿼�Գɼ���Ϣ��");
		int score = input.nextInt();//��ȡ�û�����ĳɼ��������ڱ�����
		int count = 0;//�ӷֵĴ���
		System.out.println("�ӷ�ǰ�ĳɼ�"+score);
		while(score < 60){//ֻҪ�ɼ�С��60�֣���ѭ�����мӷֲ���
			score++;//ÿ��ѭ����1��
			count++;//ͳ�� ����
		}
		System.out.println("�ӷֺ�ĳɼ�"+score);
		System.out.println("������"+count+"��");
	}
}
