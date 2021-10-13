package methods;

class Car {
	// 필드
	int speed;
	
	// 생성자
	
	//메소드, 메소드는 내가 어떤 기능이 필요하냐에 따라 추가 및 이름 지정
	void keyTurnOn() {  // 리턴값이 없음
		System.out.println("시동을 겁니다.");
	}
	
	// 현재 속도값을 얻습니다.
	int getSpeed() {
		return speed; // 멤버(필드)에 있는 값을 가져옴
		
	}
	
	void run() {
		for(int i=0; i<=50; i+=10) {
			speed = i;
			System.out.printf("자동차가 달립니다. (시속: %dkm/h)\n", speed);
		}
	}
}

public class CarExample {

	public static void main(String[] args) {
		// Car 인스턴스(객체) 생성
		Car myCar = new Car();
		
		myCar.keyTurnOn();
		myCar.run(); // 매게변수가 없기떄문에 값을 넣어줄 필요가 없음
		
		/*
		// myCar의 현재속도
		int car_speed = myCar.getSpeed();  // 이 값을 저장할 곳이 없기떄문에(공중분해되버림) int car_speed 변수 선언을 통해 값을 저장
		System.out.println("현재속도는 "+car_speed+" km/h");
		*/
		System.out.println("현재속도는 "+myCar.getSpeed()+" km/h"); // 위에꺼랑 같음 이렇게도 사용 가능
	}

}
