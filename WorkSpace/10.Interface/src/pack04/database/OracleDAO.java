package pack04.database;

public class OracleDAO implements IDataAccessObject {
	String dbName = "Oracle";
	public void oracleMethod() {
		System.out.println("a");
	}
	
	@Override
	public void select() {
		System.out.println(dbName + "조회함");
		
	}

	@Override
	public void insert() {
		System.out.println(dbName + "추가함");
		
	}

	@Override
	public void update() {
		System.out.println(dbName + "수정함");
		
	}

	@Override
	public void delete() {
		System.out.println(dbName + "삭제함");
		
	}

}
