package ch06;
//매개변수 있는 경우 -> 본체에 변수가 있어야 되는 경우 그리고 메소드로 연결해서 그 변수를 사용하고 싶은 경우
public class MethodTest {
	public static boolean hasNegative(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, -9};
		boolean b = hasNegative(arr);//여기에는 i를 안 넣었기 때문에 적을필요 없당 밑에서 그냥 변수만 써서 불러온다고 생각하셈
		System.out.println(b);
		
		//위 배열에 음수가 있는지 검사
	}
}
