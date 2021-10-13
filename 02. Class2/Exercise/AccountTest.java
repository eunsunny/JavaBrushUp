package Exercise;

public class AccountTest {
	public static void main(String[] args) {
		
		Account acct1 = new Account("1001", "홍길동", 0);
		Account acct2 = new Account("1002", "이순신", 0);

		acct1.credit(1_000_000); // _는 , 대신에 큰숫자 쓸떄 씀
		dispAccount(acct1);

		acct1.debit(100_000);
		dispAccount(acct1);

		// 홍길동 계좌에서 이순신 계좌로 이체
		acct1.transferTo(acct2, 500_000);
		dispAccount(acct1);
		dispAccount(acct2);

		// 이순신 계좌에서 60만원 출금
		acct2.debit(600_000);

	}
		/*
		 * 계좌를 출력하는 메소드
		 */
		public static void dispAccount(Account acct) {
			System.out.printf("계좌명:%s,계좌번호:%s,잔액:%d\n",acct.getName(),acct.getID(),acct.getBalance());
		}
	}
		//		System.out.println("계좌명:"+a.getName()+" 계좌번호:"+a.getID()+" 잔액:"+a.credit(1000000));
		//		System.out.println("계좌명:"+b.getName()+" 계좌번호:"+b.getID()+" 잔액:"+b.credit(900000));

		//		System.out.println("계좌명:"+a.getName()+" 계좌번호:"+a.getID()+" 잔액:"+a.transferTo(a, 0));
		//		System.out.println("계좌명:"+b.getName()+" 계좌번호:"+b.getID()+" 잔액:"+b.credit(900000));


