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
		System.out.println("숫자 갯수"+ count);
	}

}

//		Scanner s = new Scanner(System.in);
//		int num = s.nextInt();
//	
//		for(int i = 1; i <= num; i++) {
//			int a = i;//원래 값을 훼손 하면 안되기 때문에 변수 대입으로 잡아주는 것
//			
//			while (a > 0) {
//				int n = a % 10;
//				
//				if (n == 8) {
//					//횟수세기
//					
//					count++;
//					//1의자리만 확인가능 그래서 밑에 num /10합니당
//				}
//				a = a / 10; //앞자리 
//			}
//			
//			
//			
//			
//			}System.out.println("숫자개수 " + count);
//			
//			s.close();
