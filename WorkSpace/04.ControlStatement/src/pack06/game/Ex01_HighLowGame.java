package pack06.game;

import java.util.Random;
import java.util.Scanner;

public class Ex01_HighLowGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("High-Low게임입니다.");
		System.out.println("난이도를 선택하세요");
		System.out.println("1.쉬움 2.보통 3.어려움");
		String diff = scan.nextLine();
		int intdiff = Integer.parseInt(diff);
		if (intdiff == 2) {
			Random random = new Random();
			int ranNum = random.nextInt(1000) + 1;
			int count = 10;
			System.out.println("2. 보통\n1~1000 사이의 정수를 맞추세요! \n10회 제한!");
			while (true) {
				String str = scan.nextLine();
				int num = Integer.parseInt(str);
				count--;
				if (num == -1) {
					System.out.println("프로그램을 종료합니다.");
					break;
				} else if (num < ranNum) {
					System.out.println("High " + count + "회 남았습니다.");
				} else if (num > ranNum) {
					System.out.println("Low " + count + "회 남았습니다.");
				} else if (num == ranNum) {
					System.out.println("정답! 축하드립니다.");
					System.out.println("정답까지" + (10 - count) + "회");
					break;
				} else if (count == 0) {
					System.out.println("패배하셨습니다.");
					break;
				}
			}
		} else if (intdiff == 1) {
			Random random = new Random();
			int ranNum = random.nextInt(100) + 1;
			int count = 7;
			System.out.println("1. 쉬움\\n1~100 사이의 정수를 맞추세요! \n7회 제한!");
			while (true) {
				String str = scan.nextLine();
				int num = Integer.parseInt(str);
				count--;
				if (num < ranNum) {
					System.out.println("High " + count + "회 남았습니다.");
				} else if (num > ranNum) {
					System.out.println("Low " + count + "회 남았습니다.");
				} else if (num == ranNum) {
					System.out.println("정답! 축하드립니다.");
					System.out.println("정답까지" + (7 - count) + "회");
					break;
				} else if (num == -1) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}

				if (count == 0) {
					System.out.println("패배하셨습니다.");
					break;
				}
			}
		} else if (intdiff == 3) {
			Random random = new Random();
			int ranNum = random.nextInt(10000) + 1;
			int count = 10;
			System.out.println("3. 어려움\\n1~10000 사이의 정수를 맞추세요! \n10회 제한!");
			while (true) {
				String str = scan.nextLine();
				int num = Integer.parseInt(str);
				count--;
				if (num < ranNum) {
					System.out.println("High " + count + "회 남았습니다.");
				} else if (num > ranNum) {
					System.out.println("Low " + count + "회 남았습니다.");
				} else if (num == ranNum) {
					System.out.println("정답! 축하드립니다.");
					System.out.println("정답까지" + (10 - count) + "회");
					break;
				} else if (num == -1) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}

				if (count == 0) {
					System.out.println("패배하셨습니다.");
					break;
				}
			}
		}
	}
}
