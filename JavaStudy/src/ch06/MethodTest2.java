package ch06;
// �Ű������� ���°�� -> �ؿ� ������ ���� �׳� �޼ҵ忡 �ִ� ���� �ҷ����� ���� ���
public class MethodTest2 {

// �޼ҵ� ������Ģ
//�ݵ�� Ŭ���� ���� ǥ���Ǿ�� �Ѵ�.
// �޼ҵ� ���� ǥ���� �� ����.
//��ġ ��� ����.
	public static int firstMethod() {
		// ���� ���� 2�� ,4��
		int a =100;
		return a;
		
	}	
	public static void main(String[] args) {
		// ���� ���� 1��
		System.out.println(firstMethod());
		//3��
		int num = firstMethod();//�ݵ�� a��� ���� �ʿ� ����. ���� �ϰ���� ��� �ٵ� Ÿ���� �¾ƾߵ� (int)
		//5��
		System.out.println(num * 6);		
	}

}
