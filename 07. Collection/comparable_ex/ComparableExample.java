package comparable_ex;

import java.util.*;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Person> tSet = new TreeSet<>();
		
		/*
		 * 임의로 입력된 값을 Person에 있는 age 오름차순으로 출력진행 -> Comparable
		 */
		tSet.add(new Person("이순신", 33));
		tSet.add(new Person("유관순", 19));
		tSet.add(new Person("장보고", 40));  // set 이기 때문에 Iterator해줘야함
		
		Iterator<Person> it = tSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
