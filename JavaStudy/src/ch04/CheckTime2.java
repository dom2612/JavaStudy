package ch04;

import java.util.Calendar;

public class CheckTime2 {
	public static void main(String[] args) {
		//����ð� �˾Ƴ���: Ķ����, ����Ʈ ���
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY); // cal�� Ŀ�� �ø��� ��Ʈ �� ���´ٴ� �� �� �� �վ�
		System.out.println(hour);
		
		// hour�� ����, ���ķ� ������ ��
		if (hour >= 12) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		int min = cal.get(Calendar.MINUTE);
		System.out.println(min);

		
		
		
		
	}
}
