package Exercise;

public class Account {
	private String id;
	private String name;
	private int balance = 0;
	
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance =balance;
	}
	
	public String getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	/*
	 * ���¿��� �Ա��ϴ� �޼ҵ�
	 * amount : �Աݾ�
	 */
	public int credit(int amount) {
		return balance += amount;
	}
	/*
	 * ���¿��� ����ϴ� �޼ҵ�
	 * amount : ��ݾ�
	 */
	public int debit(int amount) {
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("�ܰ� �����մϴ�.");
		} return balance;
	}
	/*
	 * ������¿��� �ٸ� ���·� ��ü�ϴ� �޼ҵ�
	 * another : �ٸ� ����� ����
	 * amount : ��ü�� �ݾ�
	 */
	public int transferTo(Account another, int amount) {
		if (amount <= balance) {
			debit(amount);   //������¿��� ���
			another.credit(amount);  //�ٸ����·� �Ա�
		} else {
			System.out.println("�ܰ� �����մϴ�.");
		} return balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
}
