package quest02;

import java.util.Scanner;

public class Step01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("입력 된 데이터 : ");
			String str = scan.nextLine();
			int num = Integer.parseInt(str);
			System.out.print("비교 후 데이터 : ");
			if (num == 1 || num == 3) {
				System.out.println("남자 입니다.");
			} else if (num == 2 || num == 4) {
				System.out.println("여자 입니다.");
			} else {
				System.out.println("입력 오류 입니다.");
				break;
			}
			System.out.println();
		}

	}
}
