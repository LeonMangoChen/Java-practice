package com.abnormal;

public class TryCatchTest {

	public static void main(String[] args) {
		TryCatchTest tct = new TryCatchTest();
//		int result = tct.test();
//		System.out.println("test()������ִ����ϣ�����ֵΪ��"+ result);
//		int result2 = tct.test2();
		int restlt3 = tct.test3();
		System.out.println("������������㣡test2()ִ����ϣ���~");
	}
	/**
	 * divider(����)
	 * result(���):
	 * ÿ��ѭ����divider��һ��result = result+100/divider
	 * ����������쳣����ӡ������׳��쳣�ˣ�������������-1
	 * ���򣺷���result
	 * */
	public int test(){
		int divider = 10;
		int result = 100;
		try{
			while(divider > -1){
				divider--;
				result = result + 100/divider;
			}
			return result;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("ѭ���׳��쳣�ˣ�����");
			return -1;
		}
	}
	
	/**
	 * divider(����)
	 * result(���):
	 * try-catch����while�쳣
	 * ÿ��ѭ����divider��һ��result = result+100/divider
	 * ����������쳣����ӡ������׳��쳣�ˣ�������������result = 999��
	 * ���򣺷���result
	 * finally����ӡ���������finally������������������ͬʱ��ӡ���result��ֵ
	 * */
	public int test2(){
		int divider = 10;
		int result = 100;
		try{
			while(divider > -1){
				divider--;
				result = result + 100/divider;
			}
			return result;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("ѭ���׳��쳣�ˣ�����");
			return result = 999;
		}finally{
			System.out.println("����finally������������");
			System.out.println("����Result�����ҵ�ֵ�ǣ�"+result);
		}
	}
	
	/**
	 * divider(����)
	 * result(���):
	 * try-catch����while�쳣
	 * ÿ��ѭ����divider��һ��result = result+100/divider
	 * ����������쳣����ӡ������׳��쳣�ˣ���������
	 * ���򣺷���result
	 * finally����ӡ���������finally������������������ͬʱ��ӡ���result��ֵ
	 * ��󷵻�1111��Ϊ���
	 * */
	public int test3(){
		int divider = 10;
		int result = 100;
		try{
			while(divider > -1){
				divider--;
				result = result + 100/divider;
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("ѭ���׳��쳣�ˣ�����");
		}finally{
			System.out.println("����finally������������");
			System.out.println("����Result�����ҵ�ֵ�ǣ�"+result);
		}
		System.out.println("����test3�����������ˣ������ң�����~");
		return 1111;
	}
	
}
