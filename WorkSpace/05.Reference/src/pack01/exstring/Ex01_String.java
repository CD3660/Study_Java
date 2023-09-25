package pack01.exstring;

import java.util.Scanner;

public class Ex01_String {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = "CD";
		String str2 = "CD";		
		String str3 = scan.nextLine();
		System.out.println("str1 : "+ System.identityHashCode(str1));
		System.out.println("str2 : "+ System.identityHashCode(str2));
		System.out.println("str3 : "+ System.identityHashCode(str3));
		if (str1 == str2) {
			System.out.println("메모리 번지 수 같음");
		} else {
			System.out.println("메모리 번지 수 다름");
		}

		if (str1.equals(str2)) {
			System.out.println("값 같음");
		} else {
			System.out.println("값 다름");
		}
	}
}
