package getter_setter;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		// ��������� �̿��� speed�� �����Ҷ�
		// myCar.speed = -10;  // �ӵ��� -���� �����ؼ��� �ȵ�.
		
		// �߸��� �ӵ� ����
		myCar.setSpeed(-50);
		
		System.out.println("���� �ӵ�: "+myCar.getSpeed());
		
		// �ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		System.out.println("���� �ӵ�: "+myCar.getSpeed());
		// ����
		if (!myCar.isStop()) {
			myCar.setStop(true);  // �ڵ����� ������Ų��.
		}
		System.out.println("���� �ӵ�: "+myCar.getSpeed());

	}

}