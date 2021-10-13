package const__overloading;

class User {
	
	String name;
	int age;
	
	User () { // 생략 가능

	}	
	
}

public class UserTest {

	public static void main(String[] args) {
		User user1 = new User();
		user1.name = "HongGilDong";
		user1.age = 35;
		
		System.out.println("name="+user1.name);
		System.out.println("age="+user1.age);

	}

}
