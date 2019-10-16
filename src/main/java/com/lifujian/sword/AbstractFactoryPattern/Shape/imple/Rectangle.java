package com.lifujian.sword.AbstractFactoryPattern.Shape.imple;

import com.lifujian.sword.AbstractFactoryPattern.Shape.Shape;

public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Rectangle:[ˈrektæŋɡl]:矩形");
	}
}
