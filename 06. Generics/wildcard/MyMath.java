package wildcard;

public class MyMath {
	
	//�� �޼ҵ��  NumberŬ�������� ��ӹ��� Ÿ�Ը� ��� ���� 
	public static <T extends Number>double add(T first, T second) {
		return first.doubleValue() + second.doubleValue();  // doubleŸ���� ��¼��...?
	}
	public static void main(String[] args) {
		System.out.println(add(55, 66));	
		System.out.println(add(5.5f,6.6f));
		System.out.println(add(5.5,5.5));

	}

}
