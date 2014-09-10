package com.yoko.dp.structural.adapter.objecta;

public class Client {

	public static void main(String[] args) {
		Target t = new Adapter(new Adaptee());
		t.bite();
	}

}
