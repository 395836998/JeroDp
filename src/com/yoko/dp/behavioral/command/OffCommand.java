package com.yoko.dp.behavioral.command;

public class OffCommand implements Command{

	private Television tv;
	
	public OffCommand(Television tv){
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.turnOff();
	}

}
