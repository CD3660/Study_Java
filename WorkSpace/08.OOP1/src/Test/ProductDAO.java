package Test;

import java.util.Scanner;

public class ProductDAO {
	
	public ProductDTO[] productList() {
		ProductDTO[] Dtos = new ProductDTO[5];
		Dtos[0] = new ProductDTO(1, "스카프", 15000);
		Dtos[1] = new ProductDTO(2, "마늘", 3000);
		Dtos[2] = new ProductDTO(3, "커피", 55000);
		Dtos[3] = new ProductDTO(4, "콜라", 1500);
		Dtos[4] = new ProductDTO(5, "가방", 15000);

		return Dtos;
	}
	
	public int chooseMode() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("1. 사용자 모드   2. 관리자 모드    3. 종료");
			String str = scan.nextLine();
			if(str.equals("1")) {
				return 1;
			} else if(str.equals("2")) {
				return 2;
			} else if(str.equals("3")){
				return 3;
			} else {
				System.out.println("입력 오류");
				System.out.println();
			}
		}
	}
	
	public void display(ProductDTO Dto) {
		System.out.println(Dto.getIndex() + ". " + Dto.getName() + " " + Dto.getPrice() + "원");
	}

	public void displays(ProductDTO[] Dtos) {
		System.out.println("상품 목록");
		for (int i = 0; i < Dtos.length; i++) {
			display(Dtos[i]);
		}
	}
}
