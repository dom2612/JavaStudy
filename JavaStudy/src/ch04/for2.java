package ch04;

public class for2 {
	public static void main(String[] args) {
		
//		for(int a = 1; a <= 3; a++) {
//			for(int b =1; b<= 2; b++) {
//				//1 1,1 2, 2 1, 2 2, 3 1, 3 2
//				System.out.println(a +","+b);
//			}
//		}
		
		for(int y=1; y <= 9; y++) {
			for(int x=1; x <=9; x++) {//xy�ٲٸ� ���� 1�� ��
				System.out.print(x + "*" + y + "=" + (x*y)+" \t");//�̻ڰ� ���� \t (������ �����) -> ln������ ������ ��µǿ�
				
				
			}
			System.out.println("\n");//ĭ ���� �뵵
		}
		
	}
	
	
}