
public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(0/0);  // ������ �߻��Ǿ� ����(����)�� �ذ��� �� �ִ� catch�� �Ѿ�� �ذ�/��� �� ����
			System.out.println(4);
	//	} catch(ArithmeticException e) {  // ������ ������ ������� Ȯ��(ĳġ)�ؼ� ������ Ÿ���� �־����(= �´� ������ ������ �� �����ؾ� ��.)
		} catch (Exception e) {   // ��� ����(����)�� ó���� �� �ִ� Ÿ������ � �������� �𸦶� ����ϸ� ����/�θ�..? �ε�
			// e�� ����ó�� ������ ���ܰ� �߻��ϸ� ���� ������ ������ ����. ���������� �̿��ؼ� catch ������ ���õ� ����ó������
			System.out.println(5);
			System.out.println(e.getMessage());  // Exception �� ���� � �������� �˼��� ���⶧���� �־��༭ Ȯ��, �������� ���ϴ´�� ��������
			e.printStackTrace();  // � �������� ǥ�����ִ� ���, ��޼ҵ尡 ȣ��ǰ� �� �̵���
		}
		System.out.println(6);
	}

}
