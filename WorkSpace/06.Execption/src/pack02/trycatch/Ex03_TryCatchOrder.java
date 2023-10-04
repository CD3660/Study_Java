package pack02.trycatch;

public class Ex03_TryCatchOrder {
	public static void main(String[] args) {

		try {
			String str = "숫자";
			int num = Integer.parseInt(str);
			System.out.println(str);
			System.out.println(0 / 0);
		} catch (NumberFormatException e) {
			System.out.println("문자열 숫자 변경 오류입니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눠서 오류입니다.");
		} catch (NullPointerException e) {
			System.out.println("Null 오류입니다.");
		} catch (Exception e) {
			System.out.println("그 외 오류입니다.");
		} finally {
			System.out.println("프로그램 종료");
		}

	}
}
