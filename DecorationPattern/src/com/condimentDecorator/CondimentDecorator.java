package com.condimentDecorator;

import com.decoration.Beverage;

public abstract class CondimentDecorator extends Beverage {

	/**
	 * ��� ÷���� ���ڷ����Ϳ���
	 * getDescription()�޼ҵ带 ���� �����ϵ��� ���� ��ȹ
	 * �׷��� �߻� �޼ҵ�� ����
	 */
	public abstract String getDescription();

}
