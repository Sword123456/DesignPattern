package com.lifujian.sword.BridgePattern.mian;

import com.lifujian.sword.AbstractFactoryPattern.Color.imple.Green;
import com.lifujian.sword.BridgePattern.DrawAPI.Impl.GreenCircle;
import com.lifujian.sword.BridgePattern.DrawAPI.Impl.RedCircle;
import com.lifujian.sword.BridgePattern.Shape.Impl.Circle;
import com.lifujian.sword.BridgePattern.Shape.Shape;

public class BridgePatternTest {

	public static void main(String[] args) {
		//桥接模式，就是在抽象层进行聚合，然后在各自的实现类中进行各种实现
		// 在这里,Shape是整体，DrawAPI整体的一部分，组合进去的
		// 使用的时候把部分的实现对象传入整体的实现对象中，达到两个维度灵活组合变化的效果
		Shape redCircle = new Circle(1,1,1,new RedCircle());
		Shape greenCircle = new Circle(1,1,1,new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}

}
