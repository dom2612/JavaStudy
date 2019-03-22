package ch06;

public class Compute {
	public static int sum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			 
		}
		return sum;
			}
	
	public static double average(int n) {
		double avg = n/10;
		return avg;
	}
	
	public static void main(String[] args) {
		int sum = sum(10);
		double avg = average(sum);
		System.out.println(avg +"," + sum);
	
	}

}
//viod는 보이드 안에서 출력해줘야 되고 메인메소드에서  리턴이 있는건 다른 변수로 스면 되는데 메인 메소드에서 출력해줘야 됨 반환해줘야 되니까 그 값을 