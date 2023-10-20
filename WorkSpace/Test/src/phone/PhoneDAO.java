package phone;

import java.util.Scanner;

public class PhoneDAO extends SuperPhone {
	Scanner sc = new Scanner(System.in);

	SuperPhone sp;
	int gen;

	public PhoneDAO() {
		super.sps = initPhone();
	}

	public void choosePhone() {
		while (true) {
			System.out.println("사용할 폰을 선택하세요");
			displayChoose();
			int temp = getIntByScan();
			if (temp > 0 && temp <= sps.length) {
				runPhone(sps[temp - 1]);
			} else if (temp == 0) {
				break;
			} else if (temp == 99) {
				createNewPhone();
			}
		}
	}

	public void displayChoose() {
		for (int i = 0; i < sps.length; i++) {
			if (i % 5 != 4) {
				System.out.print((i + 1) + "." + getModel(sps[i]) + " ");
			} else {
				System.out.println((i + 1) + "." + getModel(sps[i]) + " ");
			}
		}
		System.out.println("0.프로그램종료 99.새로운폰생성");
	}

	public String getModel(SuperPhone sp) {
		Generation1DTO dto = (Generation1DTO) sp;
		return dto.getModel();
	}

	public void createNewPhone() {
		System.out.println("1~3세대 휴대폰 종류를 선택하세요.");
		SuperPhone sp = null;
		switch (getIntByScan()) {
		case 1:
			System.out.println("색상, 모델명을 차례로 입력하세요.");
			sp = new Generation1DTO(getStringByScan(), getStringByScan());
			break;
		case 2:
			System.out.println("색상, 모델명을 차례로 입력하세요.");
			sp = new Generation2DTO(getStringByScan(), getStringByScan(), 0);
			break;
		case 3:
			System.out.println("색상, 모델명을 차례로 입력하세요.");
			sp = new Generation3DTO(getStringByScan(), getStringByScan(), 0);
			break;
		default:
			break;
		}
		SuperPhone[] temp = new SuperPhone[sps.length + 1];
		for (int i = 0; i < sps.length; i++) {
			temp[i] = sps[i];
		}
		temp[sps.length] = sp;
		this.sps = temp;
	}

	public String getStringByScan() {
		while (true) {
			String str = sc.nextLine();
			if (str.equals("")) {
				System.out.println("내용을 입력하세요");
			} else {
				return str;
			}
		}
	}

	public void runPhone(SuperPhone sp) {
		this.sp = sp;
		genCheck();
		nowPhone();
		while (true) {
			System.out.println("핸드폰 조작 명령");
			displayMenu();
			boolean change = false;// 핸드폰 조작 종료시 true로 변경
			switch (getIntByScan()) {
			case 1:
				onOff();
				break;
			case 2:
				callOnOff();
				break;
			case 3:
				sendVoice();
				break;
			case 4:
				receiveVoice();
				break;
			case 5:
				dmbToggle();
				break;
			case 6:
				dmbChannel();
				break;
			case 7:
				internetToggle();
				break;
			case 8:
				webtoonToggle();
				break;
			case 9:
				displaySystem();
				break;
			case 0:
				change = true;
				break;
			default:
				System.out.println("해당 번호의 기능이 없습니다.");
				break;
			}
			if (change) {
				break;
			}
			System.out.println();
		}
	}

	public void genCheck() {
		if (sp instanceof Generation3DTO) {
			this.gen = 3;
		} else if (sp instanceof Generation2DTO) {
			this.gen = 2;
		} else {
			this.gen = 1;
		}
	}

	public void displayMenu() {
		System.out.println("1.전원버튼 2.전화버튼 3.음성송신 4.음성수신 5.DMB버튼");
		System.out.println("6.DMB채널변경 7.인터넷버튼 8.웹툰 버튼 9.시스템상태보기 0.핸드폰 전환");
	}

	public void displaySystem() {
		if (gen >= 2) {
			Generation2DTO dto = (Generation2DTO) sp;
			System.out.println(gen + "세대 핸드폰");
			System.out.println("모델명: " + dto.getModel() + " 색상: " + dto.getColor() + " 채널: " + dto.getChannel());
			System.out.println("현재 동작하는 기능 : " + utilCheck());
		} else {
			Generation1DTO dto = (Generation1DTO) sp;
			System.out.println(gen + "세대 핸드폰");
			System.out.println("모델명: " + dto.getModel() + " 색상: " + dto.getColor());
			System.out.println("현재 동작하는 기능 : " + utilCheck());
		}
	}

