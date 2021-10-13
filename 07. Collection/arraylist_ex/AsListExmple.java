package arraylist_ex;

import java.util.*;  // *는 모든 유틸 거시기 쓸수있다는거

public class AsListExmple {

	public static void main(String[] args) {
		String[] names = {"홍길동", "이순신","유관순"};
		
		//배열을 리스트로 변환
		List<String> list1 = Arrays.asList(names);
		System.out.println("list1="+list1);  // 숫자배열에서도 사용 가능

	}

}
