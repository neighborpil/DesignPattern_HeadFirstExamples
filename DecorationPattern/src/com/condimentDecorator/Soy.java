package com.condimentDecorator;

import com.decoration.Beverage;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription() {
		
		return beverage.getDescription() + ", µŒ¿Ø";
	}

	public double cost() {
		
		return .50 + beverage.cost();
	}

}
