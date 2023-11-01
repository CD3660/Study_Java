package pack02.cdsqlplus;

import java.util.Scanner;

public class CDSqlMain {
	public static void main(String[] args) {
		CDSqlDAO dao = new CDSqlDAO();
		Scanner sc = new Scanner(System.in);

		int checkCount = 1;
		while (checkCount <= 1) {
			System.out.print("id:");
			String id = sc.nextLine();
			System.out.print("pw:");
			String pw = sc.nextLine();
			if(dao.checkConnection(id, pw)) {
				while(true) {
					System.out.print("SQL 입력 :");
					String sql = sc.nextLine();
					if(sql.equals("exit")) {
						System.out.println("사용종료");
						break;
					}
					dao.sendSql(sql);
				}
			}
			checkCount++;
		}
	}
}
