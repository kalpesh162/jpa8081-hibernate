package com.app;

import com.dao.Coffee;
import com.dao.CoffeeFactory;

public class App {
	
	public static void main(String[] args) {
		Coffee coffee=CoffeeFactory.getCoffee("latte");
		
		coffee.brew();
	}

}
