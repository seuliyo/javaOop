package inhebitance;

import java.util.Scanner;

public class AndroidPhoneMain {
	public static void main(String[] args) {
		AndroidPhone androidPhone = new AndroidPhone();
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ȭ�� ���� �Է�");
		String name = scanner.next();
		System.out.println("���� īī���� �޼��� �Է�");
		String msg = scanner.next();
		androidPhone.setData(name, msg);
		System.out.println(androidPhone.getData());

	}
}