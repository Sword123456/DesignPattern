package com.lifujian.sword.DecoratorPattern.mian;

import com.lifujian.sword.DecoratorPattern.Shape.Impl.Circle;
import com.lifujian.sword.DecoratorPattern.Shape.Impl.Rectangle;
import com.lifujian.sword.DecoratorPattern.Shape.Shape;
import com.lifujian.sword.DecoratorPattern.Shape.ShapeDecorator.Impl.RedShapeDecorator;
import com.lifujian.sword.DecoratorPattern.Shape.ShapeDecorator.ShapeDecorator;

public class DecoratorPatternTest {

//装饰器的关键是：装饰器实现了需要装饰对象的基本属性，并持有一个装饰对象的引用
	//装饰器的具体装饰功能是由装饰器的子类进行实现的
//与桥接模式相比都实现了两个维度的灵活变化组合时
	//可以扩展一个类的功能，更加灵活
	public static void main(String[] args) {

		Shape circle = new Circle();
		ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
		ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
		//Shape redCircle = new RedShapeDecorator(new Circle());
		//Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}
}
