package ch03;

public class Oper {
	public static void main(String[] args) {
		int count = 0;
		
		//'대입'연산자는 오른쪽에서 왼쪽으로 실행
		count += 1; //count = count + 1;
		count++; //count = count + 1;
		System.out.println(count);
	}

}
