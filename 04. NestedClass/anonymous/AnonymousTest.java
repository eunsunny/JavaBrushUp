package anonymous;

public class AnonymousTest {

	public static void main(String[] args) {
		Anonymous an = new Anonymous();
		
		an.field.wake();
		
		an.method1();
		
		// �޼ҵ��� �ŰԺ����� �͸��� Ŭ������ ����
		an.method2(new Person() {  // �͸��� Ŭ������ �ٷ� ���� ����
			void study() {
				System.out.println("���θ� �մϴ�.");
			}

			@Override
			void wake() {
				System.out.println("5�ÿ� �Ͼ�ϴ�.");
				study();
			}
			
		});

	}

}
