package user_exception;

public class Account {
	private int acct_no;  // 계좌번호
	private long balance;  // 계좌잔액
	
	public Account(int acct_no) {
		this.acct_no = acct_no;
	}
	
	//입금처리
	public void deposit(long amount) {
		balance += amount;
	}
	
	// 출금처리
	
	public void withdraw(long amount) throws FailException {  // throw -> 예외발생, throws -> 예외 던질떄
		if (amount<=balance) {
			balance -= amount;
		} else {   // 잔액이 부족한 경우
			// 사용자 정의 예회를 생성해서 예외발생
			throw new FailException("잔액이 부족합니다.");  // 의도적으로 예외를 만드는 것
		}
	}

	public int getAcct_no() {
		return acct_no;
	}

	public long getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [acct_no=" + acct_no + ", balance=" + balance + "]";
	}

}
