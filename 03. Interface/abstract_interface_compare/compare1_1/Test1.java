package abstract_interface_compare.compare1_1;
/*
 * 한번에 하나의 클래스 또는 하나의 abstract 클래스만 상속 가능.
 */
class Example1 {
	public void display1() {
		System.out.println("display1 method");
	}
	
}

abstract class Example2{
	public void display2() {
		System.out.println("display2 method");
	}
}

// 일반 클래스에서 추상클래스로 상속함.
abstract class Example3 extends Example1{
	abstract void display3();
}

// 추상클래스에서 일반클래스로 상속함
class Example4 extends Example2 {
	public void display3() {
		System.out.println("display3 method");
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		Example4 obj = new Example4();
		obj.display3();
		
	}

}
