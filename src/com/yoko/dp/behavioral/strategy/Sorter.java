package com.yoko.dp.behavioral.strategy;

public class Sorter{
	
	//ָ����ǰʹ�õĲ���
	private SortStrategy sortStrategy;
	
	//����
    public void sort() {
	    sortStrategy.sort();
    }

    
    public void setSortStrategy(SortStrategy sort) {
     	this.sortStrategy = sort;
    }
}
