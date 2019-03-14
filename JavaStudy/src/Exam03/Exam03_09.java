package Exam03;

public class Exam03_09 {
	public static void main(String[] args) {
		char ch = 'A';
		char lowerCase = 
		(ch >= 'A' && ch <= 'Z' ) //이러면 대문자
		? (char)(ch + 32) //******앞에 캐릭터로 안 맞추면 int값으로 나옴. 자바 형변환 참고*****
		: ch;
		System.out.println("ch :" + ch);
		System.out.println("ch to lowerCase :" + lowerCase);
		
		
	}
}

//char ch = 'T';
//char lowerCase = ( /* A 보다 크고 Z 보다 적은 경우 */ ) ? ( /* ch + 32 */ ) : ch;
//System.out.println("ch : " + ch);
//sysoSystem.out.println("ch to lowerCase : " + lowerCase);

//ch : T
//ch to lowerCase : t