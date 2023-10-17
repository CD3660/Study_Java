package exam.changetp2;

public class Main {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.method1();
		parent.method2();
		System.out.println();
		parent = new Child2();
		parent.method1();
		parent.method2();
		System.out.println();
		parent = new Parent();
		parent.method1();
		parent.method2();
	}
}
