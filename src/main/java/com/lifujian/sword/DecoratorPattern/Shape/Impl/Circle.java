package com.lifujian.sword.DecoratorPattern.Shape.Impl;

import com.lifujian.sword.DecoratorPattern.Shape.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Circle");
	}
}
