package anonymous;

//�͸�Ŭ���� ��� ����� ����ϴ� ���
class SalaryMan extends Person{
	void work() {
		System.out.println("����մϴ�.");
	}
	@Override
	void wake() {  //Person���� ���ǵ� ���� ����ϴ� ���� �ƴ϶� ���� �����ؼ� ����ϰڴ�
		System.out.println("6�ÿ� �Ͼ�ϴ�.");
		work();
	}
}
public class Anonymous {  // �ѹ��� ����� ����̸�, Ŭ�������� ���°��� -> �͸��� Ŭ����
	// �ʵ��� �ʱⰪ���� �͸��� Ŭ���� ����
	// PersonŬ������ ��ӹ޾� ���ο� Ŭ������ �ۼ��Ѵٴ� �ǹ�
	Person field = new Person() { // ����Ÿ������ �����ؼ�
		void work() {
			System.out.println("����մϴ�.");
		}

		@Override
		void wake() {  //Person���� ���ǵ� ���� ����ϴ� ���� �ƴ϶� ���� �����ؼ� ����ϰڴ�
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
		
	}; // �ʵ� ����� ����ϱ� ������ ;�� ���������
	
	//�͸��� Ŭ���� ��� SalaryMan Ŭ���� ��ü�� ����� ���
	SalaryMan field2 = new SalaryMan();
	
	void method1() {
		// ���ú����� �͸��� Ŭ���� ����
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}

			@Override
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		
		localVar.wake();   // �͸��� Ŭ���� ��� ����
				
	}
	
	void method2(Person person) {
		person.wake();
	}

}
