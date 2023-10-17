package exam.testextends2;

public class SuperClass {
	public int sum(int a, int b) {
		return a + b;
	}
	public int minus(int a, int b) {
		return a - b;
	}
	public SuperClass() {
		System.out.println("부모 클래스 생성자");
	}
}
