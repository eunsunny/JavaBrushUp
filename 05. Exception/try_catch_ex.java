
public class try_catch_ex {

	public static void main(String[] args) {

		int result = 0;
		
		for(int i=0; i<10;i++) {
			try {
				//������ �߻��� �� �ִ� �ڵ�
				result = 100/(int)(Math.random()*10);
				System.out.println(result);
			} catch(ArithmeticException e) {
				System.out.println("0���� ���������ϴ�.");
			}
		}

	}

}
