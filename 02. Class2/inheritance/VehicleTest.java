package inheritance;

class Vehicle {    // �θ�Ŭ����, ����Ŭ����, ����Ŭ����
	String color;   //�ڵ��� ����
	int    speed;   //�ڵ��� �ӵ�
	int    size;    // Ÿ�̾�ũ��
	
	void attribute() {
		System.out.println("color: " +color);
		System.out.println("Speed: "+speed);
		System.out.println("Size: "+size);
	}	
}

// Vehicle�� �ڼ�Ŭ����
class Car extends Vehicle {
	int cc;	 	// ������ ũ��
	int gears;    // ����� ��
	
	void attributeCar() {
		System.out.println("Car�� color: " +color);
		System.out.println("Car�� Speed: "+speed);
		System.out.println("Car�� Size: "+size);
		System.out.println("Car�� ����ũ��: "+cc);
		System.out.println("Car�� ��� ��: "+gears);
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
		c1.attribute();  // void attribute() �� ��ӹ޾Ƽ� ��밡���ϱ� ������ ��ȯ(���)�Ǵ� ��
		// �θ�Ŭ������ ����Ŭ������ �̸��� ���� �޼ҵ尡 ������ ���̰� �켱���� �����
		

	}

}
