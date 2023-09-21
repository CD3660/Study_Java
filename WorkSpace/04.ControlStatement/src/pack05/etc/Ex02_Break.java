package pack05.etc;

import java.util.Scanner;

public class Ex02_Break {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String inputData = scan.nextLine();
		
		System.out.println("입력 값 : " + inputData);
		
		System.out.println("아이디를 입력해주세요");
		String userId = scan.nextLine();
		System.out.println("비밀번호를 입력해주세요");
		String userPw = scan.nextLine();
		System.out.println("입력 된 정보 " + userId + " " + userPw);
	}
}
