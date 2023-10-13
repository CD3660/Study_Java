package Test;

public class ProductDTO {
	int mode;
	private String name;
	private int index, price, sellCount;

	
	public ProductDTO(int index, String name, int price) {
		super();
		this.name = name;
		this.index = index;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price<0) {
			System.out.println("상품 가격 오류!");
		}else {
			this.price = price;
		}
	}
	public int getSellCount() {
		return sellCount;
	}
	public void setSellCount(int sellCount) {
		this.sellCount = sellCount;
	}
}
