package inheritance;
class Parent {
	int x = 10;
	
	
}

class Child extends Parent {
	int x = 20;
	
	void method() {
		System.out.println("x="+x);  // Parent�� ���� ��������� ������ ��� Child�� �� ���
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}

public class SuperTest {

	public static void main(String[] args) {
		Child c1 = new Child();
		
		c1.method();

	}

}