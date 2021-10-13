package wildcard;

public class MyMath {
	
	//이 메소드는  Number클래스에서 상속받은 타입만 사용 가능 
	public static <T extends Number>double add(T first, T second) {
		return first.doubleValue() + second.doubleValue();  // double타입의 어쩌구...?
	}
	public static void main(String[] args) {
		System.out.println(add(55, 66));	
		System.out.println(add(5.5f,6.6f));
		System.out.println(add(5.5,5.5));

	}

}
