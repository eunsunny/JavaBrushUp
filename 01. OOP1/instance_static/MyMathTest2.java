package instance_static;

class MyMath2 {
	long a, b;
	
	//인스턴스 변수를 이용하는 메소드들, 인스턴스로 만들어야 사용 가능
	long add() {
		return a+b;
	}
	
	// static 메소드 // 매개변수가 있고없고
	static long add(long a, long b) {
		return a+b;
	}
}

public class MyMathTest2 {

	public static void main(String[] args) {
		//static 메소드(클래스 메소드) 사용 . 객체를 만들지 않고 사용 가능 - 클래스 이용
		System.out.println("클래스 메소드의 실행결과= "+MyMath2.add(7, 5));
		
		// 인스턴스 메소드의 사용
		MyMath2 mm = new MyMath2();
		mm.a = 10;
		mm.b = 20;
		
		System.out.println("인스턴스 메소드의 실행결과= "+mm.add());
		
		//이런 매스 클래스들은 객체 없이 사용가능 바로 사용하게 할 수 있도록 함
//		Math.random();
//		Math.PI;
		
	}

}
