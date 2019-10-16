package com.lifujian.sword.DecoratorPattern.Shape.Impl;

import com.lifujian.sword.DecoratorPattern.Shape.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}
}
