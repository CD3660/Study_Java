package pack02.Switch;

public class Ex01_SwitchCase {
	public static void main(String[] args) {
		int num=10;
		switch (num%2) {
		case 0:
			System.out.print("짝수 ");
			break;
		case 1:
			System.out.print("홀수 ");
			break;
		}
		
		switch (num%3) {
		case 0:
			System.out.println("3배수");
			break;
		case 1:
			System.out.println("3배수x");
			break;
		}
	}
}
