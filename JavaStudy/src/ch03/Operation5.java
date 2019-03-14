package ch03;


public class Operation5 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result = false;
		result = num1++ < 0 && num2++ >0; //&&은 실행값이 '참'일 경우만 유효 ==. 그래서 뒤의 num2++은 실행 않함
		System.out.println(num1);
		System.out.println(num2);
		
		
		
		
	}
	
}
	
