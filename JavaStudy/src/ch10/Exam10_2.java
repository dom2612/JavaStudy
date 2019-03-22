package ch10;

public class Exam10_2 {
	public static void main(String[] args) {
		Exam10_2 e = new Exam10_2();
		e.print(10);//print 메소드를 만들어야됨
		e.print("JAVA");
		e.print(new Data(10, "ABC"));//생성자 
	}
// [ 오버로딩 메소드 코드 작성 ]
	public void print(int n) {
		System.out.println(n  + "입니다");
		
	}
	public void print(String s) {
		System.out.println(s  + "입니다");
		
		
	}
	public void print(Data d) {
		System.out.println(d);
		//d라고만 하면 해쉬코드가 나타남
		
		
	}
	
	
}

class Data {
// [ 변수 ]
// [ 생성자 ]
	int n;
	String s;
	Data(int n, String s){
		this.n = n;
		this.s = s;
			
	}
// [ toString 오버라이딩 ]
	//오버라이딩 Source - > generate toString
	@Override
	public String toString() {
		return "Data [n=" + n + ", s=" + s + "]";
	}
	
}
