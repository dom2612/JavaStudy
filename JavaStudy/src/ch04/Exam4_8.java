package ch04;

public class Exam4_8 {
	public static void main(String[] args) {
		int count = 0;
		int num = 0;
		
		for(int i = 1; i <= 15; i++) {
			num = i;
			
			while(num > 0) {
				
				num = num % 10;
				
				if(num == 3) {
					
					System.out.println(i);
					count++;
					break;
						
				} num = num / 10;	
			}
			
		}
		System.out.println("���� ����"+ count);
	}

}

//		Scanner s = new Scanner(System.in);
//		int num = s.nextInt();
//	
//		for(int i = 1; i <= num; i++) {
//			int a = i;//���� ���� �Ѽ� �ϸ� �ȵǱ� ������ ���� �������� ����ִ� ��
//			
//			while (a > 0) {
//				int n = a % 10;
//				
//				if (n == 8) {
//					//Ƚ������
//					
//					count++;
//					//1���ڸ��� Ȯ�ΰ��� �׷��� �ؿ� num /10�մϴ�
//				}
//				a = a / 10; //���ڸ� 
//			}
//			
//			
//			
//			
//			}System.out.println("���ڰ��� " + count);
//			
//			s.close();
