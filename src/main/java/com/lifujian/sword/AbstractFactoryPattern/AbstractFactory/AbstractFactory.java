package com.lifujian.sword.AbstractFactoryPattern.AbstractFactory;

import com.lifujian.sword.AbstractFactoryPattern.Color.Color;
import com.lifujian.sword.AbstractFactoryPattern.Shape.Shape;

public abstract class AbstractFactory {

	public abstract Shape getShape(String shapeName);
	public abstract Color getColor(String colorName);

}
