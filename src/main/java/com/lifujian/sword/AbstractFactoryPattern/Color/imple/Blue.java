package com.lifujian.sword.AbstractFactoryPattern.Color.imple;

import com.lifujian.sword.AbstractFactoryPattern.Color.Color;

public class Blue implements Color {
	@Override
	public void fill() {
		System.out.println("Blue:蓝色");
	}
}
