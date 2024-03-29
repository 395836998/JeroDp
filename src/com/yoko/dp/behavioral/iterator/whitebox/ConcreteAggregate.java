package com.yoko.dp.behavioral.iterator.whitebox;

public class ConcreteAggregate extends Aggregate
{
    private Object objs[]= {"Monk Tang",
        "Monkey", "Pigsy",
        "Sandy", "Horse"};

    public Iterator createIterator()
    {
    	//������һ���ⲿ�ɼ�ĵ����
        return new ConcreteIterator(this);
    }

    public Object getElement(int index)
    {
		if (index < objs.length)
        {
			return objs[index];
        }
        else
        {
            return null;
        }
    }

    public int size()
    {
		return objs.length;
    }
}
