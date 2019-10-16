package com.lifujian.sword.BuilderPattern.Item.impl;

import com.lifujian.sword.BuilderPattern.Item.Item;
import com.lifujian.sword.BuilderPattern.Packing.Packing;
import com.lifujian.sword.BuilderPattern.Packing.impl.Bottle;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
