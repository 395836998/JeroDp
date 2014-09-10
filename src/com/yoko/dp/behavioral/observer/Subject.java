package com.yoko.dp.behavioral.observer;

import java.util.Observable;

/**
 * ���۲���
 * @author Administrator
 *
 */
public class Subject extends Observable{

	public void doSomething(){
		//���۲��߸ı���
		setChanged();
		//֪ͨ�۲���
		notifyObservers("aaa");
		
	}
}
