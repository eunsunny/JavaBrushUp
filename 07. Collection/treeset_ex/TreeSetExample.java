package treeset_ex;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(Integer.valueOf(87));
		scores.add(98);  // Autoboxing기능으로 자동으로 인티저타입이 들어가진 것
		scores.add(75);
		scores.add(85);
		scores.add(80);
		
		// 가장 낮은 점수와 높은 점수
		Integer point = scores.first();
		System.out.println("가장 낮은 점수는 "+ point);
		
		point = scores.last();
		System.out.println("가장 높은 점수는 "+ point);
		
		// 지정한 값보다 앞에 있는 항목 리스트, tail은 자기 자신을 포함하지만 head는 포함하지 않는다
		SortedSet<Integer> head = scores.headSet(85);  //정렬된 set으로해서 값,,, SortedSet -> 정렬
		System.out.println(head);  // headSet에 있는 값을 기준으로 앞쪽으로 정렬된 값이 나오는것 SortedSet은 정렬이니 작은수 -> 큰수임
		
		SortedSet<Integer> tail = scores.tailSet(85);
		System.out.println(tail);  // tailSet에 있는 값을 기준으로 뒤쪽에 정렬된 값이 나오는 것 SortedSet은 정렬이니 작은수 -> 큰수임
		
		SortedSet<Integer> subset = scores.subSet(60, 85);  // 어디부터 어디까지라고 할때 뒷쪽 같은 포함하지 않는다, 60 <= 그거 < 85
		System.out.println(subset);
		
		// 트리셋에 포함된 내용을 내림차순으로 정렬한 목록을 보여주는 것 -> descendingSet
		NavigableSet<Integer> descend = scores.descendingSet(); // NavigableSet = Iterator 랑 비슷한 개념이라 생각하면 됨
		for(Integer item : descend) {
			System.out.println(item);
		}
		
	}

}
