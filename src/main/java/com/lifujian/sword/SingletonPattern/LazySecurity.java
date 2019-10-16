package com.lifujian.sword.SingletonPattern;

public class LazySecurity {
	private static LazySecurity instance;
	private LazySecurity(){}
	public static synchronized LazySecurity getInstance(){
		if(instance == null){
			instance = new LazySecurity();
		}
		return instance;
	}
}
