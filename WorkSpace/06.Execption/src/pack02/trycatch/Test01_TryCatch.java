package pack02.trycatch;

import java.util.Scanner;

public class Test01_TryCatch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.println("숫자를 입력하세요");
			String str = scan.nextLine();
			try {
				int num = Integer.parseInt(str);
				if (num == -1) {
					break;
				}
				sum += num;
				System.out.println("합 : "+ sum);
			} catch (Exception e) {
				System.out.println("잘못 된 입력!");
			}
		}
		System.out.println("프로그램 종료");
	}
}
