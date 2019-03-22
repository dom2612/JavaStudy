package hw;

public class Methodexan2 {
	public static void star(int a , char ch) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(ch);
				
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		star(6,'¢½');
	}

}
