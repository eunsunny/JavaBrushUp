package polymorphism_ex;

public class Animal {
	public void makeNoise() {
		System.out.println("������ ¢�� �Ҹ�");
	}

}

class Dog extends Animal {
	public void makeNoise() {
		System.out.println("�۸�");
	}
	
}

class Cat extends Animal {
	public void makeNoise() {
		System.out.println("�߿�");
	}
}

class BigDog extends Animal {
	public void makeNoise() {
		System.out.println("�տ�");
	}
}