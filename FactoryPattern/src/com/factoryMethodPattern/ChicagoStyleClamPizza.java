package com.factoryMethodPattern;

public class ChicagoStyleClamPizza extends Pizza {

	public ChicagoStyleClamPizza(){
		name = "Chicago Style Clam Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Frozen Clam from Chesapeake Bay");
	}
	
	void cut(){
		System.out.println("Cutting the pizza square slices");
	}
}
