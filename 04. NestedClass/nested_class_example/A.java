package nested_class_example;

// A : outer Class(�ܺο� �ִ°Ŷ� �ƿ���)
public class A {
	public int b;

	A(){
		System.out.println("A��ü�� ������.");
	}
	
	//�ν��Ͻ� ���Ŭ����
	class B {
		// ������
		B(){
			System.out.println("B��ü�� ������.");
		}
		int fields1;  // �ν��Ͻ� ���
		// static int fields2; // �ν��Ͻ� ��� ���� ���Ұ��� ��?
		void method1() { }
		// static void method2{  } class B ��ü�� �ν��Ͻ� �޼ҵ�� ����ƽ �޼ҵ� ���� �Ұ�
	}
	
	//�����θ�� Ŭ����
	static class C {
		C() {
			System.out.println("C ��ü�� ������.");
		}
		int field1;
		static int field2;
		void method1() { }
		static void method2() { }
	}
	
	void method() {
		//����Ŭ���� - �޼ҵ�ȿ� ����� Ŭ����
		class D { // �Ϲ����� Ŭ���� ����� ����
			D(){	
				System.out.println("D��ü�� ������.");
			}
			int field1;
			// static int field2;  ����ƽ ��� �Ұ���
			void method1() {  }
			//static void method() { }  ����ƽ ��� �Ұ���
		}
		
		D d = new D(); // class D�� �޼ҵ� �ȿ��ֱ� ������ �ۿ��� ��� �Ұ���
		d.field1 = 3;
		d.method1();
	}

}