	public String utilCheck() {
		String str = "";
		if (gen == 3) {
			Generation3DTO dto = (Generation3DTO) sp;
			if (dto.isInternetOnOff()) {
				str += "인터넷기능 ";
			}
			if (dto.isWebtoonOnOff()) {
				str += "웹툰기능 ";
			}
		}
		if (gen >= 2) {
			Generation2DTO dto = (Generation2DTO) sp;
			if (dto.isDmbOnOff()) {
				str += "DMB기능 ";
			}
		}
		if (gen >= 1) {
			Generation1DTO dto = (Generation1DTO) sp;
			if (dto.isCallOnOff()) {
				str += "통화기능 ";
			}
		}
		if (str.equals("")) {
			str += "없음";
		}
		return str;

	}

	public int getIntByScan() {
		while (true) {
			try {
				return Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("숫자만 입력 가능. 다시 입력하세요.");
			}
		}
	}

	public SuperPhone[] initPhone() {
		SuperPhone[] sps = new SuperPhone[3];
		sps[0] = new Generation1DTO("흰색", "폴더폰");
		sps[1] = new Generation2DTO("파란색", "슬라이드폰", 0);
		sps[2] = new Generation3DTO("검정색", "스마트폰", 0);
		System.out.println("1세대 흰색 폴더폰이 지급되었습니다.");
		System.out.println("2세대 파란색 슬라이드폰이 지급되었습니다.");
		System.out.println("3세대 검정색 스마트폰이 지급되었습니다.");
		return sps;
	}

	public void nowPhone() {
		System.out.println(gen + "세대 폰 사용중");

	}

	public Generation1DTO get1Dto() {
		if (sp instanceof Generation1DTO) {
			return (Generation1DTO) sp;
		}
		return null;
	}

	public Generation2DTO get2Dto() {
		if (sp instanceof Generation2DTO) {
			return (Generation2DTO) sp;
		}
		return null;
	}

	public Generation3DTO get3Dto() {
		if (sp instanceof Generation3DTO) {
			return (Generation3DTO) sp;
		}
		return null;
	}

	public boolean noNullCheck(SuperPhone sp) {
		if (sp == null) {
			return false;
		}
		return true;
	}

	public void onOff() {
		Generation1DTO dto = get1Dto();
		Generation2DTO dto2 = get2Dto();
		Generation3DTO dto3 = get3Dto();
		if (dto.isPowerOnOff()) {
			if (noNullCheck(dto3)) {
				if (dto3.isWebtoonOnOff()) {
					dto3.setWebtoonOnOff(false);
					System.out.println("웹툰 앱이 종료되었습니다.");
				}
				if (dto3.isInternetOnOff()) {
					dto3.setInternetOnOff(false);
					System.out.println("인터넷이 꺼졌습니다.");
				}
			}
			if (noNullCheck(dto2)) {
				if (dto2.isDmbOnOff()) {
					dto2.setDmbOnOff(false);
					System.out.println("dmb가 꺼졌습니다.");
				}
			}
			if (dto.isCallOnOff()) {
				dto.setCallOnOff(false);
				System.out.println("통화가 종료되었습니다.");
			}
			dto.setPowerOnOff(false);
			System.out.println("전원이 꺼졌습니다.");
		} else {
			dto.setPowerOnOff(true);
			System.out.println("전원이 켜졌습니다.");

		}
	}

	public void callOnOff() {
		Generation1DTO dto = get1Dto();
		Generation2DTO dto2 = get2Dto();
		Generation3DTO dto3 = get3Dto();
		if (!dto.isPowerOnOff()) {
			System.out.println("먼저 전화를 켜주세요.");
			return;
		}
		if (noNullCheck(dto2)) {
			if (dto2.isDmbOnOff()) {
				System.out.println("먼저 dmb를 꺼주세요.");
				return;
			}
		}
		if (noNullCheck(dto3)) {
			if (dto3.isInternetOnOff()) {
				System.out.println("먼저 인터넷을 꺼주세요.");
				return;
			}
		}
		if (dto.isCallOnOff()) {
			dto.setCallOnOff(false);
			System.out.println("통화가 종료됩니다.");
		} else {
			dto.setCallOnOff(true);
			System.out.println("통화가 시작됩니다.");
		}
	}

