package com.string;

public class OperateString2 {

	public static void main(String[] args) {
		String str = "qwertyauiopasadfghjkalzxacvbnm";
		//���ִ���
		int num = 0;
		//ѭ������ÿ���ַ����ж��Ƿ����ַ�a������ǣ��ۼӴ���
		for(int i = 0;i<str.length();i++){
			//��ȡÿ���ַ����ж��Ƿ����ַ�a
			if(str.charAt(i) == 'a'){//˫���ű���
				//�ۼ�ͳ�ƴ���
				num++;
			}
		}
		System.out.println("�ַ�a���ֵĴ�����"+ num);
	}

}
