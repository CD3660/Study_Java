package junit.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pack01.jdbc.MemberDAO;
import pack01.jdbc.MemberDTO;

class TestMemberDAO {

	@DisplayName("연결 테스트")
//	@Test
	void connTest() {
		MemberDAO dao = new MemberDAO();
		assertTrue(dao.isConnection());
	}
	
	@DisplayName("멤버 테이블 조회")
//	@Test
	void selectMemberTest() {
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> list = dao.selectMember();
		assertTrue(list.size()!=0);
	}
	
	@DisplayName("멤버 테이블 출력")
//	@Test
	void displayTest() {
		MemberDAO dao = new MemberDAO();
		dao.memberDisplay(dao.selectMember());
	}
	
	@DisplayName("멤버 테이블 입력")
//	@Test
	void insertMemberTest() {
		MemberDAO dao = new MemberDAO();
		dao.insertMember(new MemberDTO("12345","123456"));
	}
	
	@DisplayName("멤버 테이블 수정")
//	@Test
	void updateMemberTest() {
		MemberDAO dao = new MemberDAO();
		dao.updateMember(new MemberDTO("12345","00000"));
	}
	
	@DisplayName("멤버 테이블 삭제")
//	@Test
	void deleteMemberTest() {
		MemberDAO dao = new MemberDAO();
		dao.deleteMember(new MemberDTO("12345","00000"));
	}
	
	@DisplayName("멤버 테이블 중복 확인")
	@Test
	void isMemberTest() {
		MemberDAO dao = new MemberDAO();
		dao.isMember(new MemberDTO("12345","123456"));
	}
}
