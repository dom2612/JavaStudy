package ch02;

public class Variable1 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a의 값은? " + a);

		int b = 11;
		System.out.println("b의 값은? " + b);

		// a의 값에 b를 입력 ( <== )
		// 기존 a의 값인 10은 사라짐
		a = b;
		System.out.println("a의 값은? " + a);
		
		System.out.println(System.currentTimeMillis());
		
		// 0.0 <= N <1.0
		
		///얜 왜 1만 나오는 걸까????
		System.out.println((int) Math.random() *6 +1 );
		
		System.out.println((int)(Math.random() *6 +1 ));
		
		
				
	}
}