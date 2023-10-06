package pack03.constructor;

public class Test01_Car {
	String company;
	String model;
	String color;
	String name;
	
	public Test01_Car(String company, String name) {
		this.company = company;
		this.name = name;
	}

	public Test01_Car(String company, String model, String color, String name) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.name = name;
	}
	
}
