package encapsule;
/*
 @ Date : 2015 06 19
 @ Author : 
 @ Story : �����ڸ����� �ﰢ�� ���ϱ�*/
public class TriangleVO {
	/*
	 Ŭ������ ��ɿ� ���� �ڵ� ������ �������ϴ�.
	 main() ������ �ִ� Ŭ������ ������ ����Ŭ������� �θ��ڽ��ϴ�.
	 main() ���� ���ο� �����Ϳ� �װ��� ó���ϴ� �������(statement) 
	 ������ �ִ� Ŭ������ ��üŬ���� ��� �θ��ڽ��ϴ�.
	*/
	/*
	 ��ü Ŭ������ �ʵ念���� �������(=�ν��Ͻ����� + Ŭ��������)�� �޼��念���� 
	 ��� �޼���� �����˴ϴ�. �ű⿡ Ư���� �޼ҵ��� �����ڰ� ��� ��ġ�մϴ�.*/
	private double area;
	public TriangleVO(double garo, double sero) {
		this.area = (garo*sero)/2;
	}	
	
	public double getArea() {
		return area;
	}
	
	
}
