package abstraction;

public class Notebook extends ProductSpec{
	private String cpu;
	private String ram;
	private String hdd;	
	
	public void setInfo(String company, String name, String serialNo, String cpu, String ram, String hdd) {	
		/*
		 파라미터로 넘어온 값들도 바로 super를 통해 부모메소드의 파라미터로 던져서 바로 set합니다.
		 즉.. 멤변의 공유가 부모자식 관계에서 성립하므로, 부모의 멤변에 대한 접근 역시 가능해졌습니다.
		 */
		super.setInfo(company, name, serialNo);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
		/*
		 아래 예에서는 생성자를 여러번 반복했으므로 생성자 오버로딩이고
		 만약 메소드를 파라미터만 다른 형태로 여러개의 동일이름으로 선언하였다면
		 이를 [메소드]오버로딩이라고 한다.
		 */
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("cpu 정보 : " + this.cpu);
		System.out.println("메인메모리 정보 : " + this.ram);
		System.out.println("하드디스크 정보 : " + this.hdd);		
	}
}

