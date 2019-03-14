package ch04;

public class for2 {
	public static void main(String[] args) {
		
//		for(int a = 1; a <= 3; a++) {
//			for(int b =1; b<= 2; b++) {
//				//1 1,1 2, 2 1, 2 2, 3 1, 3 2
//				System.out.println(a +","+b);
//			}
//		}
		
		for(int y=1; y <= 9; y++) {
			for(int x=1; x <=9; x++) {//xy바꾸면 열이 1로 됨
				System.out.print(x + "*" + y + "=" + (x*y)+" \t");//이쁘게 정렬 \t (옆으로 띄워서) -> ln없으면 옆으로 출력되용
				
				
			}
			System.out.println("\n");//칸 띄우는 용도
		}
		
	}
	
	
}