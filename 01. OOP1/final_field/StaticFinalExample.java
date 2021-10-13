package final_field;

class Circle {
	static final double PI = 3.141592;  // 상수(다른 변수와 구분을 짓지 위해 이름을 대문자로 설정
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
}

public class StaticFinalExample {

	public static void main(String[] args) {
		Circle c1 = new Circle(3.0);
		
		// c1 원의 면적 계산
		double area = Circle.PI * c1.radius * c1.radius;
		
		

	}

}
