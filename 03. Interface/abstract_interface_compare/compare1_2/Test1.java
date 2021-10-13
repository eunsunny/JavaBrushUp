package abstract_interface_compare.compare1_2;

/*
 * �������̽��� �ѹ��� �������� �������̽��� ����� �� �ִ�.
 */

interface Example1 {
	public void display1();
}

interface Example2 {
	public void display2();
}

interface Example3 extends Example1, Example2 { // �̾�ޱ������� ���������� ����
	
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
