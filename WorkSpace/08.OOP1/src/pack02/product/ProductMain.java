package pack02.product;

public class ProductMain {
	public static void main(String[] args) {
		ProductDAO dao = new ProductDAO();
		ProductDTO[] dtos = dao.selectRead();
		
		dao.displays(dtos);
		dtos=dao.delete(dtos);
		
	}
}
