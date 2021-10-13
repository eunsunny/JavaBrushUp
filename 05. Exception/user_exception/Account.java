package user_exception;

public class Account {
	private int acct_no;  // ���¹�ȣ
	private long balance;  // �����ܾ�
	
	public Account(int acct_no) {
		this.acct_no = acct_no;
	}
	
	//�Ա�ó��
	public void deposit(long amount) {
		balance += amount;
	}
	
	// ���ó��
	
	public void withdraw(long amount) throws FailException {  // throw -> ���ܹ߻�, throws -> ���� ������
		if (amount<=balance) {
			balance -= amount;
		} else {   // �ܾ��� ������ ���
			// ����� ���� ��ȸ�� �����ؼ� ���ܹ߻�
			throw new FailException("�ܾ��� �����մϴ�.");  // �ǵ������� ���ܸ� ����� ��
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
