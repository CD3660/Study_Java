package pack01.exif;

public class Ex04_IfAndOr {
	public static void main(String[] args) {
		int num = 17;
		if (num%2 ==0) {
			if  (num%3 ==0) {
				System.out.println("짝수이며 3의 배수이다.");
			} else {
				System.out.println("짝수이며 3의 배수가 아니다.");
			}
		} else {
			if (num%3 ==0) {
				System.out.println("홀수이며 3의 배수이다.");
			} else {
				System.out.println("홀수이며 3의 배수가 아니다.");
			}
		}
	}
}
