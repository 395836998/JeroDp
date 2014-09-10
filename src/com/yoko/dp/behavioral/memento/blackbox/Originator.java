package com.yoko.dp.behavioral.memento.blackbox;

public class Originator
{
    public Originator()
    {
    }

    private String state;

    //������Ǻ���ӿ�
	public MementoIF createMemento()
	{
		return new Memento( this.state );
	}
	
	//�ָ���Ҳ�Ǻ������
	public void restoreMemento( MementoIF memento)
	{
        Memento aMemento = (Memento) memento;

		this.setState( aMemento.getState() );
	}

    public String getState()
    {
        return this.state;
    }

    public void setState(String state)
    {
        this.state = state;
        System.out.println("state = " + state);
    }
	
    /**
     * ���䱸�����
     * @author Administrator
     *
     */
	class Memento implements MementoIF {
		private String savedState;
		
		private Memento(String someState)
		{
			savedState = someState;
		}

		private String getState()
		{
			return savedState;
        }
	}
}
