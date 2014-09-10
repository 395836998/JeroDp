package com.yoko.dp.behavioral.memento.whitebox;

/**
 * ���汸�����
 * @author Administrator
 *
 */
public class Caretaker {
	
    private Memento memento;

    public Memento retrieveMemento()
    {
        return this.memento;
    }

    public void saveMemento(Memento memento)
    {
     	this.memento = memento;
    }
}
