package exam.testextends2;

public class SubClass extends SuperClass {
	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		if (b != 0) {
			return a / b;
		} else {
			return 0;
		}
	}

	@Override
	public int sum(int a, int b) {
		
		return super.sum(a, b)+1;
	}

	public SubClass() {
		System.out.println("자식 클래스 생성자");
	}
}
