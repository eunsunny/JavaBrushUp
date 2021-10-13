package inheritance;

class Vehicle {    // 부모클래스, 조상클래스, 슈퍼클래스
	String color;   //자동차 색상
	int    speed;   //자동차 속도
	int    size;    // 타이어크기
	
	void attribute() {
		System.out.println("color: " +color);
		System.out.println("Speed: "+speed);
		System.out.println("Size: "+size);
	}	
}

// Vehicle의 자손클래스
class Car extends Vehicle {
	int cc;	 	// 엔진의 크기
	int gears;    // 기어의 수
	
	void attributeCar() {
		System.out.println("Car의 color: " +color);
		System.out.println("Car의 Speed: "+speed);
		System.out.println("Car의 Size: "+size);
		System.out.println("Car의 엔진크기: "+cc);
		System.out.println("Car의 기어 수: "+gears);
	}
	
}


public class VehicleTest {

	public static void main(String[] args) {
		// 
		Vehicle v1 = new Vehicle();
		v1.color = "White";
		v1.speed = 200;
		v1.size = 17;
		
		v1.attribute();
		
		Car c1 = new Car();
		c1.cc = 2000;
		c1.gears = 5;
		c1.color = "blue";
		c1.speed = 250;
		c1.size = 19;
		
		c1.attributeCar();
		System.out.println("c1.attribute()");
		c1.attribute();  // void attribute() 가 상속받아서 사용가능하기 떄문에 반환(출력)되는 것
		// 부모클래스와 아이클래스의 이름이 같은 메소드가 생성시 아이것 우선으로 사용함
		

	}

}
