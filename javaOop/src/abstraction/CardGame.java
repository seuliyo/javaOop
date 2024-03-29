package abstraction;

public class CardGame extends CardGameRule{

	@Override
	public void play(Card card1, Card card2) {
		/*
		 문제.
		 파라미터로 받은 두 장의 카드를 비교해서 카드의 숫자가 큰 카드가 승리하는 룰로
		 알고리즘을 만드시오.
		 힌트 if(){
		 	CARD 1 승리
		 }else if(){
		 	CARD 2 승리
		 }else{
		 	무승부
		 }
		 */ 
		if (card1.getNum() > card2.getNum()) {
			super.setResult("CARD 1 승리");
		} else if(card1.getNum() < card2.getNum()){
			super.setResult("CARD 2 승리");
		}else{
			super.setResult("무승부");
		}	
	}
}