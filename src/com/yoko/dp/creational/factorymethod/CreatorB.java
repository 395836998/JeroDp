package com.yoko.dp.creational.factorymethod;

public class CreatorB implements Creator {

	@Override
	public Product createProduct() {
		return new ProductB();
	}

}
