package com.yoko.dp.structural.adapter.classa;

public class Adapter extends Adaptee implements Target {

	@Override
	public void sing() {
		
	}

	@Override
	public void bite() {
		//����
		this.wang();
	}
	
}
