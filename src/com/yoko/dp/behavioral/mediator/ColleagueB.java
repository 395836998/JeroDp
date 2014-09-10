package com.yoko.dp.behavioral.mediator;

public class ColleagueB extends AbstractColleague {

	public ColleagueB(AbstractMediator mediator) {
		super(mediator);
	}

	@Override
	void self() {
		System.out.println("ColleagueB self...");
	}

	@Override
	void other() {
		mediator.execute("B");
	}

}
