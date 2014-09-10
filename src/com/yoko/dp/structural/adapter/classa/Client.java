package com.yoko.dp.structural.adapter.classa;

public class Client {

	public static void main(String[] args) {
		Target t = new Adapter();
		t.bite();
	}

}
