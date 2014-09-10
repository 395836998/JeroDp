package com.yoko.dp.behavioral.command;

/**
 * ������
 * @author lyanzhang
 *
 */
public class Controllor {

	private Command on;
	private Command off;
	private Command change;
	
	public Controllor(Command on, Command off, Command change) {
		this.on = on;
		this.off = off;
		this.change = change;
	}

	public void turnOn(){
		on.execute();
	}

	public void turnOff(){
		off.execute();
	}

	public void changeChanel(){
		change.execute();
	}
	
}
