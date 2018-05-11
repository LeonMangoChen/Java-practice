package com.commonclass;

public class UseMath {

	public static void main(String[] args) {
		double a = 12.81;//����һ��double���ͱ���
		int b = (int) a;//��double����ǿ��ת��Ϊint���ͣ�ȥ��С��λ
		System.out.println("��double��������12.81ǿ��ת��Ϊint����:" + b);
		long c = Math.round(a);//����round������������������
		System.out.println("��double��������12.81������������" + c);
		double d = Math.floor(a);//����floor����������С�ڲ������������
		System.out.println("floor:" + d);
		double e = Math.ceil(a);//����ceil���������ش��ڲ�������С����
		System.out.println("ceil:" + e);
		double x = Math.random();//����random����������[0,1]֮������������
		System.out.println("�����" + x);
		int y = (int) (Math.random()*99);//����[0,99]֮����������
		System.out.println("����[0,99]֮����������" + y);
		
		int[] nums = new int[10];//����һ���������飬����Ϊ10
		//ͨ��ѭ�������鸴��
		for(int i = 0;i < nums.length;i++){
			int randomNum = (int) (Math.random()*10);//����10���ڵ������
			nums[i] = randomNum;//ΪԪ�ظ�ֵ
		}
		//ʹ��foreachѭ����������е�Ԫ��
		for(int num :nums){
			System.out.print(num+ " ");
		}
	}

}
