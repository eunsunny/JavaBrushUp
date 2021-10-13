package composition;

class Shape {
	String color = "black";
	
	void draw() {
		System.out.printf("������ �׸���.(color=%s)\n", color);
	}
}

class Point {
	int x;
	int y;
	
	Point() {
		this(0, 0);
	}
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	String getXY() {
		return "("+x+","+y+")";
	}
}

class Circle extends Shape {
	Point center;   // ������ ��ǥ
	int r;  // ������
	
	//�⺻������ : ������ (0,0)�̰� �������� 1�� ���� ����
	Circle(){
		this(new Point(0,0), 1);
	}
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	void draw() {
		System.out.printf("������ (%d, %d)�̰� �������� %d�� ���� �׸���.\n", center.x, center.y, r);
	}
}

class Triangle extends Shape {
	Point[] p = new Point[3];
	
	Triangle(Point[] p){
		this.p = p;
	}
	
	void draw() {
		System.out.printf("p1=%s, p2=%s, p3=%s, color=%s�� �ﰢ���� �׸��ϴ�.", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.draw();
		
		//������ 100, 100 �������� 30�� �� ����
		Circle c2 = new Circle(new Point(100,100), 30);
		c2.draw();
		
		//�ﰢ�� ����
		Point[] p1 = {new Point(100,100), new Point(70,150), new Point(150,150)};  // ������ ����Ʈ �迭�̱� ������ ���� ��ü�����������
		
		Triangle t = new Triangle(p1);  // ����Ʈ Ÿ���� �迭�� ������
		t.draw();
	}
}
