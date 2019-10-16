package com.lifujian.sword.SingletonPattern.mian;

import com.lifujian.sword.SingletonPattern.LazyNotSecurity;
import com.lifujian.sword.SingletonPattern.NotLazySecurity;

public class SingletonTest {

	public static void main(String[] args) {
		//懒汉式不安全的
		for(int i=0;i<100;i++){
			new Thread(()->LazyNotSecurity.getInstance().say()).start();
		}
		//标准饿汉式
		for(int i=0;i<100;i++){
			new Thread(()-> NotLazySecurity.getInstance().say()).start();
		}
	}
}
