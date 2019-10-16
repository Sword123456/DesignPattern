package com.lifujian.sword.BuilderPattern.Item.impl.BurgerImpl;

import com.lifujian.sword.BuilderPattern.Item.impl.Burger;

public class VegBurger extends Burger {
	@Override
	public float price() {
		return 20.00f;
	}

	@Override
	public String name() {
		return "Veg Burger";
	}
}
