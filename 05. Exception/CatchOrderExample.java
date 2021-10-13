
public class CatchOrderExample {

	public static void main(String[] args) {
		try {		
			String data1 = args[0];
			String data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

			int result = value1 + value2;

			System.out.printf("%d + %d = %d\n", value1, value2, result);
		} catch(Exception e) {   // ������� ĳġ�ؼ� �ذ��ϴµ�, Exception�� �Ϲ����� ����ó���� ������ ������� ó�����Ǿ� ���� ĳġ�� ���������ʾƼ� ������
			System.out.println("������ �߻��߽��ϴ�.");  // ����ĳġ�� �������� ������ ����
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("����� �Ű������� ������ �����մϴ�.");
			System.out.println("������: java MultiCatchExample ����1 ����2");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}

	}

}
