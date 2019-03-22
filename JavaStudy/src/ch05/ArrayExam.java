package ch05;

public class ArrayExam {
	public static void main(String[] args) {
		int[] s1 = {1, 2 ,3, 4};
		
		for(int i = 0; i < s1.length; i++) {
			// 4라고 하기 보다는 s.length로 지정해서 어떤값이 나오든 좋게 하는게 좋다
			System.out.println(s1[i]); //1234가 출력되게 하는거
		}
		int last = s1[s1.length - 1];//뒤에서 첫번째 애들 뽑아내고 싶으면 -1하셈 그리고 이 수식은 마지막 4를 뽑아내고 싶어서 하는것
		System.out.println(last);
		
		
		
		int[] s2 = new int[4];
		s2[0] = 10;
		s2[1] = 20;
		s2[2] = 30;
		s2[3] = 40;
		
		
		
		
		
//		
//		System.out.println(s1);//해서 나오는 이상한 값이 해시코드 = 8개의 문자와 숫자로 결합된 코드(의미둘 필요 x)
//		System.out.println(s2);
//		System.out.println(s1.length);
		}

}
