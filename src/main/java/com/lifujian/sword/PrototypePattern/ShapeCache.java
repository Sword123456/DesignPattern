package com.lifujian.sword.PrototypePattern;

import java.util.Hashtable;


//原型模式的核心实现，像极了化缓存技术，在程序第一次调用的时候开销比较大，后面开销会减少
//一定程度上提高了客户的使用体验
public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	// 对每种形状都运行数据库查询，并创建该形状
	// shapeMap.put(shapeKey, shape);
	// 例如，我们要添加三种形状
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(),circle);

		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(),square);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(),rectangle);
	}
}
