package pack02.product;

public class ProductDAO {
	public void display(ProductDTO dto) {
		System.out.println(dto.getNum() + ". " + dto.getName() + " " + dto.getPrice() + "원");
	}
	public void displays(ProductDTO[] dtos) {
		for (int i=0; i<dtos.length; i++) {
			display(dtos[i]);
		}
	}
}
