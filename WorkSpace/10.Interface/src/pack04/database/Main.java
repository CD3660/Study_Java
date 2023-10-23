package pack04.database;

public class Main {
	public static void main(String[] args) {
		IDataAccessObject dao = new OracleDAO();
		
		if(dao instanceof OracleDAO) {
			OracleDAO tempDao = (OracleDAO) dao;
			tempDao.oracleMethod();
		}
		
		dao.update();
		dao.delete();
		dao.insert();
		dao.select();
	}
}
