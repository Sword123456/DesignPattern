package com.lifujian.sword.FactoryPattern.model;

import com.lifujian.sword.FactoryPattern.Shape;

public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Rectangle:[ˈrektæŋɡl]:矩形");
	}
}
