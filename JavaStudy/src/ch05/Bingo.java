package ch05;

public class Bingo {
	public static void main(String[] args) {
		int[] bingo = new int[25];
		//1~25까지 빙고생성
		for(int i = 0; i < bingo.length; i++) {
			bingo[i] = i + 1;
		}
		//빙고 섞어주기
		for(int i = 0; i < 1000; i++) {
			int random = (int)(Math.random() * bingo.length);
			int temp = bingo[0];
			bingo[0] = bingo[random];
			bingo[random] = temp;
		}
		for(int i = 0; i < bingo.length; i++) {
			
			
			if(i % 5 == 0) { //5에서 줄바꿈
				
				System.out.println();//줄바꿈
				
			}
			System.out.print(bingo[i] + "\t");
			
////			System.out.print(bingo[i] + "\t");
////			if((i+1) % 5 == 0) { i가 0부터 시작해서 +1을 해주거나 
////			System.out.println();//줄바꿈
		}
		
	}

}
