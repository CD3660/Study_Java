package pack02.member;

public class MemberMain {
	public static void main(String[] args) {
		System.out.println(Member.sField);
		Member.sMethod();
		Member mem = new Member();
		System.out.println(mem.iField);
		mem.iMethod();
	}
}
