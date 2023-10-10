package pack01.method;

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car();
//		car.cdMethod();
//		System.out.println();
//		car.cdMethod1("박찬영");
//		System.out.println();
//		car.cdMethod2("누군가", "휴식");
//		System.out.println();
//		
//		car.cdMethod3("자동차", 10000000);
//		car.cdMethod4("자동차", 13);
		car.cdMethod5(10);
		int result = car.rtnMethod1()+10;
		System.out.println(result);
		System.out.println(car.rtnMethod2(50));
	}
}
