
public class CallStackEx {

	public static void main(String[] args) {
		
		try {
		methodA();
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누었습니다.");
		}
		System.out.println("정상 종료");
	}
	
	public static void methodA() throws ArithmeticException {
		methodB();
		System.out.println("methodA 정상 종료");
	}
	
	// throws :  예외발생시점에 처리하지 않고 호출한 메소드로 예외를 던진다.
	public static void methodB() throws ArithmeticException {
		int result = 0;
		for(int i=0; i<10;i++) {
		result = 100/(int)(Math.random()*10);
		System.out.println(result);
		}
	}

}
