package com.lifujian.sword.SingletonPattern;


//优先建议使用标准饿汉式的单例模式实现方式，简单但会浪费内存
public class NotLazySecurity {
	private static NotLazySecurity instance = new NotLazySecurity();
	private NotLazySecurity(){}
	public static NotLazySecurity getInstance(){
		return instance;
	}
	public void say(){
		System.out.println("线程"+Thread.currentThread().getName()+"让NotLazySecurity开口说！"+instance.toString());
	}
}
