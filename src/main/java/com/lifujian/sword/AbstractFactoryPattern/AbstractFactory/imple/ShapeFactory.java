package com.lifujian.sword.AbstractFactoryPattern.AbstractFactory.imple;

import com.lifujian.sword.AbstractFactoryPattern.AbstractFactory.AbstractFactory;
import com.lifujian.sword.AbstractFactoryPattern.Color.Color;
import com.lifujian.sword.AbstractFactoryPattern.Shape.Shape;
import com.lifujian.sword.AbstractFactoryPattern.Shape.imple.Rectangle;
import com.lifujian.sword.AbstractFactoryPattern.Shape.imple.Circle;
import com.lifujian.sword.AbstractFactoryPattern.Shape.imple.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeName){
		if(shapeName==null){
			return null;
		}
		if("Rectangle".equals(shapeName)){
			return new Rectangle();
		}else if("Square".equals(shapeName)){
			return new Square();
		}else if("Circle".equals(shapeName)){
			return new Circle();
		}
		return null;
	}

	@Override
	public Color getColor(String colorName) {
		return null;
	}
}
