package com.practice;
import java.util.Scanner;
/*
 * ���ܣ�ʵ�������༶�ĸ�����ѧԱ�ĳɼ���Ȼ�����ÿ���༶ѧԱ��ƽ����
 * ֪ʶ�㣺����ѭ�������ѭ�����ư༶���������ڲ�ѭ������ÿ���༶��ѧԱ����
 * */
public class AddScore01 {
	public static void main(String[] args) {
		int classNum = 3;//�༶����
		int stuNum = 4;//ѧ������
		double sum = 0;//�ɼ��ܺ�
		double avg = 0;//�ɼ�ƽ����
		Scanner input = new Scanner(System.in);//����Scanner����
		for(int i = 1;i <= classNum;i++){
			sum = 0;
			System.out.println("***�������"+i+"���༶�ĳɼ�***");
			for(int j = 1;j <= stuNum;j++){//�ڲ�ѭ������ÿ���༶��ѧ������
				System.out.println("�������"+j+"��ѧԱ�ĳɼ���");
				int score = input.nextInt();
				sum = sum + score;//�ɼ��ۼ����
			}
			avg = sum/stuNum;//����ƽ����
			System.out.println("��"+i+"���༶ѧ����ƽ����Ϊ"+avg+"��");
		}
	}
}
