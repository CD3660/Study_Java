package pack01.ojdbc;

import java.sql.*;
import java.util.*;

public class Ex01_Connection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
//			//oracle.jdbc.driver.OracleDriver
//			try {
//				Class.forName("oracle.jdbc.driver.OracleDriver");
//			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
//			}
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hanul";
			String pw = "0000";
			Connection conn = DriverManager.getConnection(url, user, pw);
			System.out.print("ID : ");
			String id1 = sc.nextLine();
			System.out.print("PW : ");
			String pw1 = sc.nextLine();
			
			String sql = "select id, pw from member where id = ? and pw = ?";
			PreparedStatement ps = conn
					.prepareStatement(sql);
			ps.setString(1, id1);
			ps.setString(2, pw1);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {// 레코드의 아래줄로 이동한다. 가능하다면 true를 반환
				System.out.println(rs.getString("id"));
				System.out.println("로그인 성공");
			}

//			if (!conn.isClosed()) {// isClosed 는 연결이 닫혀있는지 체크, 반전하면 연결 된 경우를 말함.
//				System.out.println("성공");
//			} else {
//				System.out.println("실패");
//			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
