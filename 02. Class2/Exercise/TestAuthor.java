package Exercise;

public class TestAuthor {

	public static void main(String[] args) {
		Author author = new Author("Bret Spell","Bspell@nowhere.com",'m');
		System.out.println(author);
		
		author.setEmail("jungbo@nowhere.com");
		System.out.println("name is: "+author.getName());
		System.out.println("email is: "+author.getEmail());
		System.out.println("gender is: "+author.getGender());
	}
}
