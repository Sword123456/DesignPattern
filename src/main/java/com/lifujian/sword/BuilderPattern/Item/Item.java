package com.lifujian.sword.BuilderPattern.Item;

import com.lifujian.sword.BuilderPattern.Packing.Packing;

//食物条目
public interface Item {
	public String name();
	public Packing packing();
	public float price();
}
