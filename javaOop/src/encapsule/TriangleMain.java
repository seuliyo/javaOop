package encapsule;

import java.util.Scanner;

public class TriangleMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ﰢ���� �غ��� ���̸� �Է��ϼ���. ");
		double garo = scanner.nextDouble();
		System.out.println("�ﰢ���� ������ ���̸� �Է��ϼ���. ");
		double sero = scanner.nextDouble();
		/*
		 doubleŸ���� �Ķ���Ϳ� int Ÿ���� ���� �Ҵ��ص� �ƹ������� �߻����� �ʴ� ����
		 �ڹ� ���������� ���� Ÿ���� ū Ÿ�Կ� ���� �����ϱ� �����̴�.
		 �ٸ� ���� �ս��� ���� �� ����.
		 */
		TriangleVO triangle = new TriangleVO(garo, sero);
		System.out.println("�ﰢ���� ������ : " + triangle.getArea());
		
		

	}
}