package com.yoko.dp.behavioral.command;

/**
 * ������
 * @author lyanzhang
 *
 */
public class Television {

	private int chanel;
	
	public Television(int chanel){
		this.chanel = chanel;
	}
	
	protected void turnOn(){
		System.out.println("tv turnning on...");
	}
	
	protected void turnOff(){
		System.out.println("tv turnning off...");
	}
	
	protected void changeChanel(int chanel){
		System.out.println("tv changing chanel from " + this.chanel + " to " + chanel + " ...");
		this.chanel = chanel;
	}
}
