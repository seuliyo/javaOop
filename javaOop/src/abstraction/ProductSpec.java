package abstraction;

public class ProductSpec implements Product {
	private String company; // ������
	private String name; // ��ǰ��
	private String serialNo; // �Ϸù�ȣ
	
	@Override
	public void setInfo(String company, String name, String serialNo){
		this.company = company;
		this.name = name;
		this.serialNo = serialNo;		
	}
	
	@Override
	public void getInfo() {
		System.out.println("������ : " + this.company);
		System.out.println("��ǰ�� : " + this.name);
		System.out.println("�ø���ѹ� : " + this.serialNo);
	}
}
/*
 ��Ŭ���� ����Ű ����� ���� ��� (�⺻ ����Ű�ܿ� �߰� ��Ű��)
 �޴��� > window > preference > General > Keys > Copy Lines > Binding Ctrl J > Apply > OK
 											   > Delete Line > Binding Ctrl D > 
 											   > Line Start > Binding Ctrl B >
 											   > End        > Binding Ctrl E
 */