package methods;

class Circle {

	private double redius = 1.0;
	private String color = "red";

	Circle() { }

	Circle(double redius, String color) { // 초기값으로 설정하겠다는 의미
		this.redius = redius;
		this.color = color;
	}

	double getRadius() {
		return redius;		
	}
	// 원의 면적 구하기
	double getArea() {
		double area = redius * redius * 3.14;
		return area;
	}		
}

public class TestCircle {

	public static void main(String[] args) {
		Circle circle = new Circle();

//		circle.getRadius();
//		circle.getArea();

		System.out.println("반지름은 = "+circle.getRadius());
		System.out.println("넓이는 = "+circle.getArea());	
		
		Circle c2 = new Circle(5, "blue");
		
		System.out.println("반지름은 = "+c2.getRadius());
		System.out.println("넓이는 = "+c2.getArea());	

	}
}
