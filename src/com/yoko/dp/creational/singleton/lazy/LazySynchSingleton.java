package com.yoko.dp.creational.singleton.lazy;

/**
 * ����ʽ����ģʽ
 *
 */
public class LazySynchSingleton {

	private static LazySynchSingleton instance = null;
	
	private LazySynchSingleton(){
		//˽�й��캯��
	}
	
	public synchronized static LazySynchSingleton getInstance() {
		//ͬ������
		if(instance == null){
			instance = new LazySynchSingleton();
		}
		return instance;
	}
	
}
