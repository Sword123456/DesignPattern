package com.lifujian.sword.SingletonPattern;

//
// 这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
// 这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
public class LazySecurityQuicklyStaticInnerClass {
	private static class LazySecurityQuicklyStaticInnerClassHolder{
		private static final LazySecurityQuicklyStaticInnerClass INSTANCE = new LazySecurityQuicklyStaticInnerClass();
	}
	private LazySecurityQuicklyStaticInnerClass(){}
	//双重校验同步的方式
	public static final LazySecurityQuicklyStaticInnerClass getInstance(){
		return LazySecurityQuicklyStaticInnerClassHolder.INSTANCE;
	}
}
