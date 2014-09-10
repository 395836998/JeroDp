package com.yoko.dp.behavioral.mediator;

/**
 * ͬ�µĳ������
 * @author Administrator
 *
 */
public abstract class AbstractColleague {
	
	//������һ���н��߶���
	AbstractMediator mediator;
	
	public AbstractColleague(AbstractMediator mediator){
		this.mediator = mediator;
	}

	//���Լ��ķ���
	abstract void self();
	
	//����Ҫ��������ͬ�µķ���
	abstract void other();
}
