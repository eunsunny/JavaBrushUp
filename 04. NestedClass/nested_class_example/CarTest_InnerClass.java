package nested_class_example;

public class CarTest_InnerClass {

	public static void main(String[] args) {
				
		Car a = new Car("������");
		Car.Tire ct = a.new Tire(20);
		
		ct.display();
		
		Car a1 = new Car("���");
		Car.Tire ct1 = a1.new Tire(15);
		ct1.display();
		
		Car a2 = new Car("�ƹ���");
		Car.Tire ct2 = a2.new Tire(16);
		ct2.display();
		
		

	}

}
