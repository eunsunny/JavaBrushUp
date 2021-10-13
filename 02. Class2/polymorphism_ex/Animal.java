package polymorphism_ex;

public class Animal {
	public void makeNoise() {
		System.out.println("悼拱捞 垄绰 家府");
	}

}

class Dog extends Animal {
	public void makeNoise() {
		System.out.println("港港");
	}
	
}

class Cat extends Animal {
	public void makeNoise() {
		System.out.println("具克");
	}
}

class BigDog extends Animal {
	public void makeNoise() {
		System.out.println("空空");
	}
}