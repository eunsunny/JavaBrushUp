package polymorphism_ex;

class Car {
	int door;
	String color;
	
	void drice() {
		System.out.println("�ڵ����� �����մϴ�.");
	}
	
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("���� �Ѹ��ϴ�.");
	}
}

/*
 *  ����ȯ �׽�Ʈ(�ڵ�)
 */

public class CastingTest {

	public static void main(String[] args) {
		Car car = null;  // Ư���� ���� �����ϰ� �����ʾƼ� null, ��ü������ �ʿ��� �ʱⰪ���� ����?
		FireEngine fe = new FireEngine();
		
		fe.water();
		car = fe;   // �ڼ��� Ÿ���� ��ü�� ������ Ÿ�Ժ����� ����, 
						// ��Ģ��ζ�� car = (Car)fe;���� (Car) Ÿ���� �־����������, Up cating�̱� ������ �������� �ڼ�->����
		//car.water();  // ������ ����(car.)�� ������ �ڼ��� ��� ��� �Ұ��� 
		// ����� ����� ������ ���ŷӰ� �����ʰ� �ѹ��� ������� ����� �����ϱ� ���� �κ�
		//�Ű������� ����� ��� �Ҷ� ������ɵ鿡 ���ؼ� �ݺ��۾����� ���� �ʿ��� �κ�
		
		FireEngine fe2 = null;
		fe2 = (FireEngine)car;	//������ ��ü�� �ڼ��� Ÿ�Ժ����� ���� (Down cating)
		                        // ����ȯ ���� �Ұ���  (FireEngine)�� �� �־������
		fe2.water();

	}

}
