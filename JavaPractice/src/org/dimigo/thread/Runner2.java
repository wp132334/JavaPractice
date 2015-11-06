package org.dimigo.thread;

import java.util.Random;

public class Runner2 implements Runnable {
	
	private String name;
	private int time;
	
	Runner2(String name) {
		
		this.name = name;
		time = new Random().nextInt(10000);

	}
	
	public void run() {
		
		for(int i = 100; i>=0; i-=10) {
		
		System.out.println(this.name + i + "meter");
		try {
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (i == 0) {
			System.out.println(this.name + " goaled");
		}
		}
	}

}
