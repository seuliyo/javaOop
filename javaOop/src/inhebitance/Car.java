package inhebitance;

public class Car {
	/*
	 static�� Car.CAR�� ȣ�Ⱑ���ϰ� �� Ŭ���� ������ ����� Ű����
	 final�� "�ڵ���"�� �ٲ� �� ������ �ϴ� ��� Ű����	 
	 */
	public static final String CAR = "�ڵ���";
	private String companyName; // �����̱⶧���� �� �Ҵ� ���� ����
	
	public Car() {}		// �Ķ���Ͱ� ���� �����ڴ� �̷��� �Ϻη� ������ �ʾƵ� 
		                // Ŭ���� ���ο� �ִ� ������ �ڵ� �����ȴ�.
						// ���� ��ó�� �����صδ� ���� �ϳ����� �� ��(?)�̴�.

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	
}