package pack01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	private Connection conn;

	public boolean isConnection() {
		// url, user, password => properties파일에 접속정보를 파일로 저장하고 업로드 x
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hanul";
		String password = "0000";
		try {
			conn = DriverManager.getConnection(url, user, password);
			if (!conn.isClosed()) {
				System.out.println("연결성공");
				return true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public void closeConnection() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void memberDisplay( ArrayList<MemberDTO> list) {
		if(list==null || list.size()==0) {
			System.out.println("조회된 데이터가 없습니다.");
			return;
		}
		for (MemberDTO dto : list) {
			System.out.println(dto.id+" "+dto.pw);
		}
	}
	
	public ArrayList<MemberDTO> selectMember() {
		ArrayList<MemberDTO> list = new ArrayList<>();
		if (isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("select * from member");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					list.add(new MemberDTO(rs.getString("id"), rs.getString("pw")));	
				}
				return list;
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} finally {
				closeConnection();
			}
		}
		return list;
	}

	public void insertMember(MemberDTO dto) {
		if (isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("INSERT into member values(?, ?)");
				ps.setString(1, dto.id);
				ps.setString(2, dto.pw);
				int result = ps.executeUpdate();
				System.out.println(result);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} finally {
				closeConnection();
			}
		}
	}

	public void updateMember(MemberDTO dto) {
		if (isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("update member set pw = ? where id = ?");
				ps.setString(1, dto.pw);
				ps.setString(2, dto.id);
				int result = ps.executeUpdate();
				System.out.println(result);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} finally {
				closeConnection();
			}
		}
	}

	public void deleteMember(MemberDTO dto) {
		if (isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("delete from member where id=? and pw=?");
				ps.setString(1, dto.id);
				ps.setString(2, dto.pw);
				int result = ps.executeUpdate();
				System.out.println(result);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} finally {
				closeConnection();
			}
		}
	}

	public boolean isMember(MemberDTO dto) {
		if (isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("select * from member where id=?");
				ps.setString(1, dto.id);
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					System.out.println("이미 사용 중인 아이디 입니다.");
					return true;
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} finally {
				closeConnection();
			}
		}
		System.out.println("사용되지 않은 아이디 입니다.");
		return false;
	}
}
