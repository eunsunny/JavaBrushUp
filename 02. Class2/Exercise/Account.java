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
	 * 계좌에서 입금하는 메소드
	 * amount : 입금액
	 */
	public int credit(int amount) {
		return balance += amount;
	}
	/*
	 * 계좌에서 출금하는 메소드
	 * amount : 출금액
	 */
	public int debit(int amount) {
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("잔고가 부족합니다.");
		} return balance;
	}
	/*
	 * 현재계좌에서 다른 계좌로 이체하는 메소드
	 * another : 다른 사람의 계좌
	 * amount : 이체할 금액
	 */
	public int transferTo(Account another, int amount) {
		if (amount <= balance) {
			debit(amount);   //현재계좌에서 출금
			another.credit(amount);  //다른계좌로 입금
		} else {
			System.out.println("잔고가 부족합니다.");
		} return balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
}
