package ch05;

public class Minimum {
	public static void main(String[] args) {
		int[] nums = {10, 20, 30, 3, 1, 99};
		
		int temp = Integer.MAX_VALUE;//temp 임시 웬만하면 다른숫자 넣지망 -> int가 저장할수 있는 범위에서 가장 큰값 넣으셈 
		
		for(int i = 0; i < nums.length; i++) {
			if(temp > nums[i]) {
				temp = nums[i];
				
				
			}
			
		}
		System.out.println(temp);
	}

}
