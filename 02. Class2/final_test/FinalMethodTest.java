package final_test;

class Car {
	public int speed;
	
	// �޼���
	public void speedUp() {
		speed += 1;
	}
	public final void stop() {
		System.out.println("���� �����մϴ�.");
		speed = 0;
	}
}

class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
//	@Override
//	public final void stop() {  // final �޼ҵ�� �������̵� �״�� ����϶�� �ǹ�(�������̵� ���Ұ�)
//		System.out.println("������ī�� �����մϴ�.");
//		speed = 0;
//	}
	
}

public class FinalMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
