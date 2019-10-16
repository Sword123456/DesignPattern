package com.lifujian.sword.BuilderPattern.Item.impl.ColdDrinkImpl;

import com.lifujian.sword.BuilderPattern.Item.impl.ColdDrink;

public class Pepsi extends ColdDrink {

	@Override
	public float price() {
		return 8.0f;
	}

	@Override
	public String name() {
		return "Pepsi";
	}
}
