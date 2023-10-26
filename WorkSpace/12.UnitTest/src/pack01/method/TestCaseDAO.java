package pack01.method;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class TestCaseDAO {
	@Timeout(1000)
	@DisplayName("DAO의 method")
	@Test
	void testMethod() {
		//given
		DAO dao = new DAO();
		
		//should
		//if(dao!=null)
		
		//when
		int result = dao.method(5, 6);
		
		//then
		assertEquals(11, result);
	}
	
}
