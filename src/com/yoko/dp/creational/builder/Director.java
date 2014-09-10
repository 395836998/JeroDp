package com.yoko.dp.creational.builder;

public class Director {

	protected void construct(PhoneBuilder builder){
		builder.buildCpu();
		builder.buildKey();
		builder.buildRam();
	}
}
