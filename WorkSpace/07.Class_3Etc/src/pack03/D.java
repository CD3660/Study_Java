package pack03;

import pack01.A;

public class D {
	A a = new A();
	pack03.A aa = new pack03.A();
	
	public D publicD = new D();
	D defaultD = new D(0);
	private D privateD = new D("글");
	
	
	public D() {
		System.out.println("public 생성자 : 파라메터 없음");
	}

	D(int a) {
		System.out.println("default 생성자 : 파라메터 int" + a);
	}
	private D(String str) {
		System.out.println("default 생성자 : 파라메터 String" + str);
	}
}
