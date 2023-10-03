package quest03;

import java.util.Scanner;

public class Step03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char[] kakao = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			kakao[i] = str.charAt(i);
		}
		String[] spell = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < kakao.length - spell[i].length() + 1; j++) {
				if (numberChange(kakao, spell[i], j)) {
					for (int k = 0; k < spell[i].length(); k++) {
						if (k == 0) {
							kakao[j] = (char)(i+'0');
						} else {
							kakao[j + k] = 'a';
						}
					}
				}
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (kakao[i] == 'a') {
				continue;
			} else {
				System.out.print(kakao[i]);
			}
		}

	}

	public static boolean numberChange(char[] Arr, String str, int t) {
		char[] chars = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			chars[i] = str.charAt(i);
		}
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Arr[i + t] == chars[i]) {
				count++;
			}
		}
		if (count == str.length()) {
			return true;
		} else {
			return false;
		}
	}
}
