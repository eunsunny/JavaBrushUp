package nested_class_example;

public class CarTest_InnerClass {

	public static void main(String[] args) {
				
		Car a = new Car("Æ÷¸£½¦");
		Car.Tire ct = a.new Tire(20);
		
		ct.display();
		
		Car a1 = new Car("¸ð´×");
		Car.Tire ct1 = a1.new Tire(15);
		ct1.display();
		
		Car a2 = new Car("¾Æ¹ÝÅ×");
		Car.Tire ct2 = a2.new Tire(16);
		ct2.display();
		
		

	}

}
