package generic_test;

public class MyArrayList {  //���� �ڹٿ� �ִ±��
	private int size; //����� ������ ����
	private Object[] elements;  // ��� ������ ��ü�� �����ϱ� ���� Object�� ���
	
	public MyArrayList() {
		elements = new Object[10]; // ����Ʈ�� ���� 10�� ����
		size= 0;
	}
	
	// ������ �߰� �޼ҵ�
	public void add(Object obj) { // �ֻ��� ������Ʈ Ÿ��
		if (size < elements.length) {
			elements[size] = obj;
		} else {
			// ������ ������ ����̹Ƿ� �߰� �Ҵ�
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
	 * �����׸��� ����
	 */
	public int size() {
		return size;
	}

}
