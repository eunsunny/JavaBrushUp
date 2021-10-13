
class Car {
	// 필드
	String company = "현대자동차";
	String model = "그렌저";
	String color = "흰색";
	int maxSpeed = 250;
	int speed;
}

public class CarExample_02 {  // 퍼블릭 붙어있는것이 클래스파일명이랑 동일해야함, 다른 클래스 추가는 퍼블릭 안들어가고 순서도 상관없음

	public static void main(String[] args) {  // 클래스를 실행하는 곳이고 메인은 하나만 들어가야 함
		// 객체생성(인스턴스를 생성한다)
		Car myCar = new Car();  // 클래스 변수 = 생성자
		
		// 필드의 속성 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
			
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);

	}

}
