package pack02.testinterface;

public class ProductDAO implements ProductInterface {
	
	@Override
	public ProductDTO[] initDtos() {
		ProductDTO[] dtos = new ProductDTO[5];
		dtos[0] = new ProductDTO(1, 10000, "마우스");
		dtos[1] = new ProductDTO(2, 15000, "키보드");
		dtos[2] = new ProductDTO(3, 120000, "모니터");
		dtos[3] = new ProductDTO(4, 5000, "마이크");
		dtos[4] = new ProductDTO(5, 12000, "헤드셋");
		return dtos;
	}

	@Override
	public void display(ProductDTO[] dtos) {
		System.out.println(COMPANY_NAME);
		for (int i = 0; i < dtos.length; i++) {
			System.out.println(dtos[i].getNum() + ". " + dtos[i].getName() + " " + dtos[i].getPrice() + "원");
		}
	}

}
