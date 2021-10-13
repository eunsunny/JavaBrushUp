
public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(0/0);  // 오류가 발생되어 오류(문제)를 해결할 수 있는 catch로 넘어가서 해결/출력 후 종료
			System.out.println(4);
	//	} catch(ArithmeticException e) {  // 오류의 종류가 어떤것인지 확인(캐치)해서 적정한 타입을 넣어야함(= 맞는 예외의 종류를 잘 선택해야 함.)
		} catch (Exception e) {   // 모든 예외(오류)를 처리할 수 있는 타입으로 어떤 오류인지 모를때 사용하면 좋음/부모..? 인듯
			// e는 예외처리 변수로 예외가 발생하면 예외 정보를 가지고 있음. 예외정보를 이용해서 catch 내에서 관련된 예외처리가능
			System.out.println(5);
			System.out.println(e.getMessage());  // Exception 만 쓰면 어떤 오류인지 알수가 없기때문에 넣어줘서 확인, 변수명은 원하는대로 지정가능
			e.printStackTrace();  // 어떤 오류인지 표시해주는 기능, 어떤메소드가 호출되고 뭐 이딴거
		}
		System.out.println(6);
	}

}
