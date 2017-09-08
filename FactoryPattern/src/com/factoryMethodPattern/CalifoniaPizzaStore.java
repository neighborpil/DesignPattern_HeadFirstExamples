package com.factoryMethodPattern;

public class CalifoniaPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if(item.equals("cheese")){
			return new CalifoniaStyleCheesePizza();
		} else{
			return null;
		}
	}

}
