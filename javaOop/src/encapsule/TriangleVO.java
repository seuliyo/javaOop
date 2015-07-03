package encapsule;
/*
 @ Date : 2015 06 19
 @ Author : 
 @ Story : 생성자만으로 삼각형 구하기*/
public class TriangleVO {
	/*
	 클래스는 기능에 따라 코딩 패턴이 정해집니다.
	 main() 가지고 있는 클래스를 앞으로 실행클래스라고 부르겠습니다.
	 main() 없이 내부에 데이터와 그것을 처리하는 연산식을(statement) 
	 가지고 있는 클래스를 객체클래스 라고 부르겠습니다.
	*/
	/*
	 객체 클래스는 필드영역에 멤버변수(=인스턴스변수 + 클래스변수)와 메서드영역에 
	 멤버 메서드로 구성됩니다. 거기에 특수한 메소드인 생성자가 가운데 위치합니다.*/
	private double area;
	public TriangleVO(double garo, double sero) {
		this.area = (garo*sero)/2;
	}	
	
	public double getArea() {
		return area;
	}
	
	
}
