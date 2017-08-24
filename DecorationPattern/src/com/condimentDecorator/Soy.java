package com.condimentDecorator;

import com.decoration.Beverage;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription() {
		
		return beverage.getDescription() + ", ����";
	}

	public double cost() {
		
		return .50 + beverage.cost();
	}

}
