package ch06;




	public class Exam06 {
	   
	   public static int getLastYear(int month) {
	      int date = 0;
	      if(month == 1 || month == 3 || month == 5) {
	         date = 31;
//	         return 31;
	      } else if(month == 2) {
	         date = 28;
//	         return 28;
	   } else {
	      date = 30;
	   }
	      
	      
	      return date;
	   }
	   public static void main (String[] args) {
	      
	}
}

