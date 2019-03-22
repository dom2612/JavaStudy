package ch09;

import ch07.Human;

public class SportsCar extends Car {
	char color = 'R';
	String s;
	
	@Override 
	void move() {
		System.out.println("胶器明墨 矫加 300km");
	}
	
	SportsCar() {
		System.out.println("SportsCar 按眉 积己");
		object obj = null;
		Human human4 = null;
		Human human3 = null;
		Human human2 = null;
		Human human1 = null;
		
		object[] ob = { human1, human2};
	}

	void openSunloof() {
		System.out.println("姐风橇 凯覆");
	}
}