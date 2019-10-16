package com.lifujian.sword.FactoryPattern.model;

import com.lifujian.sword.FactoryPattern.Shape;

public class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Square:[skweə(r)] :正方形");
	}
}
