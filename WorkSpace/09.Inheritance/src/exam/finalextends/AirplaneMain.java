package exam.finalextends;

public class AirplaneMain {
	public static void main(String[] args) {
		SuperSonicAirplane ssa = new SuperSonicAirplane();
		ssa.takeOff();
		ssa.flyMode=SuperSonicAirplane.SUPERSONIC;
		ssa.fly();
		ssa.land();
		
		int intValue = 10;
		double doubleValue = intValue;
		System.out.println(intValue);
		System.out.println(doubleValue);
		
		doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		
		
		
	}
}
