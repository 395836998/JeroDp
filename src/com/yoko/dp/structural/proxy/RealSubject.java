package com.yoko.dp.structural.proxy;

public class RealSubject extends Subject 
{
	public RealSubject()
	{ 
	}
	
	public void request()
	{ 
		System.out.println("From real subject.");
	}
}
