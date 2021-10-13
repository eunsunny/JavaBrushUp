package Exercise;

public class TestBook {

	public static void main(String[] args) {
		Author author = new Author("Bret Spell", "BSpell@nowhere.com", 'm');
		System.out.println(author);
		
		Book dummyBook = new Book("Pro JAVA 8 Programming", new Author("유관순","ㅇㄹㅇㄹ",'f'), 30000, 99);
		System.out.println(dummyBook);
		
		dummyBook.setPrice(35000);
		dummyBook.setQty(28);
		System.out.println("name is: "+dummyBook.getName());
		System.out.println("price is: "+dummyBook.getPrice());
		System.out.println("qty is: "+dummyBook.getPrice());
		System.out.println("Author is: "+dummyBook.getQty());
		System.out.println("Author's name is: "+dummyBook.getAuthor().getName());
		System.out.println("Author's email is: "+dummyBook.getAuthor().getEmail());
		Book anotherBook = new Book("moreJava", new Author("Paul Ahan", "paul@somewhere.com",'m'), 30000);
		System.out.println(anotherBook);
		
		
		Book abook = new Book("길동", "abc@abc.com", 0);
		abook.getAuthorName();
	}
}
