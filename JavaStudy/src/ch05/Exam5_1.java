package ch05;

public class Exam5_1 {
	public static void main(String[] args) {
		        // i= 0  1  2  3  4  5  6  7  8   9 (index) i에 0을 넣으면 arr 1번째꺼 나옴 1에 1넣으면 arr 두번째꺼
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String sep = "";//아무것도 없는 문자열
		for (int i = 0; i < arr.length; i++) {
			// i % 2 == 0 -> 홀수 1은 짝수
			if (arr[i] % 2 != 0) {
				
				
				System.out.print(sep + arr[i]);//처음에는 , 안찍히고 밑에 반복문에서 ,를 넣어줬기 때문에 다음부터는 들어간다.
				
			}
			sep = ", ";
		}
		// 코드 작성

	}
}
