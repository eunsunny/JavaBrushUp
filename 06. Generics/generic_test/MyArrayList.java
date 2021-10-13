package generic_test;

public class MyArrayList {  //원래 자바에 있는기능
	private int size; //요소의 갯수를 저장
	private Object[] elements;  // 모든 종류의 객체를 저장하기 위해 Object를 사용
	
	public MyArrayList() {
		elements = new Object[10]; // 리스트에 최초 10개 저장
		size= 0;
	}
	
	// 데이터 추가 메소드
	public void add(Object obj) { // 최상위 오브젝트 타입
		if (size < elements.length) {
			elements[size] = obj;
		} else {
			// 공간이 부족한 경우이므로 추가 할당
		}
		++size;
	}
	
	public Object get(int index) {
		if (index >= size) {
			throw new IndexOutOfBoundsException("Index:"+index+", Size:"+size);
		}
		return elements[index];
	}
	/*
	 * 현재항목의 갯수
	 */
	public int size() {
		return size;
	}

}
