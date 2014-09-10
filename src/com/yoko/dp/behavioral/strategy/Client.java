package com.yoko.dp.behavioral.strategy;

public class Client {
	
	public static void main(String[] args) {
		
		Sorter s = new Sorter();
		s.setSortStrategy(new BubbleSort());
		s.sort();
		
		s.setSortStrategy(new HeapSort());
		s.sort();
		
		s.setSortStrategy(new QuickSort());
		s.sort();
	}

}
