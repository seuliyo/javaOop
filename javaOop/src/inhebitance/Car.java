package inhebitance;

public class Car {
	/*
	 static은 Car.CAR로 호출가능하게 끔 클래스 변수로 만드는 키워드
	 final은 "자동차"를 바꿀 수 없도록 하는 상수 키워드	 
	 */
	public static final String CAR = "자동차";
	private String companyName; // 변수이기때문에 값 할당 하지 않음
	
	public Car() {}		// 파라미터가 없는 생성자는 이렇게 일부러 만들지 않아도 
		                // 클래스 내부에 있는 것으로 자동 생성된다.
						// 따라서 위처럼 생성해두는 것은 하나마나 한 짓(?)이다.

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	
}