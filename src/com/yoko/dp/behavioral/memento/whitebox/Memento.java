package com.yoko.dp.behavioral.memento.whitebox;

/**
 * ����¼����
 * @author Administrator
 *
 */
public class Memento {
	
    private String state;

    public Memento(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return this.state;
    }

    public void setState(String state)
    {
        this.state = state;
    }
}
