package exam.testextends3;

import java.util.Random;

public class CellPhone {
	public String model;
	public String color;

	public void powerOn() {
		System.out.println("종료 버튼 눌러서 전원 on");
	}

	public void powerOff() {
		System.out.println("종료 버튼 눌러서 전원 off");
	}

	public void bell() {
		System.out.println("전화 와서 벨울림(소리남)");
	}

	public void receiveVoice() {
		System.out.println("상대방: " + new Random().nextInt(123456) + 1);
	}

	public void sendVoice(String voice) {
		System.out.println("나(본인): " + voice);
	}

	public void hangUp() {
		System.out.println("통화 종료");
	}

	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}

}
