package pack02.exfield;

public class CarMain {
	public static void main(String[] args) {
		Car carh = new Car();
		Car cark = new Car();
		carh.company = "현대";
		cark.company = "기아";
		System.out.println(carh.company);
		System.out.println(cark.company);
		carh.type = "SUV";
		carh.maxSpeed = 200;
		carh.color = "silver";
		System.out.println(carh.type);
		System.out.println(carh.maxSpeed);
		System.out.println(carh.color);
	}
}
