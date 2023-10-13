package Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import pack02.product.ProductMain;

public class ProductAdminDAO {
	Scanner scan = new Scanner(System.in);
	ProductDAO dao = new ProductDAO();
	ProductMain main = new ProductMain();
	
	public ProductAdminDTO adminInfo() {
		ProductAdminDTO adminDto = new ProductAdminDTO("admin", "admin1");
		return adminDto;
	}

	public boolean adminLogin() {
		ProductAdminDTO adminDto = adminInfo();
		while (true) {
			System.out.println("관리자 모드 로그인 0. 돌아가기");
			System.out.print("아이디 입력 : ");
			String id = scan.nextLine();
			if (id.equals("0")) {
				return false;
			}
			System.out.print("비밀번호 입력 : ");
			String pw = scan.nextLine();
			if (pw.equals("0")) {
				return false;
			} else if (id.equals(adminDto.getId()) && pw.equals(adminDto.getPw())) {
				System.out.println("로그인 성공");
				return true;
			} else {
				System.out.println("아이디 또는 비밀번호를 확인하세요");
			}
		}
	}

	public boolean adminMenu(ProductDTO[] Dtos) {
		dao.displays(Dtos);
		int menuNum = selectAdminMenu();
		if (menuNum == 4) {
			return false;
		}
		if (menuNum == 0) {
			dtoSortMethod(Dtos);
		}
		if (menuNum == 1) {
			Dtos = addProduct(Dtos);
		}
		if (menuNum == 2) {
			Dtos = editProduct(Dtos);
		}
		if (menuNum == 3) {
			Dtos = deleteProduct(Dtos);
		}
		return true;
	}

	public int selectAdminMenu() {
		while (true) {
			System.out.println("관리자 메뉴");
			System.out.println("0. 상품 정렬 방법 변경");
			System.out.println("1. 상품 추가");
			System.out.println("2. 상품 수정");
			System.out.println("3. 상품 삭제");
			System.out.println("4. 이전으로 (로그아웃)");
			String str = scan.nextLine();
			if (str.equals("4")) {
				return 4;
			} else if (str.equals("0")) {
				return 0;
			} else if (str.equals("1")) {
				return 1;
			} else if (str.equals("2")) {
				return 2;
			} else if (str.equals("3")) {
				return 3;
			} else {
				System.out.println("잘못 된 입력");
			}
		}
	}

	public ProductDTO[] dtoSortMethod(ProductDTO[] Dtos) {
		System.out.println("정렬 방법 선택");
		System.out.println("1. 상품 번호 순서");
		System.out.println("2. 상품 번호 순서r");
		System.out.println("3. 상품 이름 순서");
		System.out.println("4. 상품 이름 순서r");
		System.out.println("5. 상품 가격 순서");
		System.out.println("6. 상품 가격 순서r");
		String str = scan.nextLine();
		if (str.equals("1")) {
			System.out.println("1. 상품 번호 순서");
			Arrays.sort(Dtos, (o1, o2) -> {
				return Integer.compare(o1.getIndex(), o2.getIndex());
			});
		} else if (str.equals("2")) {
			System.out.println("2. 상품 번호 순서r");
			Arrays.sort(Dtos, (o1, o2) -> {
				return Integer.compare(o2.getIndex(), o1.getIndex());
			});
		} else if (str.equals("3")) {
			System.out.println("3. 상품 이름 순서");
			Arrays.sort(Dtos, (o1, o2) -> {
				return o1.getName().compareTo(o2.getName());
			});
		} else if (str.equals("4")) {
			System.out.println("4. 상품 이름 순서r");
			Arrays.sort(Dtos, (o1, o2) -> {
				return o2.getName().compareTo(o1.getName());
			});
		} else if (str.equals("5")) {
			System.out.println("5. 상품 가격 순서");
			Arrays.sort(Dtos, (o1, o2) -> {
				return Integer.compare(o1.getPrice(), o2.getPrice());
			});
		} else if (str.equals("6")) {
			System.out.println("6. 상품 가격 순서r");
			Arrays.sort(Dtos, (o1, o2) -> {
				return Integer.compare(o1.getPrice(), o2.getPrice());
			});
		} else {
			System.out.println("잘못 된 입력");
		}
		return Dtos;
	}

	public ProductDTO[] addProduct(ProductDTO[] Dtos) {
		System.out.println("1. 상품 추가");
		int length = Dtos.length;
		ProductDTO[] tempDtos = new ProductDTO[length + 1];
		for (int i = 0; i < length; i++) {
			tempDtos[i] = Dtos[i];
		}
		int index = 1;
		while (true) {
			int count = 0;
			for (int i = 0; i < Dtos.length; i++) {
				if (index != Dtos[i].getIndex()) {
					count++;
				}
			}
			if (count == Dtos.length) {
				break;
			}
			index++;
		}
		System.out.println("상품 번호 : " + index);
		System.out.println("상품 이름을 입력하세요");
		String name = scan.nextLine();
		int price = 0;
		while (true) {
			System.out.println("상품 가격을 입력하세요");
			String str = scan.nextLine();
			try {
				int temp = Integer.parseInt(str);
				if (temp <= 0) {
					System.out.println("잘못된 입력");
					continue;
				} else {
					price = temp;
					break;
				}
			} catch (Exception e) {
				System.out.println("잘못된 입력");
				continue;
			}
		}
		ProductDTO tempDto = new ProductDTO(index, name, price);
		tempDtos[length] = tempDto;
		return tempDtos;
	}

