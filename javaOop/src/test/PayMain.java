package test;

import java.util.Scanner;

public class PayMain {
	public static void main(String[] args) {
		/*
		 문제. 
		 === 홍길동의 6월 급여내역 ===
		 본봉 : 300만원
		 세금 : 30만원
		 실급여 : 270만원
		 === 강감찬의 6월 급여내역 ===
		 본봉 : 400만원
		 세금 : 40만원
		 실급여 : 360만원
		 */

		PayVO dong = new PayVO();
		PayVO kang = new PayVO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요. (홍길동)");
		dong.setName(scanner.next());
		System.out.println("이름을 입력하세요. (강감찬)");
		kang.setName(scanner.next());
		/*급여입력*/
		System.out.println("홍길동의 급여 : ");
		dong.setSalary(scanner.nextInt());
		System.out.println("강감찬의 급여 : ");
		kang.setSalary(scanner.nextInt());
		/*급여계산*/
		dong.setIncome(dong.getSalary());
		kang.setIncome(kang.getSalary());
		/*출력*/
		System.out.println("=== " + dong.getName() + "의 6월 급여내역 ===");
		System.out.println("본봉 : " + dong.getSalary() + "만원");
		/*
		 인스턴스 변수 : 인스턴스(dong, kang)가 getter와 setter로 호출하는 필드값
		 클래스 변수 : 클래스가 직접 호출하는 필드값
		*/
		System.out.println("세금 : " + dong.getSalary()*PayVO.TAX + "만원");		
		System.out.println("실급여 : " + dong.getIncome() + "만원");
		System.out.println("=== " + kang.getName() + "의 6월 급여내역 ===");
		System.out.println("본봉 : " + kang.getSalary() + "만원");
		System.out.println("세금 : " + kang.getSalary()*PayVO.TAX + "만원");
		System.out.println("실급여 : " + kang.getIncome() + "만원");
		
		
		
	}
}
