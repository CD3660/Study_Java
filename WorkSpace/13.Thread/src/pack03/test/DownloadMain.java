package pack03.test;

import java.util.Scanner;

public class DownloadMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String str = sc.nextLine();
			if(str.equals("-1")) {
				System.out.println("다운로드 프로그램 종료");
				break;
			}
			Download dl = new Download(str);
			dl.start();
		}
	}
}
