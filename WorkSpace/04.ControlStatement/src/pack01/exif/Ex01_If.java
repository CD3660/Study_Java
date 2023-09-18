package pack01.exif;

public class Ex01_If {
	public static void main(String[] args) {
		int score = 100;
		if (score>=90) {
			System.out.println("90점 이상이여서 장학금 받음");
			System.out.println("if문 true시 실행이 됩니다.");
			if (score==100) {
				System.out.println("전교 1등입니다.");
			}
		}
		System.out.println("무조건 실행됨");
	}
}
