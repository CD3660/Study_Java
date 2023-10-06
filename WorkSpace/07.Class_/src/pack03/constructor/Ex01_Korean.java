package pack03.constructor;

public class Ex01_Korean {
	
	String nation = "대한민국";//전역변수, 인스턴스 멤버, 인스턴스 변수, 필드
	String name;//이름
	String ssn;//주민등록번호
	public Ex01_Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
