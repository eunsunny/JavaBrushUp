
public class CallStackEx {

	public static void main(String[] args) {
		
		try {
		methodA();
		} catch (ArithmeticException e) {
			System.out.println("0���� ���������ϴ�.");
		}
		System.out.println("���� ����");
	}
	
	public static void methodA() throws ArithmeticException {
		methodB();
		System.out.println("methodA ���� ����");
	}
	
	// throws :  ���ܹ߻������� ó������ �ʰ� ȣ���� �޼ҵ�� ���ܸ� ������.
	public static void methodB() throws ArithmeticException {
		int result = 0;
		for(int i=0; i<10;i++) {
		result = 100/(int)(Math.random()*10);
		System.out.println(result);
		}
	}

}
