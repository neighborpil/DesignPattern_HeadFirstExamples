package com.condimentDecorator;

import com.decoration.Beverage;

public class SteamMilk extends CondimentDecorator {

	Beverage beverage;
	
	public SteamMilk(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription() {
		
		return beverage.getDescription() + ", ½ºÆÀ ¹ÐÅ©";
	}

	public double cost() {
		
		return .40 + beverage.cost();
	}

}
