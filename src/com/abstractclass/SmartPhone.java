package com.abstractclass;

public class SmartPhone extends Telphone implements IPlayGame{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("ͨ����������绰");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("ͨ��������������");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("����������Ϸ�Ĺ���");
	}

}
