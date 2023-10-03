package quest01;

import java.util.Scanner;

public class Step02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		String str1 = scan.nextLine();
		System.out.println("두번째 숫자를 입력하세요.");
		String str2 = scan.nextLine();
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		String str3 = num1 < num2 ? "TRUE" : "FALSE";
		String str4 = num1 > num2 ? "TRUE" : "FALSE";
		String str5 = num1 == num2 ? "TRUE" : "FALSE";
		System.out.println(num1 + "은 " + num2 + "보다 작습니다. " + str3);
		System.out.println(num1 + "은 " + num2 + "보다 큽니다. " + str4);
		System.out.println(num1 + "과 " + num2 + "은 같습니다. " + str5);

	}
}
