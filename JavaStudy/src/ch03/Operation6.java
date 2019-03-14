package ch03;

import java.util.Scanner;

public class Operation6 {
	public static void main(String[] args) {
		//한글자 (알파벳) 입력
		Scanner s = new Scanner(System.in);
		System.out.println("영문자를 입력해");
		String txt = s.next(); 
		System.out.println(txt);
		
		//문장의 첫글자를 char로 가져오기
		char txt2 = txt.charAt(0);
		//입력된 글자가 알파벳 맞는지
		boolean isCorrect = false;
		isCorrect = txt2 >= 'a' && txt2 <= 'z';
				System.out.println(isCorrect);
		
		//출력
		
				
		
		
		
		
	}
	
}
	
