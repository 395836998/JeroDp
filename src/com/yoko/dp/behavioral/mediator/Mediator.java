package com.yoko.dp.behavioral.mediator;

/**
 * �����н��߶���
 * @author Administrator
 *
 */
public class Mediator extends AbstractMediator{
	
	/**
	 * �÷�����Ҫ��ɸ��ӵ��߼����ã����н��ͣA��B֮�佻���߼�
	 * ����Ľ�������ϸ����AB���Եķ���ʵ��
	 */
	@Override
	void execute(String type) {

		if("A".equals(type)){
			this.a.self();
			this.b.self();
		}else{
			this.b.self();
			this.a.self();
		}
		
	}

}
