package com.yoko.dp.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * �۲���
 * @author Administrator
 *
 */
public class SubjectObserver implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		//��ӡ���۲���
		System.out.println(o.getClass());
		//��ӡ����
		System.out.println(arg);
	}

}
