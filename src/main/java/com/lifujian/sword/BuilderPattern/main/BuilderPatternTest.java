package com.lifujian.sword.BuilderPattern.main;

import com.lifujian.sword.BuilderPattern.Meal.Meal;
import com.lifujian.sword.BuilderPattern.Meal.MealBuilder;

import java.sql.SQLOutput;

public class BuilderPatternTest {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost:"+ vegMeal.getCost());

		Meal nonMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Non Meal");
		nonMeal.showItems();
		System.out.println("Total Cost:"+ nonMeal.getCost());

		Meal fullSetMeal= mealBuilder.prepareFullSetMeal();
		System.out.println("Full Set Meal");
		nonMeal.showItems();
		System.out.println("Total Cost:"+ fullSetMeal.getCost());

		/**
		 * 总结：MealBuilding具有灵活性，属于全局的组合可变的创建者，
		 * 其余一层一层的进行实体的的构建，构建好的实体是不变的，这些实体继承与一个接口，
		 * 由一个接口组合起来
		 *
		 * 程序扩展及实现思路
		 *
		 * 建造者模式举例：去肯德基点餐，我们可以认为点餐就属于一个建造订单的过程。
		 * 我们点餐的顺序是无关的，点什么东西也是没有要求的，可以单点，也可以点套餐，
		 * 也可以套餐加单点，但是最后一定要点确认来完成订单。
		 * */
	}
}
