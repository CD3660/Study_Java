package exam.testprotected1;

public class B extends A{
	public B() {
	}
	public void initA() {
		A a = new A();
		a.protected_field4 = 1;
	}
	public A rtnA() {
		return new A();
	}
	public int rtnAfield() {
		A a = new A();
		return a.protected_field4;
	}
}
