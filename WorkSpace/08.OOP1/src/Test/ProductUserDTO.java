package Test;

public class ProductUserDTO {

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
		// if(id.contains(" ")) {
		// System.out.println("아이디를 다시입력해주세요");
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.contains(" ")) {
			this.name = name;
		} else {
			System.out.println("공백이있습니다!");
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.contains("@") && !email.contains(" ")) {
			this.email = email;

		} else {
			System.out.println("email을 다시 입력해주세요");
		}
	}

	public int getPoint() {

		return point;
	}

	public void setPoint(int point) {
//	       if(point>=1000){
//	         
//	      }else{
//	         System.out.println("1000이상부터 사용할수 있습니다.");
//	      }
		this.point = point;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {

		this.tel = tel;
	}

	// 개인정보 - 아이디,이름, 비밀번호, 주소, 연락처, 이메일, 포인트 잔액
	String id, pw, adress, name, email, tel;
	int point;

	public ProductUserDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
		this.name="";
		this.email="";
		this.adress="";
		this.tel="";
		this.point=0;
	}
}