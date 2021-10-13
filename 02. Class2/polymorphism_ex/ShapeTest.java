package polymorphism_ex;

class Shape {
	int width;
	int height;
	
	void draw() {
		System.out.println("도형을 그립니다.");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("사각형을 그립니다.");
	}
	
	int getArea() {
		return width * height;
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("원을 그립니다.");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("삼각형을 그립니다.");
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		// 일반적인 경우의 객체생성해서 변수 선언
		Shape s= new Shape();
		Rectangle r = new Rectangle();
		
		s.draw();
		r.draw();
		
		// 다형성을 사용하는 경우
		System.out.println("다향성 테스트: ");
		Shape s1;
		s1 = new Rectangle(); 
		s1.draw();
		//s1.getArea(); // 조상의 변수로는 자손의 기능을 사용할 수 없음
		 				//조상의 변수명을 가지고 자손의 객체를 핸들링할수있지만 자손만이 가지고 있는 기능은 사용이 불가능
		
		s1 = new Circle();  //렉탱글에 대한 주소가 사라지고 써클에대한 주소가 생성된것
		s1.draw();
		
		

	}

}
