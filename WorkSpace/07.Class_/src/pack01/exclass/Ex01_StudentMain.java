package pack01.exclass;

public class Ex01_StudentMain {
	public static void main(String[] args) {
		System.out.println("시작점");
		Ex01_Student es = new Ex01_Student();
		Ex01_Student cd = null;
		
		if (es==cd) {
			System.out.println("o");
		} else {
			System.out.println("x");
		}
	}
}
