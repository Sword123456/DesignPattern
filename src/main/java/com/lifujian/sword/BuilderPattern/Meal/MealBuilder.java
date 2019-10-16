package com.lifujian.sword.BuilderPattern.Meal;

import com.lifujian.sword.BuilderPattern.Item.Item;
import com.lifujian.sword.BuilderPattern.Item.impl.BurgerImpl.ChickenBurger;
import com.lifujian.sword.BuilderPattern.Item.impl.BurgerImpl.VegBurger;
import com.lifujian.sword.BuilderPattern.Item.impl.ColdDrinkImpl.Coke;
import com.lifujian.sword.BuilderPattern.Item.impl.ColdDrinkImpl.Pepsi;

public class MealBuilder {

	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

	public Meal prepareNonVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareFullSetMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		meal.addItem(new Coke());
		return meal;
	}


}
