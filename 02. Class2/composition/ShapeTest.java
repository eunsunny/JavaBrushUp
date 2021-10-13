package composition;

class Shape {
	String color = "black";
	
	void draw() {
		System.out.printf("도형을 그린다.(color=%s)\n", color);
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
	Point center;   // 원점의 좌표
	int r;  // 반지름
	
	//기본생성자 : 원점이 (0,0)이고 반지름이 1인 원을 생성
	Circle(){
		this(new Point(0,0), 1);
	}
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	void draw() {
		System.out.printf("원점이 (%d, %d)이고 반지름이 %d인 원을 그린다.\n", center.x, center.y, r);
	}
}

class Triangle extends Shape {
	Point[] p = new Point[3];
	
	Triangle(Point[] p){
		this.p = p;
	}
	
	void draw() {
		System.out.printf("p1=%s, p2=%s, p3=%s, color=%s인 삼각형을 그립니다.", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.draw();
		
		//원점이 100, 100 반지름이 30인 원 생성
		Circle c2 = new Circle(new Point(100,100), 30);
		c2.draw();
		
		//삼각형 생성
		Point[] p1 = {new Point(100,100), new Point(70,150), new Point(150,150)};  // 각각의 포인트 배열이기 떄문에 각각 객체생성해줘야함
		
		Triangle t = new Triangle(p1);  // 포인트 타입의 배열이 들어가야함
		t.draw();
	}
}
