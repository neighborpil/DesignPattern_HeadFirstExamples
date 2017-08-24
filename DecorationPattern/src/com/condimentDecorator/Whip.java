package com.condimentDecorator;

import com.decoration.Beverage;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription() {
		
		return beverage.getDescription() + ", »÷«Œ ≈©∏≤";
	}

	public double cost() {
		
		return .30 + beverage.cost();
	}

}
