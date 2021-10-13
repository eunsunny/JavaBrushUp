package treeset_ex;

import java.util.*;

public class TreeSetTest {

	public static void main(String[] args) {
		Integer[] score = {80,95,50,35,45,65,10,100};  // int(기본형) 타입하면 Integer(참조형)랑 호환이 안됨
		
		TreeSet<Integer> score1 = new TreeSet<>(Arrays.asList(score));
		
		//score1.addAll(Arrays.asList(score)); // 위에 합침
		System.out.println("원래 값 "+score1);
		
		SortedSet<Integer> tail = score1.tailSet(50);
		score1.remove(50);
		System.out.println("50보다 큰 값 "+tail);
		
		SortedSet<Integer> head = score1.headSet(50);
		System.out.println("50보다 작은 값 "+head);
		

		

	}

}
