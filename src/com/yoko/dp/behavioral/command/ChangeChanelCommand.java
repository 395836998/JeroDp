package com.yoko.dp.behavioral.command;

public class ChangeChanelCommand implements Command{

	private Television tv;
	
	private int chanel;

	public ChangeChanelCommand(Television tv, int chanel) {
		this.tv = tv;
		this.chanel = chanel;
	}

	@Override
	public void execute() {
		tv.changeChanel(chanel);
	}
	
}
