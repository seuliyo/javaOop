package abstraction;

public class RobotMain {
	public static void main(String[] args) {
		/*
		 ���������� : ���ڷ��̼� ����
		 ���ڷ��̼� ����(����ũ ���� �� ��Ʋ���ٰ� ���(��ũ��) ��� ����)
		 */
		BasicBot myBot = new BasicBot(); // 1. ��Ʋ�� �غ�
		GunBot myGun = new GunBot(myBot); 		
		
		myGun.status();
		myGun.chargeEnergy(50);
		myGun.status();
		myGun.shield(30);
		myGun.run();
		myGun.status();

	}
}