package com.yoko.dp.behavioral.mediator;

/**
 * �н��߳������
 * @author Administrator
 *
 */
public abstract class AbstractMediator {

	//�н�����Ҫ֪��������ͣͬ�µ���ϵ��ʽ
	AbstractColleague a;
	
	AbstractColleague b;

	//�н�����Ҫ�е�ͣ����
	abstract void execute(String type);
	
	public AbstractColleague getA() {
		return a;
	}

	public void setA(AbstractColleague a) {
		this.a = a;
	}

	public AbstractColleague getB() {
		return b;
	}

	public void setB(AbstractColleague b) {
		this.b = b;
	}
	
	
	
}
