package com.yoko.dp.behavioral.mediator;

public class MediatorTest {

	public static void main(String[] args) {
		
		//����һ����ͣ��
		AbstractMediator med  = new Mediator();
		
		//��������ͬ�£�����ͣ��ָ��������,˵��A��Bͬ����Ҫ��ͣ�ߵ�ͣ
		AbstractColleague a = new ColleagueA(med);
		AbstractColleague b = new ColleagueB(med);
		
		//��ͣ�ߵ�ͣ�������ҪA��B�����飬Ҳ���Լ�������ͬ�£�ֻҪ��ͣ�������Ҫ����
		med.setA(a);
		med.setB(b);
		
		//Aͬ��������ͬ��Э��������
		a.other();
		
		//Bͬ��������ͬ��Э��������
		b.other();
		
		

	}

}
