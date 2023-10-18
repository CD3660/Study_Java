package exam.testprotected2;

import exam.testprotected1.A;
import exam.testprotected1.B;

public class Main extends A{
	int protected_field4;
	public Main() {
		this.protected_field4 = super.protected_field4;
	}
	public static void main(String[] args) {
		B b = new B();
		int num = b.rtnAfield();
	}
}
