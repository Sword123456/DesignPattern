package com.lifujian.sword.AbstractFactoryPattern.mian;

import com.lifujian.sword.AbstractFactoryPattern.AbstractFactory.AbstractFactory;
import com.lifujian.sword.AbstractFactoryPattern.Color.Color;
import com.lifujian.sword.AbstractFactoryPattern.Shape.Shape;
import com.lifujian.sword.AbstractFactoryPattern.SuperFactory;

public class SuperFactoryTest {

	public static void main(String[] args) {
		SuperFactory superFactory = new SuperFactory();
		AbstractFactory shapeFactory = superFactory.getAbstractFactory("Shape");
		Shape shape = shapeFactory.getShape("Circle");
		shape.draw();
		//简洁的调用方式
		superFactory.getAbstractFactory("Shape").getShape("Rectangle").draw();

		AbstractFactory colorFactory = superFactory.getAbstractFactory("Color");
		Color color = colorFactory.getColor("Red");
		color.fill();

	}


}
