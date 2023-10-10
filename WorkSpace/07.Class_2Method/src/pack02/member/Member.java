package pack02.member;

public class Member {
	int iField;
	static int sField;
	public void iMethod() {
		System.out.println(iField + "인스턴스 메소드" + sField);
	}
	public static void sMethod() {
		System.out.println("스태틱 메소드"+sField);
	}
}
