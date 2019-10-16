package com.lifujian.sword.SingletonPattern;

public class LazySecurityQuickly {
	private static LazySecurityQuickly instance;
	private LazySecurityQuickly(){}
	//双重校验同步的方式
	public static LazySecurityQuickly getInstance(){
		if(instance == null){
			synchronized (LazySecurityQuickly.class){
				if(instance == null){
					instance = new LazySecurityQuickly();
				}
			}
		}
		return instance;
	}
}
