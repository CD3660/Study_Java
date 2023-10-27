package pack04.test1;

public class MemberService {
	public boolean login(String userId, String userPw) {
		if(userId.equals("hong")&&userPw.equals("1234")) {
			return true;
		}
		return false;
	}

	public void logout(String userId) {
		System.out.println("\""+userId + "\"님이 로그아웃되었습니다.");
		
	}
}
