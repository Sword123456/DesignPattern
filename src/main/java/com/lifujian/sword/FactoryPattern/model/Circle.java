package com.lifujian.sword.FactoryPattern.model;

import com.lifujian.sword.FactoryPattern.Shape;

public class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Circle :我会读:圆形");
	}
}
