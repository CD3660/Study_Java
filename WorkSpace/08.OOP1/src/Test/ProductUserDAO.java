package Test;

import java.util.Scanner;

public class ProductUserDAO {
	// 개인정보 수정(이름, 주소, 연락처, 이메일, 비밀번호) 포인트 충전
	// 상품 정렬(가격순, 역순, 상품명 순, 역순, 가격순, 역순, 가격 범위, 베스트)
	// userDto


	Scanner scan = new Scanner(System.in);
	public ProductUserDTO userIndex() {
		ProductUserDTO dto = new ProductUserDTO("user", "user1");
		return dto;
	}
	public boolean userLogin() {
		ProductUserDTO dto = userIndex();
		while (true) {
			System.out.println("-1입력시 돌아가기");
			System.out.print("아이디 입력 : ");
			String id = scan.nextLine();
			System.out.print("비밀번호 입력 : ");
			String pw = scan.nextLine();
			if(id.equals("-1")||pw.equals("-1")) {
				return false;
			}
			if(dto.id.equals(id)&&dto.pw.equals(pw)) {
				return true;
			}
		}
	}

}
