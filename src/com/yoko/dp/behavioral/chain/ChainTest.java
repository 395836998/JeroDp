package com.yoko.dp.behavioral.chain;

public class ChainTest {

	public static void main(String[] args) {
		Handler one = new ConcreateHandler1();
		Handler two = new ConcreateHandler2();
		Handler three = new ConcreateHandler2();
		
		one.setNext(two);
		two.setNext(three);
		
		one.handle(new Request("ok", "handler1"));
	}

}
