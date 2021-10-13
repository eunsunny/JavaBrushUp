package comparator_ex;

import java.util.*;

import comparable_ex.Person;

public class FruitTest {

	public static void main(String[] args) { 
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());  //Descending = 내림차순
		
		treeSet.add(new Fruit("포도",5000));
		treeSet.add(new Fruit("수박",13000));
		treeSet.add(new Fruit("딸기",3000));
		treeSet.add(new Fruit("사과",9000));
		treeSet.add(new Fruit("오렌지",10000));
		
		Iterator<Fruit> it = treeSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());  // 겹치는 값은 출력하지 않음(Price 로 잡았으니 Price 기준으로 했을때)
		}

	}

}
