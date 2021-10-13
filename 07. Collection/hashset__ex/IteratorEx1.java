package hashset__ex;

import java.util.*;

public class IteratorEx1 {

	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<>();
		
		set1.add("이순신");
		set1.add("장영실");
		set1.add("유관순");
		set1.add("장보고");
		set1.add("안창호");
		
		// 각 항목을 하나씩 가져와 반복문에서 처리
		Iterator it = set1.iterator();
		
		while(it.hasNext()) {  // 다음에 읽어올 항목이 있는지 확인
			String str = (String)it.next();
			System.out.println(str);
		}
		
	}

}
