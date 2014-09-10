package com.yoko.dp.creational.builder;

public class Client {

	public static void main(String[] args) {
		
		PhoneBuilder builder1 = new NormalPhoneBuilder();
		PhoneBuilder builder2 = new HighLevelPhoneBuilder();
		
		Director director = new Director();
		director.construct(builder1);
		
		Phone phone1 = builder1.ship();
		phone1.show();
		
		director.construct(builder2);
		Phone phone2 = builder2.ship();
		phone2.show();
	}

}
