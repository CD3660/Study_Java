package Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ProductAdminDAO {
	Scanner scan = new Scanner(System.in);

	public ProductAdminDTO[] productList() {
		ProductAdminDTO[] adminDtos = new ProductAdminDTO[5];
		adminDtos[0] = new ProductAdminDTO(1, "스카프", 15000);
		adminDtos[1] = new ProductAdminDTO(2, "마늘", 3000);
		adminDtos[2] = new ProductAdminDTO(3, "커피", 55000);
		adminDtos[3] = new ProductAdminDTO(4, "콜라", 1500);
		adminDtos[4] = new ProductAdminDTO(5, "가방", 15000);

		return adminDtos;
	}

	public boolean adminLogin() {
		while (true) {
			System.out.println("-1입력시 돌아가기");
			System.out.print("아이디 입력 : ");
			String id = scan.nextLine();
			System.out.print("비밀번호 입력 : ");
			String pw = scan.nextLine();
			if (id.equals("-1") || pw.equals("-1")) {
				return false;
			} else if (id.equals("admin") && pw.equals("admin1")) {
				System.out.println("로그인 성공");
				return true;
			} else {
				System.out.println("아이디 또는 비밀번호를 확인하세요");
			}
		}
	}

	public void display(ProductAdminDTO adminDto) {
		System.out.println(adminDto.getIndex() + ". " + adminDto.getName() + " " + adminDto.getPrice() + "원");
	}

	public void displays(ProductAdminDTO[] adminDtos) {
		System.out.println("상품 목록");
		for (int i = 0; i < adminDtos.length; i++) {
			display(adminDtos[i]);
		}
	}

	public int selectAdminMenu() {
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
			return 0;
		}
	}

	public ProductAdminDTO[] dtoSortMethod(ProductAdminDTO[] adminDtos) {
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
			Arrays.sort(adminDtos, (o1, o2) -> {
				return Integer.compare(o1.getIndex(), o2.getIndex());
			});
		} else if (str.equals("2")) {
			System.out.println("2. 상품 번호 순서r");
			Arrays.sort(adminDtos, (o1, o2) -> {
				return Integer.compare(o2.getIndex(), o1.getIndex());
			});
		} else if (str.equals("3")) {
			System.out.println("3. 상품 이름 순서");
			Arrays.sort(adminDtos, (o1, o2) -> {
				return o1.getName().compareTo(o2.getName());
			});
		} else if (str.equals("4")) {
			System.out.println("4. 상품 이름 순서r");
			Arrays.sort(adminDtos, (o1, o2) -> {
				return o2.getName().compareTo(o1.getName());
			});
		} else if (str.equals("5")) {
			System.out.println("5. 상품 가격 순서");
			Arrays.sort(adminDtos, (o1, o2) -> {
				return Integer.compare(o1.getPrice(), o2.getPrice());
			});
		} else if (str.equals("6")) {
			System.out.println("6. 상품 가격 순서r");
			Arrays.sort(adminDtos, (o1, o2) -> {
				return Integer.compare(o1.getPrice(), o2.getPrice());
			});
		} else {
			System.out.println("잘못 된 입력");
		}
		return adminDtos;
	}

	public ProductAdminDTO[] addProduct(ProductAdminDTO[] adminDtos) {
		System.out.println("1. 상품 추가");
		int length = adminDtos.length;
		ProductAdminDTO[] tempDtos = new ProductAdminDTO[length + 1];
		for (int i = 0; i < length; i++) {
			tempDtos[i] = adminDtos[i];
		}
		int index = 1;
		while (true) {
			int count = 0;
			for (int i = 0; i < adminDtos.length; i++) {
				if (index != adminDtos[i].getIndex()) {
					count++;
				}
			}
			if (count == adminDtos.length) {
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
		ProductAdminDTO tempDto = new ProductAdminDTO(index, name, price);
		tempDtos[length] = tempDto;
		return tempDtos;
	}

	public ProductAdminDTO[] editProduct(ProductAdminDTO[] adminDtos) {
		while (true) {
			System.out.println("2. 상품 수정");
			int[] searched = productSearchByName(adminDtos);
			if (searchedResult(adminDtos, searched)) {
				adminDtos = editProcess(adminDtos, searched);
				break;
			}
		}
		return adminDtos;
	}

	public int[] productSearchByName(ProductAdminDTO[] adminDtos) {
		while (true) {
			System.out.println("원하는 상품의 이름, 번호를 입력하세요. 0. 돌아가기");
			String str = scan.nextLine();
			if (str.equals("0")) {
				int[] arr = new int[0];
				return arr;
			}
			HashMap<Integer, String> tempHash = new HashMap<>();
			for (int i = 0; i < adminDtos.length; i++) {
				try {
					int tempInt = Integer.parseInt(str);
					if (adminDtos[i].getIndex() == tempInt) {
						tempHash.put(i, adminDtos[i].getName());
					}
				} catch (Exception e) {
				}
				if (adminDtos[i].getName().contains(str)) {
					tempHash.put(i, adminDtos[i].getName());
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

	public boolean searchedResult(ProductAdminDTO[] adminDtos, int[] arr) {
		if (arr.length == 0) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("검색 번호 " + (i + 1) + " : " + adminDtos[arr[i]].getIndex() + ". "
					+ adminDtos[arr[i]].getName() + " " + adminDtos[arr[i]].getPrice() + "원");
		}
		return true;
	}

	public ProductAdminDTO[] editProcess(ProductAdminDTO[] adminDtos, int[] arr) {
		while (true) {
			System.out.println("수정할 상품의 검색 번호를 입력하세요 0. 돌아가기");
			try {
				int temp = Integer.parseInt(scan.nextLine());
				if (temp == 0) {
					System.out.println("상품 수정 종료");
					break;
				} else if (temp <= arr.length && temp > 0) {
					ProductAdminDTO dto = adminDtos[arr[temp - 1]];
					System.out.println(temp + "번 선택");
					display(dto);
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
					adminDtos[arr[temp - 1]] = dto;
					System.out.println("수정 결과");
					display(dto);
				}
			} catch (Exception e) {
				System.out.println("입력 오류");
				continue;
			}
		}
		return adminDtos;
	}

	public ProductAdminDTO[] deleteProduct(ProductAdminDTO[] adminDtos) {
		while (true) {
			System.out.println("3. 상품 삭제");
			int[] searched = productSearchByName(adminDtos);
			if (searchedResult(adminDtos, searched)) {
				adminDtos = deleteProcess(adminDtos, searched);
				break;
			}
		}
		return adminDtos;
	}

	public ProductAdminDTO[] deleteProcess(ProductAdminDTO[] adminDtos, int[] arr) {
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
				ProductAdminDTO dto = adminDtos[arr[temp-1]];
				display(dto);
				System.out.println("정말 삭제하시겠습니까?");
				System.out.println("삭제하려면 아무 키나 입력 0. 돌아가기 ");
				String str = scan.nextLine();
				if(str.equals("0")) {
					break;
				} else {
					ProductAdminDTO[] tempDtos = new ProductAdminDTO[adminDtos.length-1];
					int count =0;
					for (int i=0; i<adminDtos.length; i++) {
						if(i!=(arr[temp-1])) {
							tempDtos[count]=adminDtos[i];
							count++;
						}
					}
					displays(tempDtos);;
					adminDtos=tempDtos;
				}
			}
		}
		return adminDtos;
	}
}
