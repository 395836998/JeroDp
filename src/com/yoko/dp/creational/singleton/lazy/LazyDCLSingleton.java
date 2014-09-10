package com.yoko.dp.creational.singleton.lazy;

/**
 * ����ʽ����ģʽ
 *
 */
public class LazyDCLSingleton {

	//volatile��̬������jdk1.5+��
	private static volatile LazyDCLSingleton instance = null;
	
	private LazyDCLSingleton(){
		//˽�й��캯��
	}
	
	public static LazyDCLSingleton getInstance() {
		if(instance == null){
			synchronized (LazyDCLSingleton.class) {
				//˫����
                if (instance == null) {
                	instance = new LazyDCLSingleton();  
                }  
            }  
		}
		return instance;
	}
	
}
