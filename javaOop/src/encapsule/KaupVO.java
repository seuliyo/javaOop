package encapsule;
/*@ Date : 2015 06 16
  @ Author : 
  @ Story : ī���������� �����ִ� ���(������Ʈ) */
public class KaupVO {
	// �޼ҵ� = ����������(public) + ����(void) + �޼ҵ��̸� + () + {}
	public String getKaup(double height, double weight){
		int idx = (int) ((weight / (height * height)) * 10000);
		String msg = "";
		
		if (idx > 30) {
			msg = "��";			
		}else if(idx > 24){
			msg = "��ü��";			
		}else if(idx > 20){
			msg = "����";			
		}else if(idx > 15){
			msg = "��ü��";			
		}else if(idx > 13){
			msg = "����";			
		}else if(idx > 10){
			msg = "�������";			
		}else{
			msg = "�Ҹ���";			
		}				
		return msg;			
	}
}
