package comparator_ex;

import java.util.Comparator;

/*
 * 내림차순으로 정렬하는 클래스
 */
public class DescendingComparator implements Comparator<Fruit> {  //Descending = 내림차순

	@Override
	public int compare(Fruit o1, Fruit o2) {
		if (o1.price < o2.price)
			return 1;
		else if (o1.price == o2.price)
			return 0;
		else 
			return -1;		
	}

}
