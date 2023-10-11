package pack01.login;

public class MemberDAO {
	MemberDTO dto = new MemberDTO();

	public boolean loginCheck(MemberDTO dto) {
		dto.idPw.put("admin", "admin1234");

		if (dto.idPw.containsKey(dto.id) && dto.idPw.get(dto.id).equals(dto.pw)) {
			System.out.println("로그인 되었습니다.");
			return true;
		}
		System.out.println("아이디 또는 비밀번호 확인");
		return false;
	}
}
