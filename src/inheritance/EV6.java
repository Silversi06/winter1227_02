package inheritance;

public class EV6 extends KIA {
	int chargeBattery;
	String softwareModel;
	
	public EV6() {
		System.out.println("EV6() ������ ȣ���");
	}
	
	public void driveAutonomously() {
		System.out.println("EV6�� �������̴�");
	}
	
	@Override
	public void stop() {
		System.out.println("EV6�� ���ߴ�.");
	}
	
	@Override
	public void turn (String direction) {
		System.out.println("EV6��"+direction+"ȸ���ϴ�");
	}

}
