package inheritance;

public class KIA extends Car {
	String modelNum;
	String color;
	
	public KIA() {
		super("����ڵ���","���",2570);
		System.out.println("KIA() ������ ȣ���");
	}
	public void drive() {
		System.out.println("KIA�ڵ����� �������̴�");
	}
	
	public void stop() {
		System.out.println("KIA�ڵ����� ���ߴ�");
	}
	
	public void turn (String direction) {
		System.out.println("KIA �ڵ�����"+direction+"ȸ���ϴ�");
	}

}
