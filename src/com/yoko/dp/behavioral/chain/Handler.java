package com.yoko.dp.behavioral.chain;

public abstract class Handler {

	protected Handler next;

	public Handler getNext() {
		return next;
	}

	public void setNext(Handler next) {
		this.next = next;
	}
	
	protected void handleNext(Request request){
		if(next != null){
			next.handle(request);
		}
	}
	
	public abstract void handle(Request request);
}
