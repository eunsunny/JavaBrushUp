package abstract_interface_compare.compare2_2;

/*
 * abstract 클래스에서 "abstract"키워드는 필수이다. 
 */

abstract class Example1 {
	public abstract void display1();
	
}

class Example2 extends Example1 {

	@Override
	public void display1() {
		System.out.println("display1 method");
		
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		

	}

}
