package pack02.member;

public class MemberMain {
	public static void main(String[] args) {

		Member mem = new Member();

		mem.iMethod();
		mem.iMethod(0);
		mem.iMethod("문자");
		mem.iMethod("문자", 1);
	}
}
