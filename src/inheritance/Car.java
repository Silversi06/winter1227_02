package inheritance;

public class Car {
	String producer; //������
	String name;	//�ڵ�����
	int displacement;
	
	public Car() {
		System.out.println("Car() ������ ȣ���");
	}

	
	public Car(String producer, String name, int displacement) {
		super();
		this.producer = producer;
		this.name = name;
		this.displacement = displacement;
		System.out.println("Car(String manufacturer, String name, int displacemen) ������ ȣ���");
	}


	public void start() {
		System.out.println("(Car)�õ��� �ɴ�.");
	}
}
