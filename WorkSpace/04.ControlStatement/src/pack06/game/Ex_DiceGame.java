package pack06.game;

import java.util.Random;
import java.util.Scanner;

public class Ex_DiceGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("PC가 주사위를 굴립니다.");
			scan.nextLine();
			int pcNum = dice();
			System.out.println("user의 주사위를 굴립니다.");
			scan.nextLine();
			int userNum = dice();
			if (pcNum > userNum) {
				System.out.println("패배");
			} else if (pcNum < userNum) {
				System.out.println("승리");
			} else {
				System.out.println("무승부");
			}

		}
	}

	static int dice() {
		Random ran = new Random();
		int x;
		x = ran.nextInt(6) + 1;
		return x;
	}
}
