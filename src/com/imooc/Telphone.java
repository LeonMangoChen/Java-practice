package com.imooc;

public class Telphone {
	private float screen;
	private float cpu;
	private float mem;
	
	public void sendMessage(){
		System.out.println("sendMessage");
	}
	
	public float getScreen(){
		return screen;
	}
	
	public void setScreen(float newScreen){
		screen  = newScreen;
	}
	
	public float getCpu() {
		return cpu;
	}

	public void setCpu(float cpu) {
		this.cpu = cpu;
	}

	public float getMem() {
		return mem;
	}

	public void setMem(float mem) {
		this.mem = mem;
	}

	public Telphone(){
		System.out.println("�޲εĹ��췽��ִ���ˣ�");
	}
	public Telphone(float newScreen,float newCpu,float newMem){
		screen = newScreen;
		cpu = newCpu;
		mem = newMem;
		System.out.println("�вεĹ��췽�����ˣ�");
	}
}
