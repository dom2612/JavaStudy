package ch04;

public class Exam4_6 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			int space = 5 - i;
			for (int j = 1; j <= 5; j++) {
				
				
				if (j <= space) {
					System.out.print(" ");
				} else {
					System.out.print("¢½");
				}

			}
			System.out.println();
		}

	}
}
