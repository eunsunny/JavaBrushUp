package comparator_ex;

import java.util.Comparator;

/*
 * ������������ �����ϴ� Ŭ����
 */
public class DescendingComparator implements Comparator<Fruit> {  //Descending = ��������

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
