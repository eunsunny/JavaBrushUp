package abstract_interface_compare.compare2_1;

/*
 * �������̽������� abstract  �޼ҵ忡 "abstract" Ű���� ���� ������.
 */

interface Example1 {
	public void display1();  // abstract�� ������ ����, �Ƚ��൵ abstract�żҵ���
	
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
