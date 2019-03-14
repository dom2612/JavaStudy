package Exam03;

import java.util.Scanner;

public class Exam03_06 {
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("2자리수 정수 입력(10~99)>>");
		int n = scanner.nextInt();
		int ten = 0;
		int one = 0;
				
		ten = n / 10;
		one = n % 10;
		
		boolean isMatch = false;
		isMatch = ten==one;
		
		System.out.println(isMatch);
		
		
		
	}

}
