package ch07;

public class Exam7_3 {
	 public static void main( String[] args) {
		 
		 Class7_3.method1();//static�� ������ new�� ���� �ʿ� ���� Ŭ���� �̸� ���ָ� ��
		
		 }
		}
		class Class7_3 {
		 int a;//���������� �ڵ����� 0���� �ʱ�ȭ�Ѵ�

		 public static void method1() {
		 System.out.println("method1 ���� ����");
		 
		
		 Class7_3 c = new Class7_3();//for���ȿ� ������ 1�� 1�� �ٽ� �����Ǿ �ȵ� method2 �θ����� ���� �׸�ڽ��� Ŭ���� ���� �ҷ��ְ� �ؿ� ������ ����
		 for( int i = 0; i < 5; i++) {
			 
			 //�޸𸮿� ����ϱ� ���Ѱ� new��� Ű���� 
			 c.method2();
			 
		 }
		 System.out.println( "method1 ���� ����");
		 }
		 public void method2( ) {

		a++;
		System.out.println(a);
		
		 }

}
		
