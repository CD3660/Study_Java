package pack02.product;

public class ProductDTO {
	private int num;
	private int price;
	private String name;

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
		if (price >= 0) {
			this.price = price;
		} else {
			this.name = "금액 입력 오류";
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ProductDTO(int num, int price, String name) {
		super();
		this.num = num;
		this.price = price;
		this.name = name;
	}
}
