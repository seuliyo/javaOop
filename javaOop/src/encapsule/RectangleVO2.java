package encapsule;

public class RectangleVO2 {
	// ������ Ÿ���� ��������� �ݺ��Ǵ� Ÿ���� ��������
	private int width, height, area;
	
	// ������ �ڵ��ϼ� ����Ű 
	// �ʵ� ���� ���� ���� CTRL + space
	
	public RectangleVO2(int width, int height) {
		this.area = width * height;
	}

	
	public int getArea() {
		return area;
	}

	
	
	
}
