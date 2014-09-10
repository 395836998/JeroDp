package com.yoko.dp.creational.abstractfactory;

public class AmdComponentFactory implements ComponentFactory{

	@Override
	public Cpu createCpu() {
		return new AmdCpu();
	}

	@Override
	public Ram createRam() {
		return new AmdRam();
	}

}