	public void sendVoice() {
		Generation1DTO dto = get1Dto();
		if (powerRequire(dto)) {
			if (callRequire(dto)) {
				System.out.print("나:");
				sc.nextLine();
			}
		}
	}

	public void receiveVoice() {
		Generation1DTO dto = get1Dto();
		if (powerRequire(dto)) {
			if (callRequire(dto)) {
				System.out.print("상대방:");
				sc.nextLine();
			}
		}

	}

	public void dmbToggle() {
		Generation3DTO dto3 = get3Dto();
		Generation2DTO dto2 = get2Dto();
		if (noNullCheck(dto2)) {
			if (!dto2.isPowerOnOff()) {
				System.out.println("먼저 전원을 켜주세요");
				return;
			}
			if (noNullCheck(dto3)) {
				if (dto3.isInternetOnOff()) {
					System.out.println("먼저 인터넷을 꺼주세요.");
					return;
				}
			}
			if (dto2.isDmbOnOff()) {
				System.out.println("DMB를 종료합니다.");
				dto2.setDmbOnOff(false);
			} else {
				System.out.println("DMB를 시작합니다.");
				dto2.setDmbOnOff(true);
			}
		} else {
			System.out.println("DMB 불가능한 폰입니다.");
		}
	}

	public void dmbChannel() {
		Generation2DTO dto = get2Dto();
		if (noNullCheck(dto)) {
			if (!dto.isDmbOnOff()) {
				System.out.println("먼저 dmb를 켜주세요.");
			} else {
				System.out.println("변경할 채널을 입력하세요.");
				int before = dto.getChannel();
				int channel = getIntByScan();
				dto.setChannel(channel);
				System.out.println(before + "에서 " + channel + "로 채널을 변경합니다.");
			}
		} else {
			System.out.println("DMB 불가능한 핸드폰입니다.");
		}
	}

	public void internetToggle() {
		Generation3DTO dto = get3Dto();
		if (noNullCheck(dto)) {
			if (!dto.isPowerOnOff()) {
				System.out.println("먼저 전원을 켜주세요.");
			} else if (dto.isInternetOnOff()) {
				dto.setInternetOnOff(false);
				System.out.println("인터넷을 끕니다.");
				if (dto.isWebtoonOnOff()) {
					dto.setWebtoonOnOff(false);
					System.out.println("웹툰을 끕니다.");
				}
			} else {
				dto.setInternetOnOff(true);
				System.out.println("인터넷을 켭니다.");
			}
		} else {
			System.out.println("인터넷 불가능한 핸드폰입니다.");
		}
	}

	public void webtoonToggle() {
		Generation3DTO dto = get3Dto();
		if (noNullCheck(dto)) {
			if (powerRequire(dto)) {
				if (!dto.isInternetOnOff()) {
					System.out.println("먼저 인터넷을 켜주세요.");
				} else if (dto.isWebtoonOnOff()) {
					dto.setWebtoonOnOff(false);
					;
					System.out.println("웹툰을 끕니다.");
				} else {
					dto.setWebtoonOnOff(true);
					System.out.println("웹툰을 켭니다.");
				}
			}
		} else {
			System.out.println("웹툰이 불가능한 핸드폰입니다.");
		}
	}

	public boolean callRequire(Generation1DTO dto) {
		if (!dto.isCallOnOff()) {
			System.out.println("통화 중에만 가능합니다.");
			return false;
		} else {
			return true;
		}
	}

	public boolean callRequire(Generation2DTO dto) {
		if (!dto.isCallOnOff()) {
			System.out.println("통화 중에만 가능합니다.");
			return false;
		} else {
			return true;
		}
	}

	public boolean callRequire(Generation3DTO dto) {
		if (!dto.isCallOnOff()) {
			System.out.println("통화 중에만 가능합니다.");
			return false;
		} else {
			return true;
		}
	}

	public boolean powerRequire(Generation1DTO dto) {
		if (!dto.isPowerOnOff()) {
			System.out.println("먼저 전원을 켜주세요.");
			return false;
		} else {
			return true;
		}
	}

	public boolean powerRequire(Generation2DTO dto) {
		if (!dto.isPowerOnOff()) {
			System.out.println("먼저 전원을 켜주세요.");
			return false;
		} else {
			return true;
		}
	}

	public boolean powerRequire(Generation3DTO dto) {
		if (!dto.isPowerOnOff()) {
			System.out.println("먼저 전원을 켜주세요.");
			return false;
		} else {
			return true;
		}
	}

}