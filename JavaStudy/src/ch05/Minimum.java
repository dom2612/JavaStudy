package ch05;

public class Minimum {
	public static void main(String[] args) {
		int[] nums = {10, 20, 30, 3, 1, 99};
		
		int temp = Integer.MAX_VALUE;//temp �ӽ� �����ϸ� �ٸ����� ������ -> int�� �����Ҽ� �ִ� �������� ���� ū�� ������ 
		
		for(int i = 0; i < nums.length; i++) {
			if(temp > nums[i]) {
				temp = nums[i];
				
				
			}
			
		}
		System.out.println(temp);
	}

}
