package abstraction;
/*
 @ Date : 2015 06 24
 @ Author : 
 @ Story : �������̽� Ÿ������ ������ ���� Ŭ����
 */
public class Bankbook implements Account {
	
	private String accountNo; // ���¹�ȣ
	private String ownerName; // ��������
	private String password; // �����й�ȣ
	private int restMoney; // �ܾ�
	public static final String BANK_NAME = "����Ƽ��ũ";	
	
	public Bankbook(String accountNo, String ownerName, String password, int restMoney) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.password = password;
		this.restMoney = restMoney;
	}

	public String getAccountNo() {
		return accountNo;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRestMoney() {
		return restMoney;
	}

	@Override
	public void deposit(int money) {
		// ��ȿ�� üũ
		// �Աݾ��� Ȥ�� 0�̳� 0���� ���� �ݾ��� 
		// �Ķ���ͷ� ���� ��� ������ �߻��ϴ� ���� ���� ���� ����ڵ�
		if(money <= 0){
			System.out.println("�Աݾ��� 0���� Ŀ�� �մϴ�.");
		} else {
			this.restMoney += money;
		}		
	}

	@Override
	public void withdraw(int money) {
		if (money <= 0) {
			System.out.println("��ݾ��� 0���� Ŀ�� �մϴ�.");
		} else if(getRestMoney()<=money) {
			System.out.println("��ݾ��� �ܾ׺��� Ů�ϴ�.");
		}else {
			this.restMoney -= money;
		}
		
	}
	/*
	 Java ������ ���� ���Ǵ� Ŭ������ �������̽��� �̹� ���� �Ǵ� ������ ��
	 �����ڵ��� �̸� ������ ���Բ� �ϰ� �ֽ��ϴ�.
	 �������, ��ĳ��, �ý��� ���� ���Դϴ�.
	 ��ó�� �̸� ������� Ŭ������ �������̽��� API��� �մϴ�.
	 �� �� �ֻ��� ��ü�� Object��� �ϸ�, �� Object�� Ŭ������ �ڹٿ��� ��ü�� ����� ���̶��
	 ������ ����� �޽��ϴ�. �׷��� Object�� �޼ҵ���� �ڹٰ�ü��� ������̵� ����� �� �ֽ��ϴ�.
	 �̰� ����ϴ� ����� Ŭ���� ���ο��� �� ������ CTRL + SPACE.
	 */
	@Override
	public String toString() {
		return "����� ����\n"
				+ "[" + BANK_NAME + "]\n"
				+ "���¹�ȣ : " + getAccountNo() + "\n"
				+ "���¸� : " + getOwnerName() + "\n"
				+ "��� : ******** \n"
				+ "�ܾ� : " + getRestMoney() + "\n"
				+ "���� ������ �����Ǿ����ϴ�.";
	}
}
