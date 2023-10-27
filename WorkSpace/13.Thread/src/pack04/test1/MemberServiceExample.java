package pack04.test1;

import java.util.Scanner;

public class MemberServiceExample {
	public static void main(String[] args) { // 결과 (hong ,12345입력) 결과(1.2 입력)
		Scanner scan = new Scanner(System.in); // 로그인 되었습니다. id 또는 password가 올바르지 않습니다.
		MemberService memberService = new MemberService(); // 로그아웃 되었습니다.
		String userId = scan.nextLine();

		String userPw = scan.nextLine();

		if (memberService.login(userId, userPw)) {
			System.out.println("로그인 되었습니다.");
			memberService.logout(userId);
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}