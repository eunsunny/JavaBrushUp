package methods;

class User {
	String name;
	int age;
	
	void printData () {
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
	
}

public class TestUser {

	public static void main(String[] args) {
		User user1 = new User();
		
		user1.name = "Hong Gil Dong";
		user1.age = 35;
		
		user1.printData();

	}

}
