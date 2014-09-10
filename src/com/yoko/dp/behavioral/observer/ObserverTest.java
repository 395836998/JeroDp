package com.yoko.dp.behavioral.observer;

public class ObserverTest {

	public static void main(String[] args) {
		
		Subject sub = new Subject();
		
		sub.addObserver(new SubjectObserver());
		
		sub.doSomething();
	}

}
