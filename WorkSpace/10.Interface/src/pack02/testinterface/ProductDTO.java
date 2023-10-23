package pack02.testinterface;

public class ProductDTO {
	private int num, price;
	private String name;

	public ProductDTO(int num, int price, String name) {
		super();
		this.num = num;
		this.price = price;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
