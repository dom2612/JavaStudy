package ch10;

public class Exam10_2 {
	public static void main(String[] args) {
		Exam10_2 e = new Exam10_2();
		e.print(10);//print �޼ҵ带 �����ߵ�
		e.print("JAVA");
		e.print(new Data(10, "ABC"));//������ 
	}
// [ �����ε� �޼ҵ� �ڵ� �ۼ� ]
	public void print(int n) {
		System.out.println(n  + "�Դϴ�");
		
	}
	public void print(String s) {
		System.out.println(s  + "�Դϴ�");
		
		
	}
	public void print(Data d) {
		System.out.println(d);
		//d��� �ϸ� �ؽ��ڵ尡 ��Ÿ��
		
		
	}
	
	
}

class Data {
// [ ���� ]
// [ ������ ]
	int n;
	String s;
	Data(int n, String s){
		this.n = n;
		this.s = s;
			
	}
// [ toString �������̵� ]
	//�������̵� Source - > generate toString
	@Override
	public String toString() {
		return "Data [n=" + n + ", s=" + s + "]";
	}
	
}
