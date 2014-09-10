package com.yoko.dp.behavioral.mediator;


/**
 * �����ͬ�¶���
 * @author Administrator
 *
 */
public class ColleagueA extends AbstractColleague{

	public ColleagueA(AbstractMediator mediator) {
		super(mediator);
	}

	/**
	 * �Լ������Լ���
	 */
	@Override
	void self() {
		System.out.println("ColleagueA self...");
	}

	/**
	 * ��Ҫ��������ͬ�µ�����֪ͨ�н�����
	 */
	@Override
	void other() {
		mediator.execute("A");
	}

}
