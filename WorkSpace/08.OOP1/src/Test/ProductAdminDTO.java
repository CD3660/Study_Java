package Test;

public class ProductAdminDTO {
// 상품 정보, 순번, 이름, 가격, 구매 횟수
	private String id, pw;

	public ProductAdminDTO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
}
