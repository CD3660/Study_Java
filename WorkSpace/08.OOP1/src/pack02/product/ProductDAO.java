package pack02.product;

import java.util.Scanner;

public class ProductDAO {
	public void display(ProductDTO dto) {
		System.out.println(dto.getNum() + ". " + dto.getName() + " " + dto.getPrice() + "원");
	}

	public void displays(ProductDTO[] dtos) {
		for (int i = 0; i < dtos.length; i++) {
			display(dtos[i]);
		}
	}

	public ProductDTO[] selectRead() {
		ProductDTO[] dtos = new ProductDTO[5];

		dtos[0] = new ProductDTO(1, 15000, "스카프");
		dtos[1] = new ProductDTO(2, 1000, "마늘");
		dtos[2] = new ProductDTO(3, 66000, "커피");
		dtos[3] = new ProductDTO(4, 6000, "피");
		dtos[4] = new ProductDTO(5, 6600, "커");
		return dtos;
	}

	public ProductDTO[] delete(ProductDTO[] dtos) {
		int choice = userInputNum("삭제 상품 번호 입력") - 1;
		if (choice <= dtos.length && choice > 0) {
			dtos[choice - 1] = null;

			ProductDTO[] tempDtos = new ProductDTO[dtos.length - 1];
			int idx = 0;
			for (ProductDTO dto : dtos) {
				if (dto != null) {
					tempDtos[idx] = dto;
					idx++;
				}
			}
			return tempDtos;
		} else {
			System.out.println("해당 상품 없음");
			return dtos;
		}
	}

	public int userInputNum(String str) {
		while (true) {
			System.out.println(str);
			Scanner scan = new Scanner(System.in);
			try {
				int inputNum = Integer.parseInt(scan.nextLine());
				return inputNum;
			} catch (Exception e) {
				System.out.println("입력 오류");
			}
		}
	}
}
