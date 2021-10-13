package abstract_interface_compare.compare2_1;

/*
 * 인터페이스에서는 abstract  메소드에 "abstract" 키워드 생략 가능함.
 */

interface Example1 {
	public void display1();  // abstract가 생략된 상태, 안써줘도 abstract매소드임
	
}

class Example implements Example1 {

	@Override
	public void display1() {
		System.out.println("display1 method");
		
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
