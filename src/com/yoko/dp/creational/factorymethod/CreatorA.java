package com.yoko.dp.creational.factorymethod;

public class CreatorA implements Creator {

	@Override
	public Product createProduct() {
		return new ProductA();
	}

}
