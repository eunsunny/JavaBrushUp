package arraylist_ex;

import java.util.*;

public class ListIteratorEx {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();		
		
		list1.add("이순신");
		list1.add("장영실");
		list1.add("유관순");
		list1.add("장보고");
		list1.add("안창호");
		
		ListIterator lit = list1.listIterator();
		
		// 순방향으로 진행하면서 읽어 옴.
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		System.out.println();
		
		// 역방향으로 진행하면서 읽어 옴.
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}

	}

}
