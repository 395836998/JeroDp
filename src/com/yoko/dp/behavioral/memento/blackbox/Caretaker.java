package com.yoko.dp.behavioral.memento.blackbox;

public class Caretaker
{
    /**
     * @link aggregation 
     * @label narrow
     */
    private MementoIF memento;

    public MementoIF retrieveMemento()
    {
        return this.memento;
    }

    public void saveMemento(MementoIF memento)
    {
     	this.memento = memento;
    }
}
