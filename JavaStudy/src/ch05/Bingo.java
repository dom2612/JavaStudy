package ch05;

public class Bingo {
	public static void main(String[] args) {
		int[] bingo = new int[25];
		//1~25���� �������
		for(int i = 0; i < bingo.length; i++) {
			bingo[i] = i + 1;
		}
		//���� �����ֱ�
		for(int i = 0; i < 1000; i++) {
			int random = (int)(Math.random() * bingo.length);
			int temp = bingo[0];
			bingo[0] = bingo[random];
			bingo[random] = temp;
		}
		for(int i = 0; i < bingo.length; i++) {
			
			
			if(i % 5 == 0) { //5���� �ٹٲ�
				
				System.out.println();//�ٹٲ�
				
			}
			System.out.print(bingo[i] + "\t");
			
////			System.out.print(bingo[i] + "\t");
////			if((i+1) % 5 == 0) { i�� 0���� �����ؼ� +1�� ���ְų� 
////			System.out.println();//�ٹٲ�
		}
		
	}

}
