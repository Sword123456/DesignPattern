package com.lifujian.sword.DecoratorPattern.Shape.ShapeDecorator.Impl;

import com.lifujian.sword.DecoratorPattern.Shape.Shape;
import com.lifujian.sword.DecoratorPattern.Shape.ShapeDecorator.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape){
		System.out.println("Border Color: Red");
	}
}
