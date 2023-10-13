package Test;

import java.util.Scanner;

public class ProductUserDAO {
	// 개인정보 수정(이름, 주소, 연락처, 이메일, 비밀번호) 포인트 충전
	// 상품 정렬(가격순, 역순, 상품명 순, 역순, 가격순, 역순, 가격 범위, 베스트)
	Scanner sc = new Scanner(System.in);
	ProductDAO dao = new ProductDAO();
	ProductAdminDAO adminDao = new ProductAdminDAO();
	ProductDTO dto = new ProductDTO(0, null, 0);

	public ProductUserDTO[] userIndex() {
		ProductUserDTO userDtos[] = new ProductUserDTO[1];
		userDtos[0] = new ProductUserDTO("user", "user1");
		return userDtos;
	}

	public boolean userLogin(ProductUserDTO[] userDtos) {
		while (true) {
			System.out.println("사용자 모드 로그인 0. 돌아가기");
			System.out.print("아이디 입력:");
			String id = sc.nextLine();
			System.out.print("비밀번호 입력:");
			String pw = sc.nextLine();

			if (id.equals("0") || pw.equals("0")) {
				return false;

			} else if (userLoginCheck(userDtos, id, pw)) {
				System.out.println("로그인 성공");
				return true;
			} else {
				System.out.println("아이디 또는 비밀번호를 확인하세요");
			}
		}
	}

	public boolean userLoginCheck(ProductUserDTO[] userDtos, String id, String pw) {
		for (int i = 0; i < userDtos.length; i++) {
			if (userDtos[i].getId().equals(id) && userDtos[i].getPw().equals(pw)) {
				return true;
			}
		}
		return false;
	}

	public int selectUserMenu() {
		while (true) {
			System.out.println("유저 메뉴");
			System.out.println("0. 개인 정보 수정");
			System.out.println("1. 상품 검색");
			System.out.println("2. 상품 정렬 방법 변경");
			System.out.println("3. 상품 구매");
			System.out.println("4. 포인트 충전");
			System.out.println("5. 포인트 반환");
			System.out.println("6. 장바구니");
			System.out.println("9. 이전으로 (로그아웃)");
			String str = sc.nextLine();
			if (str.equals("9")) {
				return 9;
			} else if (str.equals("0")) {
				return 0;
			} else if (str.equals("1")) {
				return 1;
			} else if (str.equals("2")) {
				return 2;
			} else if (str.equals("4")) {
				return 4;
			} else if (str.equals("5")) {
				return 5;
			} else if (str.equals("6")) {
				return 6;
			} else {
				System.out.println("잘못 된 입력");
			}
		}
	}

	public boolean userMenu(ProductDTO[] Dtos) {
		dao.displays(Dtos);
		int menuNum = selectUserMenu();
		if (menuNum == 4) {
			return false;
		}
		if (menuNum == 0) {

		}
		if (menuNum == 1) {

		}
		if (menuNum == 2) {

		}
		if (menuNum == 3) {

		}
		return true;
	}

	public void productSearchPurchase(ProductDTO[] Dtos, int userNum) {
		int[] tempArr = adminDao.productSearchByName(Dtos);
		if (adminDao.searchedResult(Dtos, tempArr)) {
			while (true) {
				System.out.println("구매하고 싶은 상품의 검색 번호를 입력하세요. 0. 돌아가기");
				int tempNum = 0;
				try {
					tempNum = Integer.parseInt(sc.nextLine());
				} catch (Exception e) {
					System.out.println("입력 오류");
					continue;
				}
				if (tempNum == 0) {
					System.out.println("상품 검색 종료");
				} else if (tempNum > 0 && tempNum <= tempArr.length) {
					ProductDTO dto = Dtos[tempArr[tempNum - 1]];
					System.out.println(tempNum + "번 선택");
					dao.display(dto);
					System.out.println("원하는 작업을 선택하세요.");
					System.out.println("1. 즉시 구매 2. 장바구니 0. 돌아가기");
					int a = 0;
					while (true) {
						try {
							a = Integer.parseInt(sc.nextLine());
							if (a >= 0 && a <= 2) {
								break;
							} else {
								System.out.println("입력 오류");
							}
						} catch (Exception e) {
							System.out.println("입력 오류");
						}
					}
					if (a == 0) {
						System.out.println("상품 검색 종료");
					} else if (a == 1) {

					} else if (a == 2) {

					}
					break;
				} else {
					System.out.println("입력 오류");
				}
			}
		}
	}

	public void productPurchaseCount(ProductDTO Dto, ProductUserDTO userDto) {
		dao.display(Dto);
		System.out.println("구매 수량을 입력하세요");
		while (true) {
			try {
				int temp = Integer.parseInt(sc.nextLine());
				if (temp <= 0) {
					System.out.println("자연수를 입력하세요");
				} else {
					dao.display(Dto);
					System.out.println(temp + "개 가격 : " + temp * dto.getPrice());
					System.out.println("1. 구매    0.아무 키나 눌러 취소");
					if (sc.nextLine().equals("1")) {
						productPurchaseProcess(Dto, userDto, temp);// 여기서 중단됨
					}
					break;
				}
			} catch (Exception e) {
				System.out.println("입력 오류");
			}
		}
	}

	public void productPurchaseProcess(ProductDTO Dto, ProductUserDTO userDto, int temp) {
		System.out.println("상품 구매 중...");
		if (userDto.getPoint() >= temp) {
			System.out.println("구매 완료");
			userDto.setPoint((userDto.getPoint() - temp));
			System.out.println("현재 포인트 잔액 : " + userDto.getPoint());
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}

	public void displayCustomerData(ProductUserDTO userDto) {// 회원정보
		System.out.println("이름:" + userDto.getName());
		System.out.println("전화번호:" + userDto.getTel());
		System.out.println("주소:" + userDto.getAdress());
		System.out.println("이메일:" + userDto.getEmail());
		System.out.println("point:" + userDto.getPoint());
	}


}