package user_exception;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(1234);
		
		// �Ա�
		
		account.deposit(1_000_000L);
		System.out.println(account);
		
		//���
		try {
			long deposit_amt = 1_500_000L;
			account.withdraw(deposit_amt);
			System.out.println(deposit_amt+"���� ����մϴ�.");
		} catch (FailException e) {
			System.out.println("����ܾ��� �����մϴ�.");
			e.printStackTrace();  // ��Ȯ�� ���� ���ڸ� �ľ��ϱ����� ���� ��� ��û�ϴ� ��, ����ǥ�þȉ�
		}

	}

}
