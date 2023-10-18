package exam.testprotected1;

public class A {
	public int public_field1;
	int default_field2;
	private int private_field3;
	protected int protected_field4;
	
	protected A() {
		System.out.println("생성자 메소드를 public -> protected");
	}
	
	
}
