package pack02.cdsqlplus;

import java.sql.*;

public class CDSqlDAO {
	private Connection conn;// 연결 객체
	private PreparedStatement ps;// 실행 객체
	private ResultSet rs;// 결과 객체

	public boolean checkConnection(String user, String password) {
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", user, password);
			if (!conn.isClosed()) {
				System.out.println("다음에 접속됨:");
				System.out.println(conn.getMetaData().getDatabaseProductVersion());
				return true;
			}
		} catch (SQLException e) {
			System.out.println("ERROR:");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("알 수 없는 오류 발생");
		}
		return false;
	}

	public void sendSql(String sql) {
		try {
			if (conn == null && conn.isClosed()) {
				System.out.println("데이터베이스 연결이 끊겼습니다. 연결을 다시 확인 바랍니다.");
				return;
			}
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				for(int i=1; i<=rs.getMetaData().getColumnCount(); i++) {
					System.out.print(rs.getMetaData().getColumnLabel(i)+" ");
				}
				System.out.println();
				for(int i=1; i<=rs.getMetaData().getColumnCount(); i++) {
					System.out.print(rs.getString(i)+" ");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
