package Test;

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ProductDAO dao = new ProductDAO();
		ProductDTO dto = new ProductDTO();
		ProductUserDAO userDao = new ProductUserDAO();
		ProductAdminDAO adminDao = new ProductAdminDAO();
		while (true) {
			dto.mode = dao.chooseMode();
			if (dto.mode == 3) {
				break;
			} else if (dto.mode == 1) {
				if (userDao.userLogin()) {

				}
			} else if (dto.mode == 2) {
				if (adminDao.adminLogin()) {
					ProductAdminDTO[] adminDtos = adminDao.productList();
					while (true) {
						adminDao.displays(adminDtos);
						dto.adminMenu = adminDao.selectAdminMenu();
						if (dto.adminMenu == 4) {
							break;
						} if (dto.adminMenu ==0) {
							adminDao.dtoSortMethod(adminDtos);
						} if (dto.adminMenu ==1) {
							adminDtos=adminDao.addProduct(adminDtos);
						}
					}
				}
			}
		}
	}
}
