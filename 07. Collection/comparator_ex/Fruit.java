package comparator_ex;

public class Fruit {
	public String name;
	public int price;  //���������� ���� �������ؾ���
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + "]";
	}
	
}
