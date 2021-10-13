package const__overloading;

/*
 * 생성자 오버로딩
 */
class Car {
	// 멤버필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	Car() {  // 매게변수를 넣었으면 하단에도 매게변수를 넣어줘야 실행가능, 안넣었으면 밑에도 안넣어야함
		//클래스 내의 다른 생성자 호출
		this("아반테","흰색");  // this.이랑 다름, 다른생성자 호출 명령어 this()
	}
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	Car(Car car){
		this.model = car.model;
		this.color = car.color;
		this.maxSpeed = car.maxSpeed;
		
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}	
	
}

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1="+car1.toString());
		
		Car car2 = new Car("소나타");
		System.out.println("car2="+car2.toString());
		
		Car car3 = new Car("그랜져", "흰색");
		System.out.println("car3="+car3.toString());

		Car car4 = new Car("엘란트라", "회색", 220);
		System.out.println("car4="+car4.toString());
		
		//생성자를 이용한 인스턴스 복사
		Car car5 = new Car("그렌져","검정색",260);
//		Car car6 = new Car("그렌져","검정색",260);
//		Car car7 = new Car("그렌져","검정색",260);
		// 위의 내용 대신 아래와 같이 사용
		Car car6 = new Car(car5);
		Car car7 = new Car(car5);
		
		System.out.println("car5="+car5.toString());
		System.out.println("car6="+car6.toString());
		System.out.println("car7="+car7.toString());
	}

}
