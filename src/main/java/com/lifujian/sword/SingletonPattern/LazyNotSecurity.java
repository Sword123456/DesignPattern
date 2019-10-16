package com.lifujian.sword.SingletonPattern;

public class LazyNotSecurity {
	private static LazyNotSecurity instance;
	// 只生产一个实例的保障
	private LazyNotSecurity(){}
	public static LazyNotSecurity getInstance(){
		if(instance==null){
			System.out.println("线程"+Thread.currentThread().getName()+"创造了一个LazyNotSecurity实例");
			instance = new LazyNotSecurity();
		}
		return instance;
	}
	public void say(){
		System.out.println("线程"+Thread.currentThread().getName()+"让LazyNotSecurity开口说！"+instance.toString());
	}

}
