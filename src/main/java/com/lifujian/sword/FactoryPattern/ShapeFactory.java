package com.lifujian.sword.FactoryPattern;

import com.lifujian.sword.FactoryPattern.model.Circle;
import com.lifujian.sword.FactoryPattern.model.Rectangle;
import com.lifujian.sword.FactoryPattern.model.Square;

public class ShapeFactory {
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
}
