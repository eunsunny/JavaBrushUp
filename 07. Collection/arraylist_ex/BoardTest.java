package arraylist_ex;

import java.util.*;

public class BoardTest {

	public static void main(String[] args) {
		ArrayList<Board> list1 = new ArrayList();
		
		list1.add(new Board("제목1", "내용1", "작성자1"));
		list1.add(new Board("제목2", "내용2", "작성자2"));
		list1.add(new Board("제목3", "내용3", "작성자3"));
		list1.add(new Board("제목4", "내용4", "작성자4"));
		list1.add(new Board("제목5", "내용5", "작성자5"));
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		list1.remove(2);  //지정된 위치의 항목 삭제, 한번 삭제되면 한칸씩 땡겨져서 순서가 다시 매겨짐 0부터 시작
		list1.remove(3);
		
		System.out.println("삭제후의 목록:");
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
	}
	

}
