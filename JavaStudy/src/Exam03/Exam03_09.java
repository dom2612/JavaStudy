package Exam03;

public class Exam03_09 {
	public static void main(String[] args) {
		char ch = 'A';
		char lowerCase = 
		(ch >= 'A' && ch <= 'Z' ) //�̷��� �빮��
		? (char)(ch + 32) //******�տ� ĳ���ͷ� �� ���߸� int������ ����. �ڹ� ����ȯ ����*****
		: ch;
		System.out.println("ch :" + ch);
		System.out.println("ch to lowerCase :" + lowerCase);
		
		
	}
}

//char ch = 'T';
//char lowerCase = ( /* A ���� ũ�� Z ���� ���� ��� */ ) ? ( /* ch + 32 */ ) : ch;
//System.out.println("ch : " + ch);
//sysoSystem.out.println("ch to lowerCase : " + lowerCase);

//ch : T
//ch to lowerCase : t