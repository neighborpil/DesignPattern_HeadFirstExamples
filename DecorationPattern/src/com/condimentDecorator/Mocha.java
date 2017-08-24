package com.condimentDecorator;

import com.decoration.Beverage;

/**
 * 모카는 데코레이터이기 때문에 CondimentDecorator를 확장한다
 */
public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription() {
		
		return beverage.getDescription() + ", 모카";
	}

	public double cost() {
		
		return .20 + beverage.cost();
	}

}
