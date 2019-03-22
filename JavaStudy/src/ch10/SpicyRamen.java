package ch10;

public class SpicyRamen extends Ramen { // 상속 코드
	public SpicyRamen(String name) {//부모네임쓴당 주의
		super.name = name;
	}

	// 오버라이드 코드
	public String getTaste() {
		return name + "=" + "매운맛";
	}
}