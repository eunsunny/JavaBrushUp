
public class CatchOrderExample {

	public static void main(String[] args) {
		try {		
			String data1 = args[0];
			String data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

			int result = value1 + value2;

			System.out.printf("%d + %d = %d\n", value1, value2, result);
		} catch(Exception e) {   // 순서대로 캐치해서 해결하는데, Exception은 일반적인 예외처리기 떄문에 모든경우의 처리가되어 다음 캐치는 진행하지않아서 오류남
			System.out.println("문제가 발생했습니다.");  // 다음캐치에 도달하지 않으니 오류
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행시 매개변수의 갯수가 부족합니다.");
			System.out.println("실행방법: java MultiCatchExample 숫자1 숫자2");
		} finally {
			System.out.println("다시 실행하세요.");
		}

	}

}
