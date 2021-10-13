package comparator_ex;

public class Fruit {
	public String name;
	public int price;  //기준잡을떄 기준 생ㄱ가해양함
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + "]";
	}
	
}
