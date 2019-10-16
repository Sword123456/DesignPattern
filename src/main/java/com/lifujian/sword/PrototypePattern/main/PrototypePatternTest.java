package com.lifujian.sword.PrototypePattern.main;

import com.lifujian.sword.PrototypePattern.Shape;
import com.lifujian.sword.PrototypePattern.ShapeCache;

public class PrototypePatternTest {

	public static void main(String[] args) {
		//加载缓存，这与JVM会自动维护八种基本类型的常量池的实现思想是相似的
		/*
		*
		public static void main(String[] args) {
    	Integer i1 = 127;
    	Integer i2 = 127;
    	System.err.println(i1 == i2);

    	i1 = 128;
    	i2 = 128;
    	System.err.println(i1 == i2);
		}
		*
		* int常量池中初始化-128~127的范围
		* 查看Integer类源码，发现里面有一个私有的静态内部类IntegerCache
		* */
		ShapeCache.loadCache();

		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());

		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());

		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());

	}
}
