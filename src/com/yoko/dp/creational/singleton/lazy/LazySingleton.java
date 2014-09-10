package com.yoko.dp.creational.singleton.lazy;

/**
 * ����ʽ����ģʽ
 *
 */
public class LazySingleton {

	private LazySingleton(){
		//˽�й��캯��
	}
	
	public static LazySingleton getInstance() {
		return SingletonHolder.instance;
	}
	
	private static class SingletonHolder {
		//��̬˽����
		static final LazySingleton instance = new LazySingleton();
	}
	
}
