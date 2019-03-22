package hw;

public class Methodexan4 {

	public static int geBetweensum(int a, int b) {
		int sum = 0;
		for (int i = a; i < b; i++) {
		
			if (a > b) {
			
				sum = sum + i;
			
			}else if (a < b) {
					b++;
					sum = sum + b;
					
					} else {

						sum = i;

					} 
			}
		
			

		return isum(a,b);
		}	
		
			
	
	

		
	
		

	public static void main(String[] args) {

		int sum = isum(1,3);
		System.out.println(sum);

	}

}
