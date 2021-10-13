package polymorphism_ex;

public class TestAnimal {

	public static void main(String[] args) {
		//서브클래스의 객체 사용
		Cat cat1 = new Cat();  //자신의 생성자를 이용해 자신의 변수에 넣는것(Cat)
		cat1.makeNoise();   
		Dog dog1 = new Dog();
		dog1.makeNoise();
		BigDog bigDog1 = new BigDog();
		bigDog1.makeNoise();
		
		// 다형성 사용(Up Casting) : 형변환 생략 가능
		Animal animal1 = new Cat();  // 고양이의 객체를 조상의 변수에 넣기
		animal1.makeNoise();
		Animal animal2 = new Dog();
		animal2.makeNoise();
		Animal animal3 = new BigDog();
		animal3.makeNoise();
		
		//Animal animal4 = new Animal();  //조상타입의 객체 생성 인데 이부분에서는 필요없을듯
		
		// 다운캐스트 : 형변환 필요
		Dog dog2=(Dog)animal2;
		BigDog bigDog2 = (BigDog)animal3;
		Dog dog3 = (Dog)animal2;
		Cat cat2 = (Cat)animal1;
		dog2.makeNoise();
		dog3.makeNoise();
		dog2.makeNoise();
		bigDog2.makeNoise();
		bigDog2.makeNoise();

	}

}
