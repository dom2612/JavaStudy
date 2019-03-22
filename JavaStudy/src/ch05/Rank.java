package ch05;

public class Rank {
	public static void main(String[] args) {
		int[][] s = {
				{1,2,3,4,5},
				{11,12,13},
				{21,22,23,24}
				
		};
		for(int i = 0; i < s.length; i++) {
			for(int j=0; j < s[i].length; j++) {
				System.out.println(s[i][j]);
			}
			System.out.println();
		}
		
	}

}
