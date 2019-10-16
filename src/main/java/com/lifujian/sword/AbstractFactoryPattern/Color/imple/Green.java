package com.lifujian.sword.AbstractFactoryPattern.Color.imple;

import com.lifujian.sword.AbstractFactoryPattern.Color.Color;

public class Green implements Color {
	@Override
	public void fill() {
		System.out.println("Green:绿色");
	}
}
