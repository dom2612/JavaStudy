package ch05;

public class Exam5_4 {
	public static void main(String[] args) {
		
		int[][] arr = {
				 {95, 86},
				 {83, 92, 96},
				 {78, 83, 93, 87, 88}
				 };

				 int sum = 0;
				 double avg = 0.0;
				 double count = 0;//�Ҽ������;� �Ǵϱ� ���� ����

				 for (int i = 0; i < arr.length; i++) {
					 for (int j = 0; j < arr[i].length; j++) {
						 sum = sum + arr[i][j];
						 count++;
					 }
				 }
				 avg = sum / count;

				 System.out.println("�� : " + sum);
				 System.out.println("��� : " + avg);
				 }
		}
//arr[0][0]=95