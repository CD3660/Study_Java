package pack02.product;

public class ProductMain {
	public static void main(String[] args) {
		ProductDTO[] dtos = new ProductDTO[5];
				
		dtos[0] = new ProductDTO(1, 15000, "스카프");
		dtos[1] = new ProductDTO(2, 1000, "마늘");
		dtos[2] = new ProductDTO(3, 66000, "커피");
		dtos[3] = new ProductDTO(4, 6000, "피");
		dtos[4] = new ProductDTO(5, 6600, "커");
		ProductDAO dao = new ProductDAO();
		dao.displays(dtos);
	}
}
