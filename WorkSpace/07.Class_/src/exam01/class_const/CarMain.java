package exam01.class_const;

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car("차 이름", 123);
		car.memo = "메모메모";
		System.out.println(car.name);
		System.out.println(car.type);
		System.out.println(car.memo);
	}
}
