package inhebitance;

public class AndroidPhone extends Iphone{
	public static final String BRAND = "안드로이드";
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
				data + " : 메시지 전달";
	} */
	@Override
	public void setData(String name, String data) {
		super.setCompany(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		this.data = 
				super.getCompany() + "\t" + 
				super.getCall() + "\t" +
				data + " : 카카오톡 메시지 전달";
	}
	@Override
	public String getData() {
		return data;
	}
}

 