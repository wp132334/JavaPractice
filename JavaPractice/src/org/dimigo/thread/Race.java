package org.dimigo.thread;

import java.util.Random;

public class Race {
	public static void main(String[] args) {
		System.out.println("main thread");
		
		Thread t1 = new Runner("Rainbow Dash");
		Thread t2 = new Runner("Spitfire");
		
		int t1run = 100;
		int t2run = 100;
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		System.out.println("main thread end");
	}

}
