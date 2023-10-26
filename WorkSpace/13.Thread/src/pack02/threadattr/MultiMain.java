package pack02.threadattr;

import java.util.Scanner;

public class MultiMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Multi t = new Multi(inputNum());
		t.start();
		
	}

	public static int inputNum() {
		while (true) {
			System.out.println("숫자를 입력");
			try {
				int a = Integer.parseInt(sc.nextLine());
				return a;
			} catch (Exception e) {
			}
		}
	}
}
