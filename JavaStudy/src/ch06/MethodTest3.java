package ch06;
public class MethodTest3 {
	/* max ������ ���� �� ������ Ȧ���� �̾��ִ� �޼ҵ�*/
	public static int getNumber(int max) {
		while(true){
		int num = (int) (Math.random()*max)+1;
		if(num % 2 != 0) {
			return num;
		}
		}


	}
	public static void main(String[] args) {
		int num = getNumber(100);
		System.out.println(num);
	}
}