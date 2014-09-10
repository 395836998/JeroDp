package com.yoko.dp.creational.builder;

public class HighLevelPhoneBuilder implements PhoneBuilder{

	private Phone phone = new Phone();
	
	@Override
	public void buildCpu() {
		phone.setCpu("iphone cpu...");
	}

	@Override
	public void buildRam() {
		phone.setRam("iphone ram...");
	}

	@Override
	public void buildKey() {
		phone.setKey("iphone key...");
	}

	@Override
	public Phone ship() {
		return phone;
	}


}