	public ProductDTO[] editProduct(ProductDTO[] Dtos) {
		while (true) {
			System.out.println("2. 상품 수정");
			int[] searched = productSearchByName(Dtos);
			if (searchedResult(Dtos, searched)) {
				Dtos = editProcess(Dtos, searched);
				break;
			}
		}
		return Dtos;
	}

	public int[] productSearchByName(ProductDTO[] Dtos) {
		while (true) {
			System.out.println("원하는 상품의 이름, 번호를 입력하세요. 0. 돌아가기");
			String str = scan.nextLine();
			if (str.equals("0")) {
				int[] arr = new int[0];
				return arr;
			}
			HashMap<Integer, String> tempHash = new HashMap<>();
			for (int i = 0; i < Dtos.length; i++) {
				try {
					int tempInt = Integer.parseInt(str);
					if (Dtos[i].getIndex() == tempInt) {
						tempHash.put(i, Dtos[i].getName());
					}
				} catch (Exception e) {
				}
				if (Dtos[i].getName().contains(str)) {
					tempHash.put(i, Dtos[i].getName());
				}
			}
			if (tempHash.size() != 0) {
				int length = tempHash.size();
				int[] tempArr = new int[length];
				int count = 0;
				for (int i : tempHash.keySet()) {
					tempArr[count] = i;
					count++;
				}
				Arrays.sort(tempArr);
				return tempArr;
			} else {
				System.out.println("검색 결과가 없습니다.");
				System.out.println("다시 검색하세요.");
			}
		}
	}

	public boolean searchedResult(ProductDTO[] Dtos, int[] arr) {
		if (arr.length == 0) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("검색 번호 " + (i + 1) + " : " + Dtos[arr[i]].getIndex() + ". " + Dtos[arr[i]].getName()
					+ " " + Dtos[arr[i]].getPrice() + "원");
		}
		return true;
	}

	public ProductDTO[] editProcess(ProductDTO[] Dtos, int[] arr) {
		while (true) {
			System.out.println("수정할 상품의 검색 번호를 입력하세요 0. 돌아가기");
			try {
				int temp = Integer.parseInt(scan.nextLine());
				if (temp == 0) {
					System.out.println("상품 수정 종료");
					break;
				} else if (temp <= arr.length && temp > 0) {
					ProductDTO dto = Dtos[arr[temp - 1]];
					System.out.println(temp + "번 선택");
					dao.display(dto);
					System.out.println("수정할 이름을 입력하세요");
					dto.setName(scan.nextLine());
					while (true) {
						System.out.println("수정할 가격을 입력하세요");
						try {
							int tempPrice = Integer.parseInt(scan.nextLine());
							if (tempPrice > 0) {
								dto.setPrice(tempPrice);
								break;
							}
						} catch (Exception e) {
						}
						System.out.println("입력 오류");
					}
					Dtos[arr[temp - 1]] = dto;
					System.out.println("수정 결과");
					dao.display(dto);
				} else {
					System.out.println("입력 오류");
				}
			} catch (Exception e) {
				System.out.println("입력 오류");
				continue;
			}
		}
		return Dtos;
	}

	public ProductDTO[] deleteProduct(ProductDTO[] Dtos) {
		while (true) {
			System.out.println("3. 상품 삭제");
			int[] searched = productSearchByName(Dtos);
			if (searchedResult(Dtos, searched)) {
				Dtos = deleteProcess(Dtos, searched);
				break;
			}
		}
		return Dtos;
	}

	public ProductDTO[] deleteProcess(ProductDTO[] Dtos, int[] arr) {
		while (true) {
			System.out.println("삭제할 상품의 검색 번호를 입력하세요 0. 돌아가기");
			int temp;
			try {
				temp = Integer.parseInt(scan.nextLine());
			} catch (Exception e) {
				System.out.println("입력 오류");
				continue;
			}
			if (temp == 0) {
				System.out.println("상품 수정 종료");
				break;
			} else if (temp <= arr.length && temp > 0) {
				ProductDTO dto = Dtos[arr[temp - 1]];
				dao.display(dto);
				System.out.println("정말 삭제하시겠습니까?");
				System.out.println("삭제하려면 아무 키나 입력 0. 돌아가기 ");
				String str = scan.nextLine();
				if (str.equals("0")) {
					break;
				} else {
					ProductDTO[] tempDtos = new ProductDTO[Dtos.length - 1];
					int count = 0;
					for (int i = 0; i < Dtos.length; i++) {
						if (i != (arr[temp - 1])) {
							tempDtos[count] = Dtos[i];
							count++;
						}
					}
					dao.displays(tempDtos);
					;
					Dtos = tempDtos;
				}
			}
		}
		return Dtos;
	}
}
