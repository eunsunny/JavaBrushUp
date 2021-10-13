package polymorphism_ex;

class Shape {
	int width;
	int height;
	
	void draw() {
		System.out.println("������ �׸��ϴ�.");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("�簢���� �׸��ϴ�.");
	}
	
	int getArea() {
		return width * height;
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("���� �׸��ϴ�.");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("�ﰢ���� �׸��ϴ�.");
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		// �Ϲ����� ����� ��ü�����ؼ� ���� ����
		Shape s= new Shape();
		Rectangle r = new Rectangle();
		
		s.draw();
		r.draw();
		
		// �������� ����ϴ� ���
		System.out.println("���⼺ �׽�Ʈ: ");
		Shape s1;
		s1 = new Rectangle(); 
		s1.draw();
		//s1.getArea(); // ������ �����δ� �ڼ��� ����� ����� �� ����
		 				//������ �������� ������ �ڼ��� ��ü�� �ڵ鸵�Ҽ������� �ڼո��� ������ �ִ� ����� ����� �Ұ���
		
		s1 = new Circle();  //���ʱۿ� ���� �ּҰ� ������� ��Ŭ������ �ּҰ� �����Ȱ�
		s1.draw();
		
		

	}

}
