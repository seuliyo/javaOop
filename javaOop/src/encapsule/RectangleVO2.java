package encapsule;

public class RectangleVO2 {
	// 동일한 타입의 변수선언시 반복되는 타입은 생략가능
	private int width, height, area;
	
	// 생성자 자동완성 단축키 
	// 필드 선언 종료 직후 CTRL + space
	
	public RectangleVO2(int width, int height) {
		this.area = width * height;
	}

	
	public int getArea() {
		return area;
	}

	
	
	
}
