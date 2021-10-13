package getter_setter;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		// 멤버변수를 이용해 speed를 설정할때
		// myCar.speed = -10;  // 속도는 -값을 설정해서는 안됨.
		
		// 잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재 속도: "+myCar.getSpeed());
		
		// 올바른 속도 변경
		myCar.setSpeed(60);
		System.out.println("현재 속도: "+myCar.getSpeed());
		// 멈춤
		if (!myCar.isStop()) {
			myCar.setStop(true);  // 자동차를 정지시킨다.
		}
		System.out.println("현재 속도: "+myCar.getSpeed());

	}

}
