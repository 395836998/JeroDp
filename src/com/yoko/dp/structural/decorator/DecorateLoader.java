package com.yoko.dp.structural.decorator;

public class DecorateLoader implements Loader{

	private Loader loader;
	
	public DecorateLoader(Loader loader) {
		this.loader = loader;
	}

	@Override
	public void load() {
		loadBefore();
		doLoad();
		loadAfter();
	}
	
	private void doLoad(){
		loader.load();
	}
	
	private void loadBefore(){
		//��ǿ
	}

	private void loadAfter(){
		//��ǿ
	}

}
