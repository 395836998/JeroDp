package com.yoko.dp.creational.abstractfactory;

public class IntelComponentFactory implements ComponentFactory {

	@Override
	public Cpu createCpu() {
		return new IntelCpu();
	}

	@Override
	public Ram createRam() {
		return new IntelRam();
	}

}
