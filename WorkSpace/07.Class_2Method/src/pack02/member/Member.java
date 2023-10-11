package pack02.member;

public class Member {
	int iField;
	static int sField;
	public void iMethod() {
		System.out.println(iField + "인스턴스 메소드" + sField);
	}
	public void iMethod(int param) {
		System.out.println("파라미터 1개");
	}
	public void iMethod(String param) {
		System.out.println("스트링 파리미터");
	}
	public void iMethod(String param, int a) {
		System.out.println("String, int");
	}
	public static void sMethod() {
		System.out.println("스태틱 메소드"+sField);
	}
}
