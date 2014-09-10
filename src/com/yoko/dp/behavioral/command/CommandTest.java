package com.yoko.dp.behavioral.command;

/**
 * �ͻ���
 * @author lyanzhang
 *
 */
public class CommandTest {
	
	public static void main(String[] args){

		Television tv = new Television(7);
		
		Command on = new OnCommand(tv);
		Command off = new OffCommand(tv);
		Command change = new ChangeChanelCommand(tv, 2);

		Controllor controllor = new Controllor(on, off, change);
		controllor.turnOn();
		controllor.changeChanel();
		controllor.turnOff();
		
	}
}
