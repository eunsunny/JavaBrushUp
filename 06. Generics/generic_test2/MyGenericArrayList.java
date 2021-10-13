package generic_test2;

public class MyGenericArrayList<E> {  // <E> 는 타입 매게변수
	private int size; //요소의 갯수를 저장
	private Object[] elements;
	
	public MyGenericArrayList() {
		elements = new Object[10]; // 리스트에 최초 10개 저장
		size= 0;
	}
	
	// 데이터 추가 메소드
	public void add(E e) {   //<E> 타입으로 들어가게됨
		if (size < elements.length) {
			elements[size] = e;
		} else {
			// 공간이 부족한 경우이므로 추가 할당
		}
		++size;
	}
	
	public E get(int index) {  //<E> 타입
		if (index >= size) {
			throw new IndexOutOfBoundsException("Index:"+index+", Size:"+size);
		}
		return (E)elements[index];   //<E> 타입
	}
	/*
	 * 현재항목의 갯수
	 */
	public int size() {
		return size;
	}

}
