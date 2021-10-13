package instance_static;

/*
 * 인스턴스 변수 예제
 */

public class Car {
	//필드(인스턴스 변수들) - 객체를 생성해야 사용할 수 있는 변수들 이라는 뜻
	String model;
	int speed;
	
	//생성자
	Car(String model) {
		this.model = model;
	}
	
	// 메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10; i<=50; i+=10) {
			setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속:"+this.speed+"km/h)");
		}
	}

}
