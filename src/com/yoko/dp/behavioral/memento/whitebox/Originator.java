package com.yoko.dp.behavioral.memento.whitebox;

/**
 * ��Ҫ����Ķ���
 * @author Administrator
 *
 */
public class Originator {
	
    private String state;

    //��������
    public Memento createMemento()
    {
        return new Memento(state);
    }

    //�ӱ����лָ�״̬
    public void restoreMemento(Memento memento)
    {
        this.state = memento.getState();
    }

    public String getState()
    {
        return this.state;
    }

    public void setState(String state)
    {
        this.state = state;
        System.out.println("Current state = " + this.state);
    }
}
