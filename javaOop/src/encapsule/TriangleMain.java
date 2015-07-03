package encapsule;

import java.util.Scanner;

public class TriangleMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("삼각형의 밑변의 길이를 입력하세요. ");
		double garo = scanner.nextDouble();
		System.out.println("삼각형의 높이의 길이를 입력하세요. ");
		double sero = scanner.nextDouble();
		/*
		 double타입의 파라미터에 int 타입의 값을 할당해도 아무문제가 발생하지 않는 것은
		 자바 내부적으로 작은 타입은 큰 타입에 적용 가능하기 때문이다.
		 다만 값의 손실은 피할 수 없다.
		 */
		TriangleVO triangle = new TriangleVO(garo, sero);
		System.out.println("삼각형의 면적은 : " + triangle.getArea());
		
		

	}
}