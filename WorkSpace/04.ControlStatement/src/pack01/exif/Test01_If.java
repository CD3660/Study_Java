package pack01.exif;

public class Test01_If {
	public static void main(String[] args) {
		int num = 11;
		System.out.println("num의 값은 : "+num+" 입니다.");
		if (num%2 == 0) {
			System.out.println("해당 숫자 "+num + " 은 짝수입니다.");
		}
		if (num%2 == 1) {
			System.out.println("해당 숫자 "+num + " 은 홀수입니다.");
		}
	}
}
