package tetete;

public class Main {
	public static void main(String[] args) {
		Parents[] ps = new Parents[2];
		ps[0] = new A("");
		ps[1] = new B("");
		
		for(int i=0; i<ps.length; i++) {
			method(ps[i]);
		}
		for(int i=0; i<ps.length; i++) {
			ps[i].methodS();
			ps[i].str = "바꾸기";
			ps[i].methodS();
		}
		A a = new A(null);
		String str = "asdfasdf";
		
		
	}
	public static void method(Parents p) {
		if(p instanceof A) {
			A a = (A) p;
			a.methodA();
		} else if(p instanceof B){
			B b = (B) p;
			b.methodB();
		} else {
			System.out.println("입력 오류");
		}
	}

	public static void method2(Parents p) {
		if(p instanceof A) {
			A a = (A) p;
			a.a = "asdfasdf";
		} else if(p instanceof B){
			B b = (B) p;
			b.arr = new int[100];
		}
	}
}
