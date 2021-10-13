package instance_static;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("포르쉐"); // 객체를 생성할 떄 각 변수마다 다른 값이 저장되는 것인 인스턴스 변수라고 함
		Car myCar2 = new Car("벤츠");
		
		myCar.run();
		myCar2.run();

	}

}
