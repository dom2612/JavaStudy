package ch04;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		int random = (int)(Math.random()*100+1);
		Scanner s = new Scanner(System.in);
		
		while(true) {
			int num = s.nextInt();
			if(random == num) {
				System.out.println("맞췄음");
				break;
			}else if (random > num) {
				System.out.println("더 큰수를 입력하세요");
			}else if (random < num) {
				System.out.println("더 작은수를 입력하세요");
			}
		}
		s.close();
	}

}
