package arraylist_ex;

import java.util.*;  //  어레이리스트쓸떄는 임포트 필요

public class ArrayListEx1 {  //리스트라는 조상을 상속받아서,,,,

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);  // 원래는 지네릭스넣어야하는데 예제라서안늠

		list1.add(Integer.valueOf(5));  // 데이터가 들어갈때 차례차례 들어감, add() = 새로운 항목 추가
		list1.add(4);
		list1.add(2);
		list1.add(3);
		list1.add(1);

		for(int i=0; i<list1.size(); i++) {  // size -> 들어간 갯수를 말함
			System.out.println(list1.get(i));
		}
		
		//list1 에서 일부 항목을 뺴서  list2를 생성
		ArrayList list2 = new ArrayList(list1.subList(1, 4));  // 자기 객체사용해도됨, 앞에있는 리스트에서 부분적으로 가져와서.. 출력
																// (1~4번 인덱스까지 출력,, 마지막꺼는 포함하지않는다,, 즉 4번은 안가져옴))
		printList(list1, list2);
		
		// set= 특정위치에 값을 저장
		list2.set(2, "AA");   // AA 저장 후 출력된것임
		printList(list1,list2);
		
		// retainAll() = 지정된 목록만 남기고 나머지는 삭제
		list1.retainAll(list2);  // list2(값)의 항목만 남기고 모두 삭제라는 것
		printList(list1,list2);
		
		// contains() = 지정된 항목의 존재여부 확인
		// list2에서 list1에 존재하는 항목을 찾아서 삭제
		int index = 0;
		for(int i=0; i<list1.size(); i++) {
			if(list2.contains(list1.get(i))) {  // 0번째 요소부터 가져옴
				index = list2.indexOf(list1.get(i));  // list1의 항목에 대해 list2의 위치를 알아낸다.
				list2.remove(index);  // list2에서 위에서 알아낸 위치의 항목 삭제
			}
		}
		printList(list1,list2);
		
	}
	
	public static void printList(ArrayList list1, ArrayList list2) {
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		System.out.println();
	}
	

}
