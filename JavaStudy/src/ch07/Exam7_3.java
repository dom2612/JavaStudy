package ch07;

public class Exam7_3 {
	 public static void main( String[] args) {
		 
		 Class7_3.method1();//static이 붙으면 new를 붙일 필요 없이 클래스 이름 써주면 됨
		
		 }
		}
		class Class7_3 {
		 int a;//전역변수는 자동으로 0으로 초기화한다

		 public static void method1() {
		 System.out.println("method1 실행 시작");
		 
		
		 Class7_3 c = new Class7_3();//for문안에 있으면 1가 1로 다시 생성되어서 안됨 method2 부르려면 앞의 네모박스인 클래스 먼저 불러주고 밑에 간단히 쓰자
		 for( int i = 0; i < 5; i++) {
			 
			 //메모리에 등록하기 위한게 new라는 키워드 
			 c.method2();
			 
		 }
		 System.out.println( "method1 실행 종료");
		 }
		 public void method2( ) {

		a++;
		System.out.println(a);
		
		 }

}
		
