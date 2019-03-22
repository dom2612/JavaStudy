package ch10;

public class Exam10_1 {
	public static void main(String[] args) {
		Ramen ramen1 = new SpicyRamen("불 라면");
		String taste1 = ramen1.getTaste();
		System.out.println(taste1);

		Ramen ramen2 = new SaltyRamen("소금 라면");
		String taste2 = ramen2.getTaste();
		System.out.println(taste2);
	}
}
//여기 나와있는 getTaste는 부모코드에 나오는거 그대로 복사 해서
//자식 코드에 붙이면 됨 여기는 출력이 저 맛을 가져온다는 뜻