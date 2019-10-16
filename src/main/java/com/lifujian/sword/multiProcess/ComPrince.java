package com.lifujian.sword.multiProcess;

public class ComPrince{
	private static final int MIN_PRICE = 100;
	private static final int MAX_PRICE = 10000;
	private static int currentPrice;
	private static final int Thread_Size=200;

	public static void desert(){
		synchronized (new Object()) {
			String st="线程"+Thread.currentThread().getName();
			if (currentPrice > MIN_PRICE) {
				currentPrice = currentPrice - 100;
				System.out.println(st + "报价成功，当前报价：" + currentPrice);
			} else
				System.out.println(st + "已有人报过最低价，不能再报最低价");
		}
	}
	public static void main(String[] args) {
		currentPrice=MAX_PRICE;
		Thread[] threads=new Thread[Thread_Size];
		ComPrince cp=new ComPrince();

		for (int i=0;i<Thread_Size;i++){
			threads[i]=new Thread(()->cp.desert());
			threads[i].start();
			// threads[i].start();可以去看源码了解重复调用start报错的原因是什么
		}
	}
}


