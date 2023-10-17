package exam.finalextends;

public class SuperSonicAirplane extends Airplane{
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NOMAL;
	
	@Override
	public void fly() {
		if(flyMode==NOMAL) {
			super.fly();
		} else if(flyMode==SUPERSONIC) {
			System.out.println("음속 비행합니다.");
		}
	}
}
