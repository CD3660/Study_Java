package pack01.method;

import java.util.Random;

public class DAO {
	Random ran = new Random();
	public void method(int a) {
		System.out.println(a);
	}
	public int method(int a, int b) {
		System.out.println(a+b);
		return a+b;
	}
	public String method2(int a) {
		return a+"";
	}
	public int method3() {
		return ran.nextInt(10);
	}
}
