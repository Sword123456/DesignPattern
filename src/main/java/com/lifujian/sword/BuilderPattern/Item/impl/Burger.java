package com.lifujian.sword.BuilderPattern.Item.impl;

import com.lifujian.sword.BuilderPattern.Item.Item;
import com.lifujian.sword.BuilderPattern.Packing.Packing;
import com.lifujian.sword.BuilderPattern.Packing.impl.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}
	//这个方法在这里没必要，实现类必须实现接口里的所有方法，必须实现抽象类里的所有抽象类
	//抽象类里可以没有抽象方法
	@Override
	public abstract float price();
}
