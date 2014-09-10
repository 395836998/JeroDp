package com.yoko.dp.creational.builder;

public class NormalPhoneBuilder implements PhoneBuilder{

	private Phone phone = new Phone();
	
	@Override
	public void buildCpu() {
		phone.setCpu("normal cpu...");
	}

	@Override
	public void buildRam() {
		phone.setRam("noraml ram...");
	}

	@Override
	public void buildKey() {
		phone.setKey("normal key...");
	}

	@Override
	public Phone ship() {
		return phone;
	}


}
