package encapsule;

import java.util.Scanner;

/*
 @ Date : 2015 06 18
 @ Author : 
 @ Story : �簢���� ������ ���ϴ� ���α׷�
 */
public class RectangleMain1 {
	public static void main(String[] args) {
		System.out.println("���� ���̸� �Է��ϼ���. ");
		Scanner scanner = new Scanner(System.in);
		RectangleVO rectangle = new RectangleVO();
		rectangle.setWidth(scanner.nextInt());
		System.out.println("���� ���̸� �Է��ϼ���. ");
		// ������ ��������(���ú���)�� �������� �ʴ� ������ 
		// �ν��Ͻ��� ���� �ν��Ͻ������� �̿��ϱ� �����̴�.
		rectangle.setHeight(scanner.nextInt());
		rectangle.setArea(rectangle.getWidth(), rectangle.getHeight());
		System.out.println("�簢���� ���� : " + rectangle.getArea());

	}
}
