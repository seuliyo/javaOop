package inhebitance;

public class AndroidPhone extends Iphone{
	public static final String BRAND = "�ȵ���̵�";
	private String data;
	public static boolean TRUE = true;
	
	/*public String getData() {
		return data;
	}
	public void setData(String name, String data) {
		super.setCompany(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		this.data = 
				super.getCompany() + "\t" + 
				super.getCall() + "\t" +
				data + " : �޽��� ����";
	} */
	@Override
	public void setData(String name, String data) {
		super.setCompany(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		this.data = 
				super.getCompany() + "\t" + 
				super.getCall() + "\t" +
				data + " : īī���� �޽��� ����";
	}
	@Override
	public String getData() {
		return data;
	}
}

 