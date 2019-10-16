package com.lifujian.sword.DecoratorPattern.Shape.ShapeDecorator;

import com.lifujian.sword.DecoratorPattern.Shape.Shape;

public abstract class ShapeDecorator implements Shape{
	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape){
		this.decoratedShape = decoratedShape;
	}

	public void draw(){
		decoratedShape.draw();
	}
}
