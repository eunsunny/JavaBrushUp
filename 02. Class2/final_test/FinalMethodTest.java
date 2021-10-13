package final_test;

class Car {
	public int speed;
	
	// 메서드
	public void speedUp() {
		speed += 1;
	}
	public final void stop() {
		System.out.println("차를 정지합니다.");
		speed = 0;
	}
}

class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
//	@Override
//	public final void stop() {  // final 메소드는 오버라이드 그대로 사용하라는 의미(오버라이드 사용불가)
//		System.out.println("스포츠카를 정지합니다.");
//		speed = 0;
//	}
	
}

public class FinalMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
