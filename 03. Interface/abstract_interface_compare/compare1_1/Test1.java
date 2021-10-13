package abstract_interface_compare.compare1_1;
/*
 * �ѹ��� �ϳ��� Ŭ���� �Ǵ� �ϳ��� abstract Ŭ������ ��� ����.
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

// �Ϲ� Ŭ�������� �߻�Ŭ������ �����.
abstract class Example3 extends Example1{
	abstract void display3();
}

// �߻�Ŭ�������� �Ϲ�Ŭ������ �����
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
