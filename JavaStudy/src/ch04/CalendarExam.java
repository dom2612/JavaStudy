package ch04;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
	//달력날짜지정
		cal.set(2016, 1, 1);//이래야 3월 1일이 찍힘 
		int year = cal.get(Calendar.YEAR);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int lastDate = cal.getActualMaximum(Calendar.DATE);//이걸 위에서 밑으로 내려준 이유가 라스트 데이가 set앞에 있으면 31까지 찍히니까
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(dayOfWeek);//목 이라서 이걸 ++해줘야됨
		System.out.println(lastDate);//31
		System.out.println("\n");
		System.out.println("       " + year + "년");
		System.out.println("SU MO TU WE Th FR SA");
		System.out.println("====================");
		
		for(int i = 1; i < dayOfWeek; i++) {
		//<=에서 =을 지우면 01이 앞으로 감
			System.out.print("   ");
		}
	
		for(int i =1; i <= lastDate; i++ ) {
			
			if(i < 10) {
				System.out.print("0" + i + " ");
			}else {
				System.out.print(i + " ");
			}
			if(dayOfWeek % 7 == 0) {
				System.out.println();//7에서 밑으로 가라!
			}
			dayOfWeek++;
			
			
			
			
			
		}
		
	
	}
	

}
