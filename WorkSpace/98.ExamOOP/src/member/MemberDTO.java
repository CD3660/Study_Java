package member;

public class MemberDTO {
	private String id, pw, name, nickName;
	private int money;
	private boolean isAdmin;
	
	public MemberDTO(String id, String pw, String name, String nickName) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nickName = nickName;
	}
	
	public MemberDTO(String id, String pw, String name, String nickName, boolean isAdmin) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nickName = nickName;
		this.isAdmin = isAdmin;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
}
