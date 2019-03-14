package ch04;

import java.util.Scanner;

public class Exam4_5 {

	public static void main(String[] args) {

		boolean iC = true;
		int count = 0;

		while (iC) {
			int num1 = (int) (Math.random() * 6 + 1);
			int num2 = (int) (Math.random() * 6 + 1);
			System.out.println("(" + num1 + "," + num2 + ")");
			count++;
			if (num1 + num2 == 10) {
				iC = false;
				
			}
		}
		System.out.println("주사위 던진 횟수 ="+ count);
	}
}
