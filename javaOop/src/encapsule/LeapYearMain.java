package encapsule;
/*
 @ Date : 2015 06 16
 @ Author : 
 @ Story : main() 는 콘솔창에 입력과 출력의 기능을 담당한다.
  		   따라서 Scanner는 main()에 종속되어야 한다.
 */
import java.util.Scanner;

public class LeapYearMain {

	public static void main(String[] args) {		
		
		LeapYearVO leapYearVO = new LeapYearVO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("년도를 입력하세요.");
		int year = scanner.nextInt();		
		// Scanner는 클래스 이름
		// scanner는 인스턴스 변수 이름 => 객체명
		// new는 생성자 키워드
		// Scanner()는 생성자
		// System.in은 파라미터(매개변수)
		/*
		 클래스 이름은 반드시 로직이 담겨있는 클래스 이름과 일치해야 하고
		 객체(인스턴스 변수)는 클래스 이름과 관련이 없어도 된다.
		 다만, 메소드를 호출할 경우 선언된 인스턴스 변수명과는 일치해야 한다.
		 */
		String msg = leapYearVO.getLeapYear(year); // 파라미터로 값을 전달한다.
		System.out.println(msg);
	}
}
