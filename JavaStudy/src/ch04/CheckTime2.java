package ch04;

import java.util.Calendar;

public class CheckTime2 {
	public static void main(String[] args) {
		//현재시간 알아내기: 캘린더, 데이트 사용
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY); // cal에 커서 올리면 인트 값 갖는다는 걸 알 수 잇어
		System.out.println(hour);
		
		// hour를 오전, 오후로 나누는 법
		if (hour >= 12) {
			System.out.println("오후");
		} else {
			System.out.println("오전");
		}
		int min = cal.get(Calendar.MINUTE);
		System.out.println(min);

		
		
		
		
	}
}
