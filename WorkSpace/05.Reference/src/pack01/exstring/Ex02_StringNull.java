package pack01.exstring;

import java.util.Scanner;

public class Ex02_StringNull {
	public static void main(String[] args) {
		
		Scanner scan = null;
		String str1 = new String("A");
		String str2 = new String("A");
//		if (scan != null) {
//			scan.nextLine();
//		}
//		if (null != scan) {
//			scan.nextLine();
//		}
		if (str1 == str2) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}
}
