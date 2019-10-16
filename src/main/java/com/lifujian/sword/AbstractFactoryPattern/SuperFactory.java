package com.lifujian.sword.AbstractFactoryPattern;

import com.lifujian.sword.AbstractFactoryPattern.AbstractFactory.AbstractFactory;
import com.lifujian.sword.AbstractFactoryPattern.AbstractFactory.imple.ColorFactory;
import com.lifujian.sword.AbstractFactoryPattern.AbstractFactory.imple.ShapeFactory;

public class SuperFactory {

	public AbstractFactory getAbstractFactory(String factoryName){
		if(factoryName==null){
			return null;
		}
		if("Shape".equals(factoryName)){
			return new ShapeFactory();
		}else if("Color".equals(factoryName)){
			return new ColorFactory();
		}
		return null;
		// AbstractFactory abstractFactory =null;
		// switch(factoryName){
		// 	case "Shape":
		// 		abstractFactory = new ShapeFactory();
		// 		break;
		// 	case "Color":
		// 		abstractFactory = new ColorFactory();
		// 		break;
		// }
		// return abstractFactory;
	}
}
