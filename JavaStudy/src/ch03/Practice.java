package ch03;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		
		int score = 0;
		System.out.println("숫자입력 >");
		
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		
		char grade = score >= 90 ? 'A' : (score >= 80 ? 'B' : (score >= 70? 'C': (score >= 50 ?  'D' : 'F')));
		
		System.out.println(grade);
		
	}
}
