package com.decoration;

public class Espresso extends Beverage {

	public Espresso(){
		description = "에스프레소";
	}
	
	/**
	 * 첨가물의 가격을 더하는 것은 걱정 할 필요가 없다
	 * 그냥 에스프레소 가격 1.99를 리턴하기만 하면 된다
	 */
	@Override
	public double cost() {
		return 1.99;
	}

}
