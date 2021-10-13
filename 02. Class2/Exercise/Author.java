package Exercise;

public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
}
class Book {
	private String name;
	private Author author;
	private int price;
	private int qty = 0;
	
	public Book(String name, Author author, int price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public Book(String name, Author author, int price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}	
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", qty=" + qty + "]";
	}
	
	public String getAuthorName() {
		return author.getName();
	}
	public String getAuthorEmail() {
		return author.getEmail();
	}
	public char getAuthorGender() {
		return author.getGender();
	}
}


