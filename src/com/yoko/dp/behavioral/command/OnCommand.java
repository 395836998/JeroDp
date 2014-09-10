package com.yoko.dp.behavioral.command;

/**
 * ��������
 * @author lyanzhang
 *
 */
public class OnCommand implements Command{

	private Television tv;
	
	public OnCommand(Television tv){
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.turnOn();
	}

}
