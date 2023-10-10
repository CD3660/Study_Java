package pack01.method;

public class Calculator {
	public void plus(int a, int b) {
		System.out.println(a+b);
	}
	public void minus(int a, int b) {
		System.out.println(a-b);
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		if (b==0) {
			return 0;
		}
		return a/b;
	}
}
