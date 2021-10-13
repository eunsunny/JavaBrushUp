package Exercise;

public class AccountTest {
	public static void main(String[] args) {
		
		Account acct1 = new Account("1001", "ȫ�浿", 0);
		Account acct2 = new Account("1002", "�̼���", 0);

		acct1.credit(1_000_000); // _�� , ��ſ� ū���� ���� ��
		dispAccount(acct1);

		acct1.debit(100_000);
		dispAccount(acct1);

		// ȫ�浿 ���¿��� �̼��� ���·� ��ü
		acct1.transferTo(acct2, 500_000);
		dispAccount(acct1);
		dispAccount(acct2);

		// �̼��� ���¿��� 60���� ���
		acct2.debit(600_000);

	}
		/*
		 * ���¸� ����ϴ� �޼ҵ�
		 */
		public static void dispAccount(Account acct) {
			System.out.printf("���¸�:%s,���¹�ȣ:%s,�ܾ�:%d\n",acct.getName(),acct.getID(),acct.getBalance());
		}
	}
		//		System.out.println("���¸�:"+a.getName()+" ���¹�ȣ:"+a.getID()+" �ܾ�:"+a.credit(1000000));
		//		System.out.println("���¸�:"+b.getName()+" ���¹�ȣ:"+b.getID()+" �ܾ�:"+b.credit(900000));

		//		System.out.println("���¸�:"+a.getName()+" ���¹�ȣ:"+a.getID()+" �ܾ�:"+a.transferTo(a, 0));
		//		System.out.println("���¸�:"+b.getName()+" ���¹�ȣ:"+b.getID()+" �ܾ�:"+b.credit(900000));


