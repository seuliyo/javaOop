package encapsule;
/*@ Date : 2015 06 16
  @ Author : 
  @ Story : 카우프지수를 보여주는 모듈(컴포넌트) */
public class KaupVO {
	// 메소드 = 접근제한자(public) + 리턴(void) + 메소드이름 + () + {}
	public String getKaup(double height, double weight){
		int idx = (int) ((weight / (height * height)) * 10000);
		String msg = "";
		
		if (idx > 30) {
			msg = "비만";			
		}else if(idx > 24){
			msg = "과체중";			
		}else if(idx > 20){
			msg = "정상";			
		}else if(idx > 15){
			msg = "저체중";			
		}else if(idx > 13){
			msg = "마름";			
		}else if(idx > 10){
			msg = "영양실조";			
		}else{
			msg = "소모증";			
		}				
		return msg;			
	}
}
