package member;

import common.Common;
import product.ProductDAO;

public class MemberDAO {
	Common common;
	ProductDAO dao;

	public MemberDAO(Common common) {
		this.common = common;
	}

	public void login(String id, String pw) {
		MemberDTO[] memDtos = getLoginDatas();
		for (MemberDTO memDto : memDtos) {
			if (memDto.getId().equals(id) && memDto.getPw().equals(pw)) {
				System.out.println("성공");
				common.setLoginInfo(memDto);
			}
		}
	}

	public MemberDTO[] getLoginDatas() {
		MemberDTO[] memDtos = new MemberDTO[2];
		memDtos[0] = new MemberDTO("user", "user1", "사용자", "첫유저");
		memDtos[1] = new MemberDTO("admin", "admin1", "관리자", "첫관리자", true);
		return memDtos;
	}

	public void inputMoney() {
		System.out.println("금액입력");
		common.getLoginInfo().setMoney(common.getLoginInfo().getMoney() + common.getIntScanner(100));
	}

	public void displayMoney() {
		System.out.println(common.getLoginInfo().getMoney() + "원");
	}

	public void startUserMode() {
		if (common.getLoginInfo() == null)
			return;
		dao = new ProductDAO(common);
		while (true) {
			System.out.println("1. 금액 입력 2. 상품 구매 3. 잔돈 확인 4. 종료(로그아웃)");
			int choiceMenu = common.getIntScanner();
			if (choiceMenu == 1) {
				inputMoney();
			} else if (choiceMenu == 2) {
				dao.buyItem();
			} else if (choiceMenu == 3) {
				displayMoney();
			} else if (choiceMenu == 4) {
				break;
			} else {
				System.out.println("잘못 입력");
			}

		}
	}

	public void startAdminMode() {
		if (common.getLoginInfo() == null || common.getLoginInfo().isAdmin() == false) {
			System.out.println("관리자 계정만 접근 가능");
			return;
		}
		dao = new ProductDAO(common);
		while (true) {
			System.out.println("1. 상품 추가 2. 준비중 3. 준비중 4. 종료(로그아웃)");
			int choiceMenu = common.getIntScanner();
			if (choiceMenu == 1) {
				dao.addItem();
			} else if (choiceMenu == 2) {

			} else if (choiceMenu == 3) {

			} else if (choiceMenu == 4) {
				break;
			} else {
				System.out.println("잘못 입력");
			}
		}
	}

	public void startUserLogin() {

		while (true) {
			System.out.println("1. 사용자 모드 2. 관리자 모드 3. 종료");
			System.out.println("메뉴 선택");
			int choiceMenu = common.getIntScanner();
			if (choiceMenu == 1) {
				login(common.getStringScanner("아이디 입력"), common.getStringScanner("비밀번호 입력"));
				startUserMode();
			} else if (choiceMenu == 2) {
				login(common.getStringScanner("아이디 입력"), common.getStringScanner("비밀번호 입력"));
				startAdminMode();
			} else if (choiceMenu == 3) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("다시 선택");
			}
		}
	}
}
