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

	public int userLogin(ProductUserDTO[] userDtos) {
		while (true) {
			System.out.println("사용자 모드 로그인 0. 돌아가기");
			System.out.print("아이디 입력:");
			String id = sc.nextLine();
			System.out.print("비밀번호 입력:");
			String pw = sc.nextLine();

			if (id.equals("0") || pw.equals("0")) {
				return -1;

			} else if (userLoginCheckB(userDtos, id, pw)) {
				System.out.println("로그인 성공");
				return userLoginCheckI(userDtos, id, pw);
			} else {
				System.out.println("아이디 또는 비밀번호를 확인하세요");
			}
		}
	}

	public boolean userLoginCheckB(ProductUserDTO[] userDtos, String id, String pw) {
		for (int i = 0; i < userDtos.length; i++) {
			if (userDtos[i].getId().equals(id) && userDtos[i].getPw().equals(pw)) {
				return true;
			}
		}
		return false;
	}

	public int userLoginCheckI(ProductUserDTO[] userDtos, String id, String pw) {
		for (int i = 0; i < userDtos.length; i++) {
			if (userDtos[i].getId().equals(id) && userDtos[i].getPw().equals(pw)) {
				return i;
			}
		}
		return -1;
	}

	public int selectUserMenu() {
		while (true) {
			System.out.println("유저 메뉴");
			System.out.println("1. 상품 검색");
			System.out.println("4. 포인트 충전");
			System.out.println("6. 장바구니");
			System.out.println("9. 이전으로 (로그아웃)");
			String str = sc.nextLine();
			if (str.equals("9")) {
				return 9;
			} else if (str.equals("0")) {
				return 0;
			} else if (str.equals("1")) {
				return 1;
			} else if (str.equals("4")) {
				return 4;
			} else if (str.equals("6")) {
				return 6;
			} else {
				System.out.println("잘못 된 입력");
			}
		}
	}

	public ProductUserDTO userMenu(ProductDTO[] dtos, ProductUserDTO userDto) {
		while (true) {
			dao.displays(dtos);
			int menuNum = selectUserMenu();
			if (menuNum == 4) {
				userDto = fillPoint(userDto);
			}
			if (menuNum == 0) {

			}
			if (menuNum == 1) {
				productSearchPurchase(dtos, userDto);
			}
			if (menuNum == 2) {

			}
			if (menuNum == 3) {

			}
			if (menuNum == 6) {
				userDto = kartsPurchaseProcess(dtos, userDto);
			}
			if (menuNum == 9) {
				break;
			}
		}
		return userDto;
	}

	public void productSearchPurchase(ProductDTO[] dtos, ProductUserDTO userDto) {
		int[] tempArr = adminDao.productSearchByName(dtos);
		if (adminDao.searchedResult(dtos, tempArr)) {
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
					ProductDTO dto = dtos[tempArr[tempNum - 1]];
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
						userDto=productPurchaseCount(dto, userDto);
					} else if (a == 2) {
						userDto=addTokarts(userDto, dto.getIndex(), dao.inputNum());
					}
					break;
				} else {
					System.out.println("입력 오류");
				}
			}
		}
	}

	public ProductUserDTO productPurchaseCount(ProductDTO dto, ProductUserDTO userDto) {
		dao.display(dto);
		System.out.println("구매 수량을 입력하세요");
		while (true) {
			try {
				int temp = Integer.parseInt(sc.nextLine());
				if (temp <= 0) {
					System.out.println("자연수를 입력하세요");
				} else {
					dao.display(dto);
					System.out.println(temp + "개 가격 : " + temp * dto.getPrice());
					System.out.println("1. 구매    0.아무 키나 눌러 취소");
					if (sc.nextLine().equals("1")) {
						userDto = productPurchaseProcess(userDto, temp);// 여기서 중단됨
					}
					return userDto;
				}
			} catch (Exception e) {
				System.out.println("입력 오류");
			}
		}
	}

	public ProductUserDTO productPurchaseProcess(ProductUserDTO userDto, int temp) {
		System.out.println("상품 구매 중...");
		if (userDto.getPoint() >= temp) {
			System.out.println("구매 완료");
			userDto.setPoint((userDto.getPoint() - temp));
			System.out.println("현재 포인트 잔액 : " + userDto.getPoint());
		} else {
			System.out.println("잔액이 부족합니다.");
		}
		return userDto;
	}

	public ProductUserDTO addTokarts(ProductUserDTO userDto, int productIdx, int productNum) {
		int[][] temp = new int[userDto.karts.length + 1][2];
		for (int i = 0; i < userDto.karts.length; i++) {
			temp[i] = userDto.getKarts()[i];
		}
		temp[userDto.karts.length][0] = productIdx;
		temp[userDto.karts.length][1] = productNum;
		userDto.setKarts(temp);
		return userDto;
	}

	public ProductUserDTO deleteFromkarts(ProductUserDTO userDto, int num) {
		int[][] temp = new int[userDto.getKarts().length - 1][2];
		int count = 0;
		for (int i = 0; i < temp.length + 1; i++) {
			if (i != num) {
				temp[count] = userDto.getKarts()[i];
				count++;
			}
		}
		userDto.setKarts(temp);
		return userDto;

	}

	public ProductUserDTO kartsPurchaseProcess(ProductDTO[] dtos, ProductUserDTO userDto) {
		displaykarts(userDto, dtos);
		System.out.println("구매시 아무 키나 입력 0. 취소");
		if (sc.nextLine().equals("0")) {
			return userDto;
		}
		int sum = 0;
		for (int i = 0; i < userDto.getKarts().length; i++) {
			for (ProductDTO dto : dtos) {
				if (userDto.getKarts()[i][0] == dto.getIndex()) {
					sum += userDto.getKarts()[i][1] * dto.getPrice();
				}
			}

		}
		return productPurchaseProcess(userDto, sum);
	}

	public void displaykarts(ProductUserDTO userDto, ProductDTO[] dtos) {
		for (int i = 0; i < userDto.getKarts().length; i++) {
			for (ProductDTO dto : dtos) {
				if (userDto.getKarts()[i][0] == dto.getIndex()) {
					System.out.println(dto.getIndex() + ". " + dto.getName() + " " + dto.getPrice() + "원"
							+ userDto.getKarts()[i][1] + "개");
				}
			}
		}
	}

	public ProductUserDTO fillPoint(ProductUserDTO userDto) {
		System.out.println("4. 포인트 충전");
		while (true) {
			System.out.println("충전 금액을 입력하세요 0. 돌아가기");
			int point = 0;
			try {
				point = Integer.parseInt(sc.nextLine());
				userDto.setPoint(userDto.getPoint() + point);
				break;
			} catch (Exception e) {
				System.out.println("입력 오류");
			}
			if (point < 0) {
				System.out.println("자연수를 입력하세요");
				continue;
			}
		}
		return userDto;
	}

	public void displayCustomerData(ProductUserDTO userDto) {// 회원정보
		System.out.println("이름:" + userDto.getName());
		System.out.println("전화번호:" + userDto.getTel());
		System.out.println("주소:" + userDto.getAdress());
		System.out.println("이메일:" + userDto.getEmail());
		System.out.println("point:" + userDto.getPoint());
	}

}