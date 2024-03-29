package inheritance;

public class EV6 extends KIA {
	int chargeBattery;
	String softwareModel;
	
	public EV6() {
		System.out.println("EV6() 생성자 호출됨");
	}
	
	public void driveAutonomously() {
		System.out.println("EV6가 주행중이다");
	}
	
	@Override
	public void stop() {
		System.out.println("EV6가 멈추다.");
	}
	
	@Override
	public void turn (String direction) {
		System.out.println("EV6가"+direction+"회전하다");
	}

}
