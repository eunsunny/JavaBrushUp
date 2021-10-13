package generic_method;

public class GenericMethodTest {
	
	// �پ��� Ÿ���� �迭 �׸��� ���
	// Generic �޼ҵ�� ���� -> �޼ҵ� ����ο� <Ÿ���Ķ����, .....> ����Ÿ�� �޼ҵ��(�ŰԺ���, ....){......} �䷸�� �ϴ°���
	public static <E> void printArray(E[] elements) {  // <E>�� ��ȯŸ�� �տ������
		for (E elem:elements) {
			System.out.println(elem);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] intArr = {10, 20, 30, 40, 50};  //Integer -> intŸ���� ��¼��
		Character[] charArr = {'J','A','V','A','!'};   //Character -> charŸ���� ��¼��
		
		System.out.println("Integer �迭 ���:");
		printArray(intArr);
		
		System.out.println("Character �迭 ���:");
		printArray(charArr);
		
	}
}
