package exam.testextends3;

public class DmbPhone extends CellPhone {
	int channel;

	public void turnOnDmb() {
		System.out.println("채널 "+ channel+" 시청 시작");
	}
	public void turnOffDmb() {
		System.out.println(channel+" 채널 보다가 종료 시작");
	}
	public void changeChannel(int channel) {
		this.channel = channel;
		System.out.println(channel + " 로 변경");
	}

	public DmbPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}
	
	
	
}
