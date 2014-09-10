package com.yoko.dp.creational.builder;

public class Phone {

	private String cpu;
	private String ram;
	private String key;
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	public void show(){
		System.out.println("this phone with cpu:" + cpu
				+ "; ram:" + ram 
				+ "; key:" + key);
	}
	
}
