package polymorphism_ex;

class Car {
	int door;
	String color;
	
	void drice() {
		System.out.println("자동차를 운전합니다.");
	}
	
	void stop() {
		System.out.println("자동차를 멈춥니다.");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("물을 뿌립니다.");
	}
}

/*
 *  형변환 테스트(자동)
 */

public class CastingTest {

	public static void main(String[] args) {
		Car car = null;  // 특정한 값을 대입하고 싶지않아서 null, 객체생성이 필요없어서 초기값으로 진행?
		FireEngine fe = new FireEngine();
		
		fe.water();
		car = fe;   // 자손의 타입의 객체를 조상의 타입변수에 대입, 
						// 원칙대로라면 car = (Car)fe;에서 (Car) 타입을 넣어줘야하지만, Up cating이기 때문에 생략가능 자손->조상
		//car.water();  // 조상의 변수(car.)기 때문에 자손의 기능 사용 불가능 
		// 비슷한 기능을 여러번 번거롭게 하지않고 한번에 제어가능한 기능을 제어하기 위한 부분
		//매개변수의 기능을 제어를 할때 여러기능들에 대해서 반복작업들이 들어갈때 필요한 부분
		
		FireEngine fe2 = null;
		fe2 = (FireEngine)car;	//조상의 객체를 자손의 타입변수에 대입 (Down cating)
		                        // 형변환 생략 불가능  (FireEngine)을 꼭 넣어줘야함
		fe2.water();

	}

}
