package polymorphism_ex;

public class TestAnimal {

	public static void main(String[] args) {
		//����Ŭ������ ��ü ���
		Cat cat1 = new Cat();  //�ڽ��� �����ڸ� �̿��� �ڽ��� ������ �ִ°�(Cat)
		cat1.makeNoise();   
		Dog dog1 = new Dog();
		dog1.makeNoise();
		BigDog bigDog1 = new BigDog();
		bigDog1.makeNoise();
		
		// ������ ���(Up Casting) : ����ȯ ���� ����
		Animal animal1 = new Cat();  // ������� ��ü�� ������ ������ �ֱ�
		animal1.makeNoise();
		Animal animal2 = new Dog();
		animal2.makeNoise();
		Animal animal3 = new BigDog();
		animal3.makeNoise();
		
		//Animal animal4 = new Animal();  //����Ÿ���� ��ü ���� �ε� �̺κп����� �ʿ������
		
		// �ٿ�ĳ��Ʈ : ����ȯ �ʿ�
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
