package ch04;

public class for1 {
	public static void main(String[] args) {
		//(1+(1+2))+(1+2+3)+..+(1+2+3+..+10)
		int total = 0;
		int realtotal = 0;
		for(int start = 1; start <= 10; start++ ) {
			total = total + start;
			realtotal = realtotal +total;
			System.out.println(realtotal);
			System.out.println("���"+ start);
		}
		
		
		
		
		
		//1. ���۰� 2. ���� 3. ������

//		}
//		for(int end = 10; end >= 1; end--) {
//			System.out.println("�������"+end);	
//	
		
//		for(int idx = 1; ;idx++) {
//			System.out.println(idx);
//		}
		
//		System.out.println("���");
//		System.out.print("�������");
//		System.out.print("���������");
//		System.out.println();
//		System.err.println("�������");

	}

}
