package tetete;

public class A extends Parents {
	String a;
	int b;
	public void methodA() {
		System.out.println(a);
	}
	public A(String str) {
		super(str);
		this.str = "슈퍼A";
		this.a = "A";
		this.b = 100;
	}
	
}
