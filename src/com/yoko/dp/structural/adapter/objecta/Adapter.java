package com.yoko.dp.structural.adapter.objecta;

public class Adapter implements Target {
	
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee){
		super();
		this.adaptee = adaptee;
	}

	@Override
	public void sing() {
		
	}

	@Override
	public void bite() {
		//����
		adaptee.wang();
	}
}
