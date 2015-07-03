package encapsule;

import java.util.Scanner;

public class SimpleAccountMain {
	public static void main(String[] args) {
		/*
		 객체지향언어란 식을 기능에 따라 나누어서 모듈화를 시킨 후
		 재사용성을 높이기 위한 개발방식입니다.
		 다음은 은행계좌를 모델로 한 문제입니다.
		 클래스 두개를 생성하세요.
		 1. SimpleAccountVO.java
		 2. SimpleAccountMain.java
		 
		 2번 클래스에 있는 메소드는 다음과 같습니다.
		 public String name(String name){
		 	return name;
		 }
		 public int jango(int money){
		 	int jango = money + 100;
		 	return jango;
		 }		 
		 */
		// 스캐너로 이름(name)과 입금액(money)는 입력받습니다.
		// 스캐너와 System.out.println()은 반드시 main()에 있어야 합니다.
		
		SimpleAccountVO simpleAccountVO = new SimpleAccountVO();
		Scanner scanner = new Scanner(System.in);
		// Scanner는 클래스, scanner는 인스턴스(객체)라고 부릅니다.
		
		System.out.println("이름을 입력하세요.");
		String inputName = scanner.next();
		System.out.println("입금액을 입력하세요.");
		int inputMoney = scanner.nextInt();
		
		
		String name = simpleAccountVO.name(inputName);
		int jango = simpleAccountVO.jango(inputMoney);
		
		System.out.println(name + "씨 "+ inputMoney +"만원 입금되었습니다." + "잔고는 "+ jango +"만원 입니다.");

	}
}
