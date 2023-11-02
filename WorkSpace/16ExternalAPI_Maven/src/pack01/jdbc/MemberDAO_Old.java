package pack01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO_Old {
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

	public void selectMember() {
		if (isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("select * from member");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getString("id") + " " + rs.getString("pw"));
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public void insertMember(String id, String pw) {
		if (isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("INSERT into member values(?, ?)");
				ps.setString(1, id);
				ps.setString(2, pw);
				int result = ps.executeUpdate();
				System.out.println(conn.getAutoCommit());
				System.out.println(result);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public void updateMember(String id, String pw) {
		if (isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("update member set pw = ? where id = ?");
				ps.setString(1, pw);
				ps.setString(2, id);
				int result = ps.executeUpdate();
				System.out.println(conn.getAutoCommit());
				System.out.println(result);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
