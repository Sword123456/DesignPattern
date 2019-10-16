package com.lifujian.sword.AbstractFactoryPattern.Color.imple;

import com.lifujian.sword.AbstractFactoryPattern.Color.Color;

public class Red implements Color {
	@Override
	public void fill() {
		System.out.println("Red:红色");
	}
}
