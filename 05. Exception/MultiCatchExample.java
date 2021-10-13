
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
			System.out.println("실행시 매개변수의 갯수가 부족합니다.");
			System.out.println("실행방법: java MultiCatchExample 숫자1 숫자2");
		} catch(NumberFormatException e) {  //위의 캐치에 선언된 변수랑 다름, 사용공간이 달라서
			System.out.println("숫자를 입력해 주세요!");
		} finally {
			System.out.println("다시 실행하세요.");
		}

	}

}
