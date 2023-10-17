package exam.testextends2;

public class ExtendsMain {
	public static void main(String[] args) {
		SubClass sub = new SubClass();
		System.out.println(sub.sum(5, 2));
		System.out.println(sub.minus(5, 2));
		System.out.println(sub.mul(5, 2));
		System.out.println(sub.div(5, 2));
	}
}
