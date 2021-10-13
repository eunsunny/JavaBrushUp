
public class MultiCatchExample {

	public static void main(String[] args) {
		try {		
			String data1 = args[0];
			String data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

			int result = value1 + value2;

			System.out.printf("%d + %d = %d\n", value1, value2, result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("����� �Ű������� ������ �����մϴ�.");
			System.out.println("������: java MultiCatchExample ����1 ����2");
		} catch(NumberFormatException e) {  //���� ĳġ�� ����� ������ �ٸ�, �������� �޶�
			System.out.println("���ڸ� �Է��� �ּ���!");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}

	}

}
