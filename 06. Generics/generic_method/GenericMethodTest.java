package generic_method;

public class GenericMethodTest {
	
	// 다양한 타입의 배열 항목을 출력
	// Generic 메소드로 구현 -> 메소드 선언부에 <타입파라미터, .....> 리턴타입 메소드명(매게변수, ....){......} 요렇게 하는거임
	public static <E> void printArray(E[] elements) {  // <E>는 반환타입 앞에써야함
		for (E elem:elements) {
			System.out.println(elem);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] intArr = {10, 20, 30, 40, 50};  //Integer -> int타입의 어쩌구
		Character[] charArr = {'J','A','V','A','!'};   //Character -> char타입의 어쩌구
		
		System.out.println("Integer 배열 출력:");
		printArray(intArr);
		
		System.out.println("Character 배열 출력:");
		printArray(charArr);
		
	}
}
