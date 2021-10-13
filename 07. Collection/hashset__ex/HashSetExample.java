package hashset__ex;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		
		//데이터 추가:: add()
		fruits.add("Apple");
		fruits.add("Banana");
		
		// set이 비어있는지 확인:: isEmplty() = true(set이 비어있음), false(비어있지 않음))
		System.out.println("fruits set이 비어 있나요?? "+fruits.isEmpty());
		
		//특정 항목의 존재여부 : contains()
		System.out.println("fruits에 Apple이 포함되어 있나요?? "+fruits.contains("Apple"));
		
		// 지정항목 삭제 : remove()
		System.out.println("fruits set에서 'Apple' 삭제: "+fruits.remove("Apple"));
		
		// set의 항목 갯수 : size()
		System.out.println("fruits의 항목 갯수는 "+fruits.size());
		
		// addAll 예제
		System.out.println("추가전 set의 내용:"+fruits);
		List<String> list1 = new ArrayList<>();
		list1.add("Apple");
		list1.add("Apple"); // 중복은 허락하지 않음
		list1.add("Mango");
		list1.add("Orange");
		fruits.addAll(list1);  //list의 내용을 fruits에 add
		System.out.println("추가후 set의 내용:"+fruits);
		
		//remove
		fruits.remove("Orange");
		System.out.println("삭제 후 set의 내용:"+fruits);
		

	}

}
