package com.lifujian.sword.BuilderPattern.Item.impl.ColdDrinkImpl;

import com.lifujian.sword.BuilderPattern.Item.impl.ColdDrink;

public class Coke extends ColdDrink {

	@Override
	public float price() {
		return 10.0f;
	}

	@Override
	public String name() {
		return "Coke";
	}
}
