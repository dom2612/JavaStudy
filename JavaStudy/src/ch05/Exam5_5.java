package ch05;

public class Exam5_5 {
	public static void main(String[] args) {
		 int[][] arr = new int[3][3];
		 int count = 0;
		 for(int i = 0; i < arr.length; i++) {
			 
			 for(int j = 0; j < arr[i].length; j++) {
				 count++;//그변수에다 ++쓰지말고 대입할수 있다는거 기억하자!
				 arr[i][j] = count;
				 
				 System.out.print(arr[i][ j] + "\t");
			 }
			 System.out.println();
		 }
	}
		

}
