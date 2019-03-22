package ch07;

public class Human {
	char type;
	 String name;
	 int age;
	 
	 public char getType() {
			return type;
		}
		public void setType(char type) {
			this.type = type;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;//set에서 설정한것을 가져오는거
		}
		public void setAge(int age) {
			this.age = age;//set은 설정하는거 에이지를
		}


	 /* setter, getter 메소드 작성 */

}
