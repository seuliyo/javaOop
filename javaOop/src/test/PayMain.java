package test;

import java.util.Scanner;

public class PayMain {
	public static void main(String[] args) {
		/*
		 ����. 
		 === ȫ�浿�� 6�� �޿����� ===
		 ���� : 300����
		 ���� : 30����
		 �Ǳ޿� : 270����
		 === �������� 6�� �޿����� ===
		 ���� : 400����
		 ���� : 40����
		 �Ǳ޿� : 360����
		 */

		PayVO dong = new PayVO();
		PayVO kang = new PayVO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���. (ȫ�浿)");
		dong.setName(scanner.next());
		System.out.println("�̸��� �Է��ϼ���. (������)");
		kang.setName(scanner.next());
		/*�޿��Է�*/
		System.out.println("ȫ�浿�� �޿� : ");
		dong.setSalary(scanner.nextInt());
		System.out.println("�������� �޿� : ");
		kang.setSalary(scanner.nextInt());
		/*�޿����*/
		dong.setIncome(dong.getSalary());
		kang.setIncome(kang.getSalary());
		/*���*/
		System.out.println("=== " + dong.getName() + "�� 6�� �޿����� ===");
		System.out.println("���� : " + dong.getSalary() + "����");
		/*
		 �ν��Ͻ� ���� : �ν��Ͻ�(dong, kang)�� getter�� setter�� ȣ���ϴ� �ʵ尪
		 Ŭ���� ���� : Ŭ������ ���� ȣ���ϴ� �ʵ尪
		*/
		System.out.println("���� : " + dong.getSalary()*PayVO.TAX + "����");		
		System.out.println("�Ǳ޿� : " + dong.getIncome() + "����");
		System.out.println("=== " + kang.getName() + "�� 6�� �޿����� ===");
		System.out.println("���� : " + kang.getSalary() + "����");
		System.out.println("���� : " + kang.getSalary()*PayVO.TAX + "����");
		System.out.println("�Ǳ޿� : " + kang.getIncome() + "����");
		
		
		
	}
}
