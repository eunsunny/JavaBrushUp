package generic_test2;

public class MyGenericArrayList<E> {  // <E> �� Ÿ�� �ŰԺ���
	private int size; //����� ������ ����
	private Object[] elements;
	
	public MyGenericArrayList() {
		elements = new Object[10]; // ����Ʈ�� ���� 10�� ����
		size= 0;
	}
	
	// ������ �߰� �޼ҵ�
	public void add(E e) {   //<E> Ÿ������ ���Ե�
		if (size < elements.length) {
			elements[size] = e;
		} else {
			// ������ ������ ����̹Ƿ� �߰� �Ҵ�
		}
		++size;
	}
	
	public E get(int index) {  //<E> Ÿ��
		if (index >= size) {
			throw new IndexOutOfBoundsException("Index:"+index+", Size:"+size);
		}
		return (E)elements[index];   //<E> Ÿ��
	}
	/*
	 * �����׸��� ����
	 */
	public int size() {
		return size;
	}

}
