package overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		// 정사각형의 넓이를 구한다
		double result1 = myCalc.areaRectangle(10.0);
		System.out.println("정사각형의 넓이는 "+result1+"입니다.");
		
		//직사각형의 넓이
		double result2 = myCalc.areaRectangle(10.0, 20.0);
		System.out.println("직사각형의 넓이는 "+result2+"입니다.");
		
		

	}

}
