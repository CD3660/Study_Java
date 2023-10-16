package product;

import common.Common;

public class ProductDAO {
	Common common;

	public ProductDAO(Common common) {
		this.common = common;
	}

	public void addItem() {
		dispayItem();
		System.out.println("가격 입력 엔터, 수량 입력 엔터, 상품명 입력 엔터");
		ProductDTO newDto = new ProductDTO(common.getIntScanner(0), common.getIntScanner(0), common.getStringScanner());
		ProductDTO[] temp = new ProductDTO[common.getItems().length + 1];
		for (int i = 0; i < common.getItems().length; i++) {
			temp[i] = common.getItems()[i];
		}
		temp[common.getItems().length] = newDto;
		common.setItems(temp);
	}

	public void buyItem() {
		dispayItem();
		System.out.println("1 ~ " + common.getItems().length + " 선택 가능");
		int choiceMenu = common.getIntScanner(1, common.getItems().length);
		if (common.getItems()[choiceMenu - 1].getQty() == 0) {
			System.out.println("수량 부족!!");
			return;
		} else if (common.getLoginInfo().getMoney() >= common.getItems()[choiceMenu - 1].getPrice()) {
			System.out.println("구매 완료");
			common.getLoginInfo()
					.setMoney(common.getLoginInfo().getMoney() - common.getItems()[choiceMenu - 1].getPrice());
			common.getItems()[choiceMenu - 1].setQty(common.getItems()[choiceMenu - 1].getQty() - 1);
		} else {
			System.out.println("금액 부족!!");
		}
	}

	public void dispayItem() {
		for (int i = 0; i < common.getItems().length; i++) {
			System.out.print((i + 1) + "." + common.getItems()[i].getName() + " ");
			System.out.print(common.getItems()[i].getPrice() + "원 ");
			System.out.println(common.getItems()[i].getQty() + "개 남음");
		}
	}

	public ProductDTO[] initItems() {
		ProductDTO[] dtos = new ProductDTO[3];
		dtos[0] = new ProductDTO(1000, 10, "마우스");
		dtos[1] = new ProductDTO(1900, 5, "키보드");
		dtos[2] = new ProductDTO(9000, 1, "스피커");

		return dtos;
	}
}
