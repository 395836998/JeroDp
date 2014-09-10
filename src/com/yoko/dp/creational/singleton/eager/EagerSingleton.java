package com.yoko.dp.creational.singleton.eager;

/**
 * ����ʽ����ģʽ
 *
 */
public class EagerSingleton {
	
	//����ؼ�����
	private static EagerSingleton instance = new EagerSingleton();

	private EagerSingleton(){
		//˽�й��캯��
	}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
}
