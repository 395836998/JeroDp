package com.yoko.dp.creational.factorymethod;

public class Client {

	public static void main(String[] args) {
		
		Creator creatorA = new CreatorA();
		Product proA = creatorA.createProduct();
		proA.toString();
		
		Creator creatorB = new CreatorB();
		Product proB = creatorB.createProduct();
		proB.toString();
		
	}
}
