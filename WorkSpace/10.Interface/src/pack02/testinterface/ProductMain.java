package pack02.testinterface;

public class ProductMain {
	public static void main(String[] args) {
		ProductDAO dao = new ProductDAO();
		ProductDTO[] dtos = dao.initDtos();
		dao.display(dtos);
	}
}
