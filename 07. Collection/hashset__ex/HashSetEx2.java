package hashset__ex;

import java.util.*;

class Book {
	private int id;
	private String name;  // å����
	private String author;  // ����
	private String publisher;   // ���ǻ�
	private int quantity;  // ����
	
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getPublisher() {
		return publisher;
	}



	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	@Override
	public int hashCode() {
		return Objects.hash(name, author, publisher);
	}

	@Override
	public boolean equals(Object obj) {
		Book tmp = null;;
		if (obj instanceof Book) {
			tmp = (Book)obj;
			return tmp.name.equals(name) && tmp.author.equals(author) && tmp.publisher.equals(publisher);
		}
		return false;
	}

	@Override
	public String toString() {
		return id+" "+name+" "+author+" "+publisher+" "+quantity+"\n";
	}
	
}

public class HashSetEx2 {

	public static void main(String[] args) {
		
		System.out.println("id   ����     ����    ���ǻ�     ����    ");
		System.out.println("------------------------------------");
		HashSet<Book> set1 = new HashSet<>();
		
		set1.add(new Book(3,"�ҸӴϴ� �����ʴ´�.","������","�ƹ���",11));
		set1.add(new Book(72,"�⸰�� ����","�����ó� ���̰�","�ƹ���",20));
		set1.add(new Book(38,"�̽��� ���̵�","��� �ƶ���","�ƹ���",19));
		set1.add(new Book(50,"�Ƹ��","�տ���","�ƹ���",32));
		
		Iterator it = set1.iterator();
		
		while(it.hasNext()) {  // ������ �о�� �׸��� �ִ��� Ȯ��
			Book str = (Book)it.next();
			System.out.println(str);
		}

	}

}
