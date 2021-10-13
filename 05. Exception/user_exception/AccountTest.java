package user_exception;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(1234);
		
		// 입금
		
		account.deposit(1_000_000L);
		System.out.println(account);
		
		//출금
		try {
			long deposit_amt = 1_500_000L;
			account.withdraw(deposit_amt);
			System.out.println(deposit_amt+"원을 출금합니다.");
		} catch (FailException e) {
			System.out.println("출금잔액이 부족합니다.");
			e.printStackTrace();  // 정확한 에러 문자를 파악하기위해 에러 출력 요청하는 것, 에러표시안됌
		}

	}

}
