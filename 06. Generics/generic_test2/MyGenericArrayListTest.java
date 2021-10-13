package generic_test2;

public class MyGenericArrayListTest {

	public static void main(String[] args) {
		MyGenericArrayList<String> strList = new MyGenericArrayList<String>();  // 10개의 항목이 들어갈 수 있는 공간이 만들어짐
		// <String>이라고 제너릭타입을 선언했기 떄문에 String외에는 실행 불가능, 타입 확인용
		
		strList.add("alpha");
		strList.add("beta");
		
		for(int i=0; i<strList.size(); i++) {
			String str = (String)strList.get(i); 
			System.out.println(str);
		}
		
		// 숫자를 저장
		//strList.add(Integer.valueOf(123));  // Generic 타입이 String이므로 숫자는 저장 불가능

	}

}
