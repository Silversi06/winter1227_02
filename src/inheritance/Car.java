package inheritance;

public class Car {
	String producer; //제조사
	String name;	//자동차명
	int displacement;
	
	public Car() {
		System.out.println("Car() 생성자 호출됨");
	}

	
	public Car(String producer, String name, int displacement) {
		super();
		this.producer = producer;
		this.name = name;
		this.displacement = displacement;
		System.out.println("Car(String manufacturer, String name, int displacemen) 생성자 호출됨");
	}


	public void start() {
		System.out.println("(Car)시동을 걸다.");
	}
}
