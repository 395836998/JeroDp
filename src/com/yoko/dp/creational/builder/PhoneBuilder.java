package com.yoko.dp.creational.builder;

public interface PhoneBuilder {

	void buildCpu();
	
	void buildRam();
	
	void buildKey();
	
	Phone ship();
}
