package com.abstractclass;

public class SmartPhone extends Telphone implements IPlayGame{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("通过语音来打电话");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("通过语音来发短信");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("具有了玩游戏的功能");
	}

}
