package com.lifujian.sword.AbstractFactoryPattern.Shape.imple;

import com.lifujian.sword.AbstractFactoryPattern.Shape.Shape;

public class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Circle :我会读:圆形");
	}
}
