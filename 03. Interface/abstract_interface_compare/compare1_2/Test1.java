package abstract_interface_compare.compare1_2;

/*
 * 인터페이스는 한번에 여러개의 인터페이스를 상속할 수 있다.
 */

interface Example1 {
	public void display1();
}

interface Example2 {
	public void display2();
}

interface Example3 extends Example1, Example2 { // 이어받긴하지만 구현하지는 않음
	
}

class Example4 implements Example3 {

	@Override
	public void display1() {
		System.out.println("display1 method");
		
	}

	@Override
	public void display2() {
		System.out.println("display2 method");
		
	}
	
}


public class Test1 {

	public static void main(String[] args) {
		Example4 obj = new Example4();
		
		obj.display1();
		obj.display2();

	}

}
