package pack01.exceptioncode;

public class Ex02_Number {
	public static void main(String[] args) {
		String str = "asdf";
			
			int num = Integer.parseInt(str);

		int zero = 0;
		if (zero != 0) {
			System.out.println(10 / zero);
		}
	}
}
