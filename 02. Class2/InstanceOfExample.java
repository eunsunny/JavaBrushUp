
class Parent {
	
}

class Child extends Parent {
	
}


public class InstanceOfExample {
	
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("Child Ÿ������ ��ȯ ����");
		} else {
			System.out.println("Child Ÿ������ ��ȯ ����");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child)parent;
		System.out.println("method2: Child Ÿ������ ��ȯ ����");
	}

	public static void main(String[] args) {
		// polymorphism ��
		Parent p = new Child();
		method1(p);
		method2(p);
		
		Parent p2 = new Parent();  // ������ ��ü�� �ڼ��� Ÿ������ ���������� �� ����,
		method1(p2);
		method2(p2); //����
		
		/* ������ ��ü�� �θ�� �ڼ��̳Ŀ� ���� �ٲܼ� �ִ��� ������ �޶���
		 * 	Parent p = new Child();
		 *  Child c = (Child)p;  //���� ������ ��ü�� ���ϵ��̸� ���������� ���ϵ�� �ٲܼ� ������
		 *  
		 *  Parent p = new Parent();
		 *  Child c = (Child)p; // ���� ������ ��ü�� �з�Ʈ�̱� ������ ���ٲ�
		 */

	}

}
