package com.yoko.dp.structural.composite.safe.transparent;

import java.util.Enumeration;

public interface Component {
	
	/**
	 * ͸�������ģʽ���������൱����׼����Դ�
	 * ��������б�׼����ķ���������Ҷ�Ӷ������ѡ��֧���������Ϲ���
	 */
    void sampleOperation();

    Composite getComposite();

    void add(Component component);

    void remove(Component component);

    Enumeration components();
}
