package com.lifujian.sword.FactoryPattern.mian;

import com.lifujian.sword.FactoryPattern.Shape;
import com.lifujian.sword.FactoryPattern.ShapeFactory;

public class factortPatternTest {

	public static void main(String[] args) {
		//我只需要拿到工厂对象，并且知道实际需要的工具的名字
		ShapeFactory shapeFactory = new ShapeFactory();

		//要一个圆形工具
		Shape shapeC = shapeFactory.getShape("Circle");
		shapeC.draw();
		//要一个正方形工具
		Shape shapeS = shapeFactory.getShape("Square");
		shapeS.draw();
		//要一个矩形工具
		Shape shapeR = shapeFactory.getShape("Rectangle");
		shapeR.draw();
	}
}
