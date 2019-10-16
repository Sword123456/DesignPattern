package com.lifujian.sword.BuilderPattern.Item.impl.BurgerImpl;

import com.lifujian.sword.BuilderPattern.Item.impl.Burger;

public class ChickenBurger extends Burger {
	@Override
	public float price() {
		return 25.00f;
	}

	@Override
	public String name() {
		return "Chicken Burger";
	}
}
