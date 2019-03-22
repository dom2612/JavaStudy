package ch04;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
	//�޷³�¥����
		cal.set(2016, 1, 1);//�̷��� 3�� 1���� ���� 
		int year = cal.get(Calendar.YEAR);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int lastDate = cal.getActualMaximum(Calendar.DATE);//�̰� ������ ������ ������ ������ ��Ʈ ���̰� set�տ� ������ 31���� �����ϱ�
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(dayOfWeek);//�� �̶� �̰� ++����ߵ�
		System.out.println(lastDate);//31
		System.out.println("\n");
		System.out.println("       " + year + "��");
		System.out.println("SU MO TU WE Th FR SA");
		System.out.println("====================");
		
		for(int i = 1; i < dayOfWeek; i++) {
		//<=���� =�� ����� 01�� ������ ��
			System.out.print("   ");
		}
	
		for(int i =1; i <= lastDate; i++ ) {
			
			if(i < 10) {
				System.out.print("0" + i + " ");
			}else {
				System.out.print(i + " ");
			}
			if(dayOfWeek % 7 == 0) {
				System.out.println();//7���� ������ ����!
			}
			dayOfWeek++;
			
			
			
			
			
		}
		
	
	}
	

}
