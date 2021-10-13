package nested_class_example;

public class Car {
	private String name;
	
	public Car(String name) {
		this.name = name;
	}
	
	public class Tire {
		private int size;
		
		public Tire(int size) {
			this.size = size;
		}
		
		public void display() {
			System.out.println("--- 자동차 정보 ---");
			System.out.println("자동차 이름: "+name);
			System.out.println("타이어 크기: "+size+"인치\n");
		}
	
	}

}
