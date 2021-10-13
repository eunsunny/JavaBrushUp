package instance_static;

/*
 * 클래스 변수(정적인 변수, static variable) 테스트
 */

public class Calculator {
	static double pi = 3.14159; // static을 꼭 붙여줘야함 
	double radius;
	
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
