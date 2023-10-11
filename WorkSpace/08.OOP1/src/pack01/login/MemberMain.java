package pack01.login;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		MemberDTO dto = new MemberDTO();
		MemberDAO dao = new MemberDAO();
		
		dto.id = scan.nextLine();
		dto.pw = scan.nextLine();
		
		if (dao.loginCheck(dto)) {
			System.out.println("화면 전환");
		} else {
			System.out.println("화면 새로고침");
		}
		scan.close();
	}
}
