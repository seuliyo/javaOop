package encapsule;
/*
 @ Date : 2015 06 16
 @ Author : 
 @ Story : main() �� �ܼ�â�� �Է°� ����� ����� ����Ѵ�.
  		   ���� Scanner�� main()�� ���ӵǾ�� �Ѵ�.
 */
import java.util.Scanner;

public class LeapYearMain {

	public static void main(String[] args) {		
		
		LeapYearVO leapYearVO = new LeapYearVO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���.");
		int year = scanner.nextInt();		
		// Scanner�� Ŭ���� �̸�
		// scanner�� �ν��Ͻ� ���� �̸� => ��ü��
		// new�� ������ Ű����
		// Scanner()�� ������
		// System.in�� �Ķ����(�Ű�����)
		/*
		 Ŭ���� �̸��� �ݵ�� ������ ����ִ� Ŭ���� �̸��� ��ġ�ؾ� �ϰ�
		 ��ü(�ν��Ͻ� ����)�� Ŭ���� �̸��� ������ ��� �ȴ�.
		 �ٸ�, �޼ҵ带 ȣ���� ��� ����� �ν��Ͻ� ��������� ��ġ�ؾ� �Ѵ�.
		 */
		String msg = leapYearVO.getLeapYear(year); // �Ķ���ͷ� ���� �����Ѵ�.
		System.out.println(msg);
	}
}
