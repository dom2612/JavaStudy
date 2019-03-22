package ch06;
// 매개변수가 없는경우 -> 밑에 변수가 없고 그냥 메소드에 있는 값을 불러오고 싶은 경우
public class MethodTest2 {

// 메소드 생성규칙
//반드시 클래스 내에 표현되어야 한다.
// 메소드 내에 표현할 수 없음.
//위치 상관 없음.
	public static int firstMethod() {
		// 실행 순서 2번 ,4번
		int a =100;
		return a;
		
	}	
	public static void main(String[] args) {
		// 실행 순서 1번
		System.out.println(firstMethod());
		//3번
		int num = firstMethod();//반드시 a라고 받을 필요 없음. 내가 하고싶은 대롱 근데 타입은 맞아야됨 (int)
		//5번
		System.out.println(num * 6);		
	}

}
