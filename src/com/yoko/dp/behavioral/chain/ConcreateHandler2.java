package com.yoko.dp.behavioral.chain;

public class ConcreateHandler2 extends Handler{

	@Override
	public void handle(Request request) {
		handleInner(request);
		handleNext(request);
	}
	
	private void handleInner(Request request){
		if("ok".equals(request.getType())){
			//here goes the code...
			System.out.println("handle concreate2...");
		}
	}

}
