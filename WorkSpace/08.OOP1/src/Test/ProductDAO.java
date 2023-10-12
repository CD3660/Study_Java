package Test;

import java.util.Scanner;

public class ProductDAO {
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
	
}
