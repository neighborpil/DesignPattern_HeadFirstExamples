package com.decoration;


public abstract class Beverage {
	String description = "제목 없음";
	
	/**
	 * 이미 구현되어 있다
	 * @return
	 */
	public String getDescription(){
		return description;
	}
	
	/**
	 * 서브클래스에서 구현하여야 한다
	 * @return
	 */
	public abstract double cost();
}
