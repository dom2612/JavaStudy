import java.util.Scanner;

public class Operation{
	public static void main(String[] args) {
		// 두 개의 숫자의 곱이 3의 배수인지 확인
		Scanner s = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력");
		int num1 = s.nextInt();
		System.out.println("두 번째 숫자를 입력");
		int num2 = s.nextInt();
		
		System.out.println(num1 + " " + num2);
		System.out.println(num1 + " x " +num2  = );
		
		boolean result = (num1 * num2) % 3 == 0;
		System.out.println(result);
		
		
		
		
	}
}