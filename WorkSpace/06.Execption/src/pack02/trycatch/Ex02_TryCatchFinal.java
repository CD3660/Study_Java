package pack02.trycatch;

public class Ex02_TryCatchFinal {
	public static void main(String[] args) {
		String str ="숫자";
		try {
			System.out.println("코드1");
			System.out.println("코드2");
		} catch (Exception e) {
			System.out.println("예외 발생");
		} finally {
			System.out.println("코드4");			
		}
	}
}
