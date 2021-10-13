package wildcard;

import java.util.*;  //*는 다 포함하는 뜻

public class WildCardTest {

	//public static void printList(List<Object> lst) {
	public static void printList(List<?> lst) {  // 매개변수를 wildcard로 대체
		for(Object obj:lst) {
			System.out.println(obj);
		}
	}
	public static void main(String[] args) {
		List<Object> objList = new ArrayList<Object>();  // ArrayList는 자바에서 제공하는 기능
		objList.add(Integer.valueOf(50));
		printList(objList);
		
		List<String> strList = new ArrayList<String>();
		strList.add("one");
		printList(strList);  // (첫번쨰 오브젝트로 제너릭했을떄)스트링 타입으로는 불가능하다는 에러뜸

	}

}
