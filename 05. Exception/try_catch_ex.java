
public class try_catch_ex {

	public static void main(String[] args) {

		int result = 0;
		
		for(int i=0; i<10;i++) {
			try {
				//오류가 발생할 수 있는 코드
				result = 100/(int)(Math.random()*10);
				System.out.println(result);
			} catch(ArithmeticException e) {
				System.out.println("0으로 나누었습니다.");
			}
		}

	}

}
