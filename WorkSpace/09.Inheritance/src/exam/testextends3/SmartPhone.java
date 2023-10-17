package exam.testextends3;

public class SmartPhone extends DmbPhone{
	int internetSpeed;

	public SmartPhone(String model, String color, int channel, int internetSpeed) {
		super(model, color, channel);
		this.internetSpeed = internetSpeed;
	}

	@Override
	public void powerOn() {
		System.out.println("옆에 있는 버튼 눌러서 전원 ON");
	}
	
	public void onInternet() {
		System.out.println(internetSpeed+"속도로 사용");
	}
}
