package com.decoration;


public abstract class Beverage {
	String description = "���� ����";
	
	/**
	 * �̹� �����Ǿ� �ִ�
	 * @return
	 */
	public String getDescription(){
		return description;
	}
	
	/**
	 * ����Ŭ�������� �����Ͽ��� �Ѵ�
	 * @return
	 */
	public abstract double cost();
}
