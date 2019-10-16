package com.lifujian.sword.AbstractFactoryPattern.Shape.imple;

import com.lifujian.sword.AbstractFactoryPattern.Shape.Shape;

public class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Square:[skweə(r)] :正方形");
	}
}
