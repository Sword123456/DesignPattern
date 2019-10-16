package com.lifujian.sword.AbstractFactoryPattern.AbstractFactory.imple;

import com.lifujian.sword.AbstractFactoryPattern.AbstractFactory.AbstractFactory;
import com.lifujian.sword.AbstractFactoryPattern.Color.Color;
import com.lifujian.sword.AbstractFactoryPattern.Color.imple.Blue;
import com.lifujian.sword.AbstractFactoryPattern.Color.imple.Green;
import com.lifujian.sword.AbstractFactoryPattern.Color.imple.Red;
import com.lifujian.sword.AbstractFactoryPattern.Shape.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeName) {
		return null;
	}

	@Override
	public Color getColor(String colorName) {
		if(colorName==null){
			return null;
		}
		if("Red".equals(colorName)){
			return new Red();
		}else if("Green".equals(colorName)){
			return new Green();
		}else if("Blue".equals(colorName)){
			return new Blue();
		}
		return null;
	}
}
