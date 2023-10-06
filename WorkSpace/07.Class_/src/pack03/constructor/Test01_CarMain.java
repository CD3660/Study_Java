package pack03.constructor;

public class Test01_CarMain {
	public static void main(String[] args) {
		Test01_Car car1 = new Test01_Car("benz", "E_class");
		car1.color = "black";
		car1.model = "sedan";
		System.out.println(car1.company);
		System.out.println(car1.name);
		System.out.println(car1.model);
		System.out.println(car1.color);
	}
}
