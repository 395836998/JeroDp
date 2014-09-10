package com.yoko.dp.behavioral.chain;

public class Request {

	private String param;
	
	private String type;
	
	public Request(String param, String type) {
		super();
		this.param = param;
		this.type = type;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
	
}
