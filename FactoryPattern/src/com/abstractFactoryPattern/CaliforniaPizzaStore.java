package com.abstractFactoryPattern;

public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();
		
		if(item.equals("cheese")){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("California Cheese Pizza");
		} else if(item.equals("veggie")){
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("California Veggie Pizza");
		} else if(item.equals("pepperoni")){
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("California Pepperoni Pizza");
		} else if(item.equals("clam")){
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("California Clam Pizza");
		} 
		
		return pizza;
	}

}
