package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone i = new IPhone("iPhone6", "애플", 700000);
		SmartPhone g = new Galaxy("갤럭시 S6", "삼성", 650000);
		
		System.out.println(i.toString());
		i.turnOn();
		i.pay();
		i.useSpecialFunction(i);
		i.turnOff();
		
		System.out.println(g.toString());
		g.turnOn();
		g.pay();
		g.useSpecialFunction(g);
		g.turnOff();
		
	}

}
