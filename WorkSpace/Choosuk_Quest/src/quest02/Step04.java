package quest02;

import java.util.Scanner;

public class Step04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 된 데이터 : ");
		String str = scan.nextLine();
		int iData = Integer.parseInt(str);
		System.out.print("출력 데이터 : ");
		for (int i = 0; i<iData; i++) {
			System.out.print(iData-i+" , ");
		}
		System.out.println();
		String star = "★";
		for (int i = 0; i<iData; i++) {
			System.out.println(star);
			star +="★";
		}
	}
}
