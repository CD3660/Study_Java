package pack05.etc;

public class Ex01_Break {
	public static void main(String[] args) {
		int i=0;
		while (true) {
			System.out.println("브레이크로 제어문 중지");
			break;
		}
		
		while(true) {
			System.out.println("while 실행중"+i);
			if (i==999) {
				break;
			}
			i++;
		}
	}
}
