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
			System.out.println("출력"+ start);
		}
		
		
		
		
		
		//1. 시작값 2. 끝값 3. 증감식

//		}
//		for(int end = 10; end >= 1; end--) {
//			System.out.println("감소출력"+end);	
//	
		
//		for(int idx = 1; ;idx++) {
//			System.out.println(idx);
//		}
		
//		System.out.println("출력");
//		System.out.print("한줄출력");
//		System.out.print("또한줄출력");
//		System.out.println();
//		System.err.println("에러출력");

	}

}
