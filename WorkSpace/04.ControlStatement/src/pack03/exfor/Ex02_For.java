package pack03.exfor;

public class Ex02_For {
	public static void main(String[] args) {
		//if를 이용한 홀짝
		for (int i=1; i<=20; i++) {
			System.out.print(i + " ");
			if (i%2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		}
		
		//switch를 이용한 홀짝
		for (int i=1; i<=20; i++) {
			System.out.print(i + " ");
			switch (i%2) {
			case 0: 
				System.out.println("짝수");
				break;
			case 1:
				System.out.println("홀수");
			}
		}
	}
}
