package ch05;

public class Exam5_1 {
	public static void main(String[] args) {
		        // i= 0  1  2  3  4  5  6  7  8   9 (index) i�� 0�� ������ arr 1��°�� ���� 1�� 1������ arr �ι�°��
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String sep = "";//�ƹ��͵� ���� ���ڿ�
		for (int i = 0; i < arr.length; i++) {
			// i % 2 == 0 -> Ȧ�� 1�� ¦��
			if (arr[i] % 2 != 0) {
				
				
				System.out.print(sep + arr[i]);//ó������ , �������� �ؿ� �ݺ������� ,�� �־���� ������ �������ʹ� ����.
				
			}
			sep = ", ";
		}
		// �ڵ� �ۼ�

	}
}
