package com.decoration;

public class Espresso extends Beverage {

	public Espresso(){
		description = "����������";
	}
	
	/**
	 * ÷������ ������ ���ϴ� ���� ���� �� �ʿ䰡 ����
	 * �׳� ���������� ���� 1.99�� �����ϱ⸸ �ϸ� �ȴ�
	 */
	@Override
	public double cost() {
		return 1.99;
	}

}
