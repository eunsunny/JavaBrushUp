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
			System.out.println("--- �ڵ��� ���� ---");
			System.out.println("�ڵ��� �̸�: "+name);
			System.out.println("Ÿ�̾� ũ��: "+size+"��ġ\n");
		}
	
	}

}
