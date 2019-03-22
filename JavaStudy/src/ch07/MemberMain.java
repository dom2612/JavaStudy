package ch07;

public class MemberMain {
	public static void printDate(Member m) {
		System.out.println(m.id);//m이 가지고 있는 id출력
		System.out.println(m.name);
	}
	
	public static void printDate(Member[] m) {
		for(int i = 0; i < m.length;i++) {
			printDate(m[i]);
		}
		
	}
	public static void main(String[] args) {
		
		Member[]m = new Member[2];
		
		Member m1 = new Member();
		m1.id = "ggoreb";
		m1.name = "kim";
		printDate(m1);
		
		Member m2 = new Member();
		m1.id = "seoreb";
		m1.name = "park";
		printDate(m2);
		
		m[0] = m1; m[1] = m2;
		printDate(m);
	}

}
