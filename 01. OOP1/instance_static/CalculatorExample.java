package instance_static;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		// 반지름이 5.0인 원의 면적 계산
		c1.setRadius(5.0);
		//원의 면적은
		System.out.println("PI="+Calculator.pi);
		System.out.println("반지름이 5.0인 원의 면적:"+c1.radius*c1.radius*Calculator.pi); 
		//스테틱 변수는 인스턴스가 없이 사용할 수 있는 것이기 때문에 클래스명으로 접근해야함
		
		Calculator c2 = new Calculator();
		//반지름이 7.0인 원의 면적
		c2.setRadius(7.0);
		System.out.println("PI="+Calculator.pi);
		System.out.println("반지름이 7.0인 원의 면적:"+c2.radius*c2.radius*Calculator.pi); 
		

	}

}
